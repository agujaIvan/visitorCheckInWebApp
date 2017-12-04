package edu.matc.controller;

import edu.matc.entity.ibatis.JoinedSectionTable;
import edu.matc.entity.ibatis.JoinedVisitorsTable;
import edu.matc.entity.ibatis.UserTable;
import edu.matc.entity.ibatis.VisitorsTable;
import edu.matc.persistence.IbatisJava;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

@WebServlet(name = "ClassVisitorsServlet",
        urlPatterns = {"/ClassVisitorsServlet"})

public class ClassVisitorsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idSectionTable = request.getParameter("id");
        String signIn = request.getParameter("signIn");
        SessionInfo sessionInfo = new SessionInfo(request);
        JoinedSectionTable joinedSectionTable = new JoinedSectionTable();
        IbatisJava ibatisJava = new IbatisJava();
        Integer id = null;
        String checkForRemove = request.getParameter("remove");
        Boolean userInSection = false;
        UserTable userTable = new UserTable();
        userTable = (UserTable) sessionInfo.getAttribute("user");

        if (signIn == null || signIn.equals("")) {

            /*assigning the section id to the object and getting it from the database */
            joinedSectionTable.setIdSectionTable(Integer.parseInt(idSectionTable));
            joinedSectionTable = (JoinedSectionTable)
                    ibatisJava.getRecordById("SectionTable.getSectionByIdJoinUserClassAndStyleTables",joinedSectionTable);

            //putting the section in a session attribute
            sessionInfo.createAttribute("sectionVisitors", joinedSectionTable);
            id = Integer.parseInt(idSectionTable);

            //adding data to the object to prepaid it for the query
            JoinedVisitorsTable visitor = new JoinedVisitorsTable();
            visitor.setIdSectionTable(joinedSectionTable.getIdSectionTable());
            visitor.setIdUserTable(userTable.getIdUserTable());

            //check if the user is already in the section
            List<? super JoinedVisitorsTable> visitorUser =
                    ibatisJava.getAllRecords("VisitorsTable.getUserByIdAndSectionId",visitor);
            if (visitorUser.size() >= 1){
                userInSection = true;
            }
            //todo make the process to delete the user from the list
            //checking if the user want to be removed from the section
            if (checkForRemove != null) {
                //int result = ibatisJava.deleteRecordById("VisitorTable.deleteUserByIdAndSectionId", visitor);
            }
        } else {
            joinedSectionTable = (JoinedSectionTable) sessionInfo.getAttribute("sectionVisitors");
            VisitorsTable visitorsTable = new VisitorsTable();
            Date dNow = new Date( );
            SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
             String dTime = ft.format(dNow);

            //assigning the values to the visitor object
            visitorsTable.setIdSectionTable(joinedSectionTable.getIdSectionTable());
            visitorsTable.setIdStatusTable(3);
            visitorsTable.setIdUserTable(userTable.getIdUserTable());
            visitorsTable.setWhenSignedIn(Timestamp.valueOf(dTime));

            //saving it to the database
            ibatisJava.addRecord("VisitorsTable.addNewRecord", visitorsTable);
            id = joinedSectionTable.getIdSectionTable();

            //user is on section
            userInSection = true;
        }


        //getting the list of visitors already expected
        List<? super JoinedVisitorsTable> listOfVisitors = ibatisJava.getAllRecords("VisitorsTable.getAllVisitorsBySectionId",id);

        //putting the list of visitors in a request attribute
        request.setAttribute("listOfVisitors", listOfVisitors);

        //setting up the attribute for change the button from sign in to remove
        if (userInSection == true) {
            request.setAttribute("isInSection", "yes");
        }


        //forwarding the flow to a jsp page
        String url = "jsp/ClassVisitors2.jsp";
        request.getRequestDispatcher(url).forward(request, response);
    }
}
