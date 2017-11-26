package edu.matc.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import java.sql.Date;
import java.time.LocalDate;

import edu.matc.entity.UsertableEntity;
import edu.matc.entity.ibatis.UserTable;
import edu.matc.persistence.HibernateDao;
import edu.matc.persistence.IbatisJava;
import org.apache.log4j.Logger;

@WebServlet(
        urlPatterns = {"/userServlet"}
)
public class UserServlet extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            HibernateDao user = new HibernateDao();
            String url = null;
            SessionInfo sessionInfo = new SessionInfo(req);

            String firstName = req.getParameter("firstName");
            String lastName = req.getParameter("lastName");
            String email = req.getParameter("email");
            String password = req.getParameter("password");

            if (req.getParameter("submit").equals("signup")) {
                String userName = req.getParameter("userName");
                String gender = req.getParameter("gender");
                LocalDate currentDate = LocalDate.now();


                //creating and saving the user to the database
                createAndStoreUser(Integer.parseInt(gender), 1, userName, password, email, firstName, lastName,
                                    Date.valueOf(currentDate), "", "dancer");

                url = "jsp/result.jsp";

            } else if (req.getParameter("submit").equals("addUserByAdmin")) {
                //TODO working on this to add the proper user for teachers using the admin page

                HttpSession session = req.getSession();
                String role = req.getParameter("typeOfUser");
                String userName = req.getParameter("userName");
                String gender = req.getParameter("gender");
                LocalDate currentDate = LocalDate.now();


                //creating and saving the user to the database
                createAndStoreUser(Integer.parseInt(gender), 1, userName, password, email, firstName, lastName,
                        Date.valueOf(currentDate), "", role);


                //saveUser(req, resp, email, firstName, lastName, password, role, user);
                /*user.addNewUser(currentDate, email, firstName, lastName, password, "", userName,
                        gender, role);*/
                //updating the user in the session
                session.setAttribute("message", "user was successfully added");

                url = "jsp/administrator.jsp";
            } else if (req.getParameter("submit").equals("editUser")) {


                //getting the user from the session
                UsertableEntity userInfo =
                        (UsertableEntity) sessionInfo.getAttribute("user");

                //updating the info of the user
                userInfo.setUserFirstName(firstName);
                userInfo.setUserLastName(lastName);
                userInfo.setUserEmail(email);
                userInfo.setUserPassword(password);

                //updating the user in the database
                user.updateUser(userInfo);

                //updating the user in the session
                sessionInfo.createAttribute("user", userInfo);
                sessionInfo.createAttribute("message", "info was successfully updated");

                url = "jsp/administrator.jsp";
            } else if (req.getParameter("submit").equals("cancel")) {
                url = "jsp/administrator.jsp";
                sessionInfo.removeAttribute("message");
            }


            resp.sendRedirect(url);

        }

    private void saveUser(HttpServletRequest req, HttpServletResponse resp, String email, String firstName,
                          String lastName, String password, String role, HibernateDao user) {

        String userName = req.getParameter("userName");
        LocalDate currentDate = LocalDate.now();
        int gender = Integer.parseInt(req.getParameter("gender"));

        user.addNewUser(currentDate, email, firstName, lastName, password, "", userName,
                gender, role);
    }

    //TODO this method to create the user
    private void createAndStoreUser(int idGender, int idStatusTable, String userName, String userPassword,
                                    String userEmail, String userFirstName, String userLastName, Date userDate,
                                    String userPhoto, String userRole){

            IbatisJava ibatisJava   = new IbatisJava();
            UserTable userTable     = new UserTable(idGender, idStatusTable, userName, userPassword, userEmail,
                                            userFirstName, userLastName, userDate, userPhoto, userRole);

            ibatisJava.addRecord("User.addNewRecord", userTable);
    }


}
