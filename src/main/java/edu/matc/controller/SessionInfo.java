package edu.matc.controller;

import edu.matc.entity.UsertableEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionInfo {


    public SessionInfo(String attributeName, Object object, HttpServletRequest req) {
        HttpSession session = req.getSession();
        //adding the user to the session
        session.setAttribute(attributeName, object);
    }

    /*public  void updateOrCreateSession(String attributeName, Object object, HttpServletRequest req) {

        HttpSession session = req.getSession();
                //adding the user to the session
                session.setAttribute(attributeName, object);
    }*/

}
