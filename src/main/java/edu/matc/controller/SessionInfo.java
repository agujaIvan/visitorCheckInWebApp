package edu.matc.controller;

import edu.matc.entity.UsertableEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionInfo {
    HttpSession session;

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

}
