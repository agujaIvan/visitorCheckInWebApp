package edu.matc.controller;

import edu.matc.entity.StyleEntity;
import edu.matc.persistence.HibernateDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(
        name = "StyleServlet",
        urlPatterns = {"/StyleServlet"}
)
public class StyleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String styleName = request.getParameter("styleName");
        StyleEntity style = new StyleEntity();
        HibernateDao styleDao = new HibernateDao();

        style.setStyleName(styleName);
        styleDao.addNewStyleRecord(style);

        HttpSession session = request.getSession();
        session.setAttribute("message", "style was successfully added");

        String url = "jsp/administrator.jsp";

        request.getRequestDispatcher(url).forward(request, response);
    }

}
