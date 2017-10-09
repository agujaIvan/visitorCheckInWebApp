package edu.matc.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/HomePageServlet"}
)
public class HomePageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String url = null;

        if (req.getParameter("submit").equals("registered")) {
            url = "jsp/login.jsp";
        } else {
            url ="index.jsp";
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher(url);
        dispatcher.forward(req, resp);

    }
}
