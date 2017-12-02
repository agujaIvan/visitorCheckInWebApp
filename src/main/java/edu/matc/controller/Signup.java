package edu.matc.controller;

import edu.matc.entity.ibatis.GenderTable;
import edu.matc.persistence.IbatisJava;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        urlPatterns = {"/signupPage"}
)
public class Signup extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        IbatisJava ibatisJava = new IbatisJava();
        List<? super GenderTable> listOfGenders = ibatisJava.getAllRecords("GenderTable.getAll", null);
        req.setAttribute("listOfGender", listOfGenders);

        String url = "jsp/signupPage.jsp";
        req.getRequestDispatcher(url).forward(req, resp);
    }
}
