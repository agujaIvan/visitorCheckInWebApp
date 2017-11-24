package edu.matc.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/addingStatus"}
)

public class AddingStatus extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*StatusHibernateDao statusHibernateDao = new StatusHibernateDao();
        statusHibernateDao.addNewRecord("Active");*/
        /*if (req.getParameter("submit").equals("search")) {
            req.setAttribute("users", userDao.getUserByLastName(req.getParameter("searchTerm")));
        } else {
            req.setAttribute("users", userDao.getAllUsers());
        }*/

        //RequestDispatcher dispatcher = req.getRequestDispatcher("/result.jsp");
        //dispatcher.forward(req, resp);
        // testing the git
        String url = "/result.jsp";
        resp.sendRedirect(url);
    }
}