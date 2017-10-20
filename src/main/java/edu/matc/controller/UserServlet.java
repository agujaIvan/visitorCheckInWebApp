package edu.matc.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import java.time.LocalDate;

import edu.matc.entity.UsertableEntity;
import edu.matc.persistence.UserHibernateDao;
import org.apache.log4j.Logger;

@WebServlet(
        urlPatterns = {"/userServlet"}
)
public class UserServlet extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            UserHibernateDao user = new UserHibernateDao();
            String url = null;

            String firstName = req.getParameter("firstName");
            String lastName = req.getParameter("lastName");
            String email = req.getParameter("email");
            String password = req.getParameter("password");



            if (req.getParameter("submit").equals("signup")) {
                LocalDate currentDate = LocalDate.now();

                String userName = req.getParameter("userName");
                int gender = Integer.parseInt(req.getParameter("gender"));
                String role = "dancer";

                user.addNewUser(currentDate, email, firstName, lastName, password, "", userName,
                        gender, role);

                url = "jsp/result.jsp";
            } else if (req.getParameter("submit").equals("editUser")) {

                //getting the user from the session
                HttpSession session = req.getSession();
                UsertableEntity userInfo =
                        (UsertableEntity) session.getAttribute("user");

                //updating the info of the user
                userInfo.setUserFirstName(firstName);
                userInfo.setUserLastName(lastName);
                userInfo.setUserEmail(email);
                userInfo.setUserPassword(password);

                //updating the user in the database
                user.updateUser(userInfo);

                //updating the user in the session
                session.setAttribute("user", userInfo);
                session.setAttribute("message", "info was successfully updated");

                /*String sessionIsAdded;
                sessionIsAdded =
                        (String)session.getAttribute("isAdded");

                if (sessionIsAdded == null || sessionIsAdded.equals("")) {

                    // sessionCounter = 1;
                    session.setAttribute("message", "");
                } else {

                    // sessionCounter++;
                    session.setAttribute("message", "info was successfully updated");
                    session.removeAttribute("isAdded");
                }*/



                url = "jsp/administrator.jsp";
            }

            resp.sendRedirect(url);

        }
}
