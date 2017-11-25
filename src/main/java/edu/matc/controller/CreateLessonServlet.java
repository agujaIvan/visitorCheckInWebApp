package edu.matc.controller;

import edu.matc.entity.ibatis.ClassTable;
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
import java.util.ArrayList;
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

        String category = request.getParameter("category");
        String startTime = request.getParameter("from");
        String endTime = request.getParameter("to");
        String startDate = request.getParameter("startDate");
        String endDate = request.getParameter("endDate");

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

        classTable.setClassDays(selectedDay);
        classTable.setIdStyleTable(Integer.parseInt(category));
        classTable.setClassStartTime(Time.valueOf(startTime));
        classTable.setClassEndTime(Time.valueOf(endTime));
        classTable.setClassStartDate(Date.valueOf(startDate));
        classTable.setClassEndDate(Date.valueOf(endDate));

        ibatisJava.addRecord("Class.insert", classTable);
        String url = "jsp/administrator.jsp";
        response.sendRedirect(url);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        IbatisJava ibatisJava    = new IbatisJava();
        SessionInfo sessionInfo  = new SessionInfo(request);

        List<? super StyleTable> styleList = ibatisJava.getAllRecords("StyleTable.getAll");
        List<? super UserTable> listOfUsers= ibatisJava.getAllRecords("User.getAllTeachersAndAdmins");

        sessionInfo.createAttribute("listOfStyles", styleList);
        sessionInfo.createAttribute("listOfUsers", listOfUsers);

        String url = "jsp/createLessonClass.jsp";
        //request.getRequestDispatcher("jsp/createLessonClass.jsp").forward(request, response);
        response.sendRedirect(url);

    }
}
