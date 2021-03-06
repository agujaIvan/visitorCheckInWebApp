package edu.matc.controller;

import edu.matc.entity.ibatis.ClassTable;
import edu.matc.entity.ibatis.JoinedSectionTable;
import edu.matc.entity.ibatis.UserTable;
import edu.matc.persistence.IbatisJava;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(
        name = "LoginServlet",
        urlPatterns = {"/loginServlet"}
        )
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String userPassword = request.getParameter("userPassword");
        String url = null;
        SessionInfo sessionInfo = new SessionInfo(request);


        IbatisJava ibatisJava = new IbatisJava();
        List<UserTable> userTableList = new ArrayList<>();
        userTableList = ibatisJava.getUserByIdAndPassword(userName, userPassword);

        if (userTableList.size() == 1){

            UserTable currentUser = new UserTable();
            currentUser = userTableList.get(0);

            if (currentUser.getUserRole().equals("administrator") || currentUser.getUserRole().equals("teacher")) {
                url = "jsp/adminPortal.jsp";

                sessionInfo.removeAttribute("message");

            } else if (currentUser.getUserRole().equals("dancer")) {

                List<? super JoinedSectionTable> listOfSections = ibatisJava.getAllRecords("SectionTable.getAllJoinUserClassAndStyleTables", null);
                request.setAttribute("listOfSections", listOfSections);

                url = "jsp/chooseSection.jsp";
            }

            //adding the user to the session
            sessionInfo.createAttribute("user", currentUser);

        } else {
            sessionInfo.createAttribute("notFound", "user wasnt found, try it again");

            url = "jsp/login.jsp";

        }
        request.getRequestDispatcher(url).forward(request, response);
    }


}
