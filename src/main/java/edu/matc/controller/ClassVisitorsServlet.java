package edu.matc.controller;

import edu.matc.entity.ibatis.JoinedSectionTable;
import edu.matc.entity.ibatis.JoinedVisitorsTable;
import edu.matc.entity.ibatis.UserTable;
import edu.matc.entity.ibatis.VisitorsTable;
import edu.matc.persistence.IbatisJava;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        IbatisJava ibatisJava = new IbatisJava();
        Integer id = null;
        UserTable userTable = new UserTable();
        userTable = (UserTable) sessionInfo.getAttribute("user");
        JoinedSectionTable joinedSectionTable = new JoinedSectionTable();

        if (idSectionTable != null) {
            /*assigning the section id to the object and getting it from the database */
            joinedSectionTable.setIdSectionTable(Integer.parseInt(idSectionTable));
            joinedSectionTable = (JoinedSectionTable)
                    ibatisJava.getRecordById("SectionTable.getSectionByIdJoinUserClassAndStyleTables", joinedSectionTable);

            //putting the section in a session attribute
            sessionInfo.createAttribute("sectionVisitors", joinedSectionTable);
            id = Integer.parseInt(idSectionTable);


        } else {

            if (signIn != null) {

                //JoinedSectionTable joinedSectionTable = new JoinedSectionTable();
                joinedSectionTable = (JoinedSectionTable) sessionInfo.getAttribute("sectionVisitors");

                VisitorsTable visitorsTable = new VisitorsTable();
                Date dNow = new Date();
                SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String dTime = ft.format(dNow);

                //assigning the values to the visitor object
                visitorsTable.setIdSectionTable(joinedSectionTable.getIdSectionTable());
                visitorsTable.setIdStatusTable(3);
                visitorsTable.setIdUserTable(userTable.getIdUserTable());
                visitorsTable.setWhenSignedIn(Timestamp.valueOf(dTime));

                //saving it to the database
                ibatisJava.addRecord("VisitorsTable.addNewRecord", visitorsTable);
                id = joinedSectionTable.getIdSectionTable();

            } else {
                //adding data to the object to prepare it for the query
                joinedSectionTable =
                        (JoinedSectionTable) request.getSession().getAttribute("sectionVisitors");
                JoinedVisitorsTable visitor = new JoinedVisitorsTable();
                visitor.setIdSectionTable(joinedSectionTable.getIdSectionTable());
                visitor.setIdUserTable(userTable.getIdUserTable());

                JoinedVisitorsTable visitorUser =
                        (JoinedVisitorsTable) ibatisJava.getRecordById("VisitorsTable.getUserByIdAndSectionId", visitor);

                int result =
                        ibatisJava.deleteRecordById("VisitorsTable.deleteUserByIdAndSectionId", visitorUser.getIdVisitorsTable());
                id = joinedSectionTable.getIdSectionTable();
            }

        }

        //getting the list of visitors already expected
        List<? super JoinedVisitorsTable> listOfVisitors = ibatisJava.getAllRecords("VisitorsTable.getAllVisitorsBySectionId",id);

        //putting the list of visitors in a request attribute
        request.setAttribute("listOfVisitors", listOfVisitors);

        //check if the user is already in the section
        JoinedVisitorsTable visitor = new JoinedVisitorsTable();
        visitor.setIdSectionTable(id);
        visitor.setIdUserTable(userTable.getIdUserTable());
        List<? super JoinedVisitorsTable> visitorUser =
                ibatisJava.getAllRecords("VisitorsTable.getUserByIdAndSectionId", visitor);
        if (visitorUser.size() >= 1) {
            request.setAttribute("isInSection", "yes");
        }

        //forwarding the flow to a jsp page
        String url = "jsp/classVisitors.jsp";
        request.getRequestDispatcher(url).forward(request, response);
    }

}
