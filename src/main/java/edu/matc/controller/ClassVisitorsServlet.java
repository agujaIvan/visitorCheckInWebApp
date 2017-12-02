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
        JoinedSectionTable joinedSectionTable = new JoinedSectionTable();
        IbatisJava ibatisJava = new IbatisJava();
        Integer id = null;

        if (signIn == null || signIn.equals("")) {

            /*assigning the section id to the object and getting it from the database */
            joinedSectionTable.setIdSectionTable(Integer.parseInt(idSectionTable));
            joinedSectionTable = (JoinedSectionTable) ibatisJava.getRecordById("SectionTable.getSectionByIdJoinUserClassAndStyleTables",
                    joinedSectionTable);

            //putting the section in a session attribute
            sessionInfo.createAttribute("sectionVisitors", joinedSectionTable);
            id = Integer.parseInt(idSectionTable);
        } else {
            UserTable userTable = new UserTable();
            joinedSectionTable = (JoinedSectionTable) sessionInfo.getAttribute("sectionVisitors");
            userTable = (UserTable) sessionInfo.getAttribute("user");
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
        }

        //getting the list of visitors already expected
        List<? super JoinedVisitorsTable> listOfVisitors = ibatisJava.getAllRecords("VisitorsTable.getAllVisitorsBySectionId",id);

        //putting the list of visitors in a request attribute
        request.setAttribute("listOfVisitors", listOfVisitors);

        //forwarding the flow to a jsp page
        String url = "jsp/ClassVisitors.jsp";
        request.getRequestDispatcher(url).forward(request, response);
    }
}
