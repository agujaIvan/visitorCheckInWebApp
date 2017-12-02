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
import java.util.ArrayList;
import java.util.List;

import edu.matc.entity.ibatis.ClassTable;
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

                IbatisJava ibatisJava = new IbatisJava();
                List<UserTable> userTableList = new ArrayList<>();


                //creating and saving the user to the database
                createAndStoreUser(Integer.parseInt(gender), 1, userName, password, email, firstName, lastName,
                                    Date.valueOf(currentDate), "", "dancer");


                userTableList = ibatisJava.getUserByIdAndPassword(userName, password);
                sessionInfo.createAttribute("user", userTableList.get(0));

                List<? super ClassTable> listOfClasses = ibatisJava.getAllRecords("Class.getAllJoinStyleAndUserTables", null);
                req.setAttribute("listOfClasses", listOfClasses);

                url = "jsp/chooseSection.jsp";

            } else if (req.getParameter("submit").equals("addUserByAdmin")) {

                HttpSession session = req.getSession();
                String role = req.getParameter("typeOfUser");
                String userName = req.getParameter("userName");
                String gender = req.getParameter("gender");
                LocalDate currentDate = LocalDate.now();


                //creating and saving the user to the database
                createAndStoreUser(Integer.parseInt(gender), 1, userName, password, email, firstName, lastName,
                        Date.valueOf(currentDate), "", role);

                //updating the user in the session
                session.setAttribute("message", "user was successfully added");

                url = "jsp/administrator.jsp";
            } else if (req.getParameter("submit").equals("editUser")) {

                IbatisJava ibatisJava = new IbatisJava();

                //getting the user from the session
                UserTable userInfo =
                        (UserTable) sessionInfo.getAttribute("user");

                //updating the info of the user
                userInfo.setUserFirstName(firstName);
                userInfo.setUserLastName(lastName);
                userInfo.setUserEmail(email);
                userInfo.setUserPassword(password);


                //updating the user in the database
                ibatisJava.updateUser(userInfo);

                req.setAttribute("message", "info was successfully updated");
                url = "jsp/administrator.jsp";

            } else if (req.getParameter("submit").equals("cancel")) {
                url = "jsp/administrator.jsp";
                sessionInfo.removeAttribute("message");
            }

            req.getRequestDispatcher(url).forward(req, resp);
        }

    private void createAndStoreUser(int idGender, int idStatusTable, String userName, String userPassword,
                                    String userEmail, String userFirstName, String userLastName, Date userDate,
                                    String userPhoto, String userRole){

            IbatisJava ibatisJava   = new IbatisJava();
            UserTable userTable     = new UserTable(idGender, idStatusTable, userName, userPassword, userEmail,
                                            userFirstName, userLastName, userDate, userPhoto, userRole);

            ibatisJava.addRecord("User.addNewRecord", userTable);
    }


}
