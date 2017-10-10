package edu.matc.controller;

import edu.matc.entity.UsertableEntity;
import edu.matc.persistence.GenderHibernateDao;

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

        GenderHibernateDao listOfUser = new GenderHibernateDao();
        List<UsertableEntity> userList = new ArrayList<>();
        userList = listOfUser.getUserByNameAndPassword(userName, userPassword);

    }

}
