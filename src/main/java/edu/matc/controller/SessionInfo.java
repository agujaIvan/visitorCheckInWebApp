package edu.matc.controller;


import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionInfo {
    HttpSession session;
    private final Logger log = Logger.getLogger(this.getClass());

    public SessionInfo(HttpServletRequest req) {
        session = req.getSession();

    }

    public void createAttribute(String attributeName, Object object){
        //adding the attribute to the session
        session.setAttribute(attributeName, object);
    }

    public Object getAttribute(String attributeName) {
        return session.getAttribute(attributeName);
    }

    public  void removeAttribute(String attributeName) {
        session.removeAttribute(attributeName);
    }

    public void destroySession(){
        session.invalidate();
    }

    public void isLogIn(HttpServletRequest req, HttpServletResponse rep){
        Object user = session.getAttribute("user");
        if (user == null){
            String url = "/index.jsp";
            try {
                rep.sendRedirect(req.getContextPath()+url);
            } catch (IOException e) {
                log.error("error loging out the user", e);
            }
        }
    }

}
