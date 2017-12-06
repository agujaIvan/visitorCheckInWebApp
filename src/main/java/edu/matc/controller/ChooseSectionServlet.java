package edu.matc.controller;

import edu.matc.entity.ibatis.JoinedSectionTable;
import edu.matc.persistence.IbatisJava;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ChooseSectionServlet",
        urlPatterns = {"/ChooseSectionServlet"}
        )
public class ChooseSectionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        IbatisJava ibatisJava = new IbatisJava();
        List<? super JoinedSectionTable> listOfSections = ibatisJava.getAllRecords("SectionTable.getAllJoinUserClassAndStyleTables", null);
        request.setAttribute("listOfSections", listOfSections);

        String url = "jsp/chooseSection.jsp";

        request.getRequestDispatcher(url).forward(request, response);
    }
}
