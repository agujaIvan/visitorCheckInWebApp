package edu.matc.controller;

import edu.matc.entity.ibatis.ClassTable;
import edu.matc.entity.ibatis.SectionTable;
import edu.matc.entity.ibatis.StyleTable;
import edu.matc.entity.ibatis.UserTable;
import edu.matc.persistence.IbatisJava;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@WebServlet(name = "CreateLessonServlet",
        urlPatterns = {"/CreateLessonServlet"}

)
public class CreateLessonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] day = new String[7];
        String selectedDay = "";
        ClassTable classTable = new ClassTable();
        IbatisJava ibatisJava = new IbatisJava();

        //List<? super SectionTable> Section = ibatisJava.getAllRecords("getTheLastClassId");

        String user = request.getParameter("user");
        String category = request.getParameter("category");
        String startTime = request.getParameter("from");
        String endTime = request.getParameter("to");
        String startDate = request.getParameter("classStartDate");
        String endDate = request.getParameter("classEndDate");

        day[0] = request.getParameter("chkSun");
        day[1] = request.getParameter("chkMon");
        day[2] = request.getParameter("chkTue");
        day[3] = request.getParameter("chkWed");
        day[4] = request.getParameter("chkThu");
        day[5] = request.getParameter("chkFri");
        day[6]= request.getParameter("chkSat");

        for (String currentItem: day) {
            if (currentItem != null) {
                selectedDay += currentItem + " ";
            }
        }

        selectedDay.trim();

        //adding the seconds to the time
        startTime = startTime.concat(":00");
        endTime = endTime.concat(":00");

        classTable.setIdUserTable(Integer.parseInt(user));
        classTable.setClassDays(selectedDay);
        classTable.setIdStyleTable(Integer.parseInt(category));
        classTable.setClassStartTime(Time.valueOf(startTime));
        classTable.setClassEndTime(Time.valueOf(endTime));
        classTable.setClassStartDate(Date.valueOf(startDate));
        classTable.setClassEndDate(Date.valueOf(endDate));

        ibatisJava.addRecord("Class.addNewRecord", classTable);

        /* getting the last id of class table and creating the sections according
        * with the days*/
        ClassTable classLastId = new ClassTable();
        classLastId = (ClassTable) ibatisJava.getRecordById("Class.getTheLastClassId", null);

        //putting the last id into the section class
        SectionTable sectionTable = new SectionTable();
        sectionTable.setIdClassTable(classLastId.getIdclassTable());

        //looping through to get the days and create each section with each day
        for (String currentItem: day) {
            if (currentItem != null) {
                sectionTable.setSectionDay(currentItem);
                sectionTable.setIdStatusTable(1);

                //adding the record into the database
                ibatisJava.addRecord("SectionTable.addNewRecord", sectionTable);
            }
        }
        //TODO add some type of notification informing it was added it
        String url = "jsp/administrator.jsp";
        request.getRequestDispatcher(url).forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        IbatisJava ibatisJava    = new IbatisJava();
        SessionInfo sessionInfo  = new SessionInfo(request);

        List<? super StyleTable> styleList = ibatisJava.getAllRecords("StyleTable.getAll", null);
        List<? super UserTable> listOfUsers= ibatisJava.getAllRecords("User.getAllTeachersAndAdmins", null);

        sessionInfo.createAttribute("listOfStyles", styleList);
        sessionInfo.createAttribute("listOfUsers", listOfUsers);

        String url = "jsp/createLessonClass.jsp";
        request.getRequestDispatcher(url).forward(request, response);


    }
}
