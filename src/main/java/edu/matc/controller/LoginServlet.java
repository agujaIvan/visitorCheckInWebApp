package edu.matc.controller;

import edu.matc.entity.UsertableEntity;
import edu.matc.persistence.UserHibernateDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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


        UserHibernateDao listOfUser = new UserHibernateDao();
        List<UsertableEntity> userList = new ArrayList<>();
        userList = listOfUser.getUserByNameAndPassword(userName, userPassword);



        if (userList.size() == 1){
            // creating the session
            //HttpSession session = request.getSession();

            UsertableEntity currentUser = new UsertableEntity();
            currentUser = userList.get(0);

            if (currentUser.getUserRole().equals("administrator")) {
                url = "jsp/administrator.jsp";
            } else if (currentUser.getUserRole().equals("dancer")) {
                url = "jsp/chooseSection.jsp";
            }

            /*
            //adding the user to the session
            session.setAttribute("user", currentUser);*/
            SessionInfo session = new SessionInfo("user", currentUser, request);
            //session.updateOrCreateSession();

            // Redirect the flow
            response.sendRedirect(url);
        } else {
            //url = "HomePageServlet";
            doGet(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {

        String url = "/jsp/login.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

}
