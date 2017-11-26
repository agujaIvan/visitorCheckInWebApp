package edu.matc.entity.ibatis;

import java.sql.Date;

public class UserTable {
    private int idUserTable;
    private int idGenderTable;
    private int idStatusTable;
    private String userName;
    private String userPassword;
    private String userEmail;
    private String userFirstName;
    private String userLastName;
    private Date userDate;
    private String userPhoto;
    private String userRole;

    public UserTable(){}

    public UserTable(int idGender, int idStatusTable, String userName, String userPassword, String userEmail, String userFirstName,
                     String userLastName, Date userDate, String userPhoto, String userRole) {
        this.idGenderTable = idGender;
        this.idStatusTable = idStatusTable;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userDate = userDate;
        this.userPhoto = userPhoto;
        this.userRole = userRole;

    }

    public int getIdUserTable() {
        return idUserTable;
    }

    public int getIdGenderTable() {
        return idGenderTable;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public Date getUserDate() {
        return userDate;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setIdUserTable(int idUserTable) {
        this.idUserTable = idUserTable;
    }

    public void setIdGenderTable(int idGenderTable) {
        this.idGenderTable = idGenderTable;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public void setUserDate(Date userDate) {
        this.userDate = userDate;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public int getIdStatusTable() {
        return idStatusTable;
    }

    public void setIdStatusTable(int idStatusTable) {
        this.idStatusTable = idStatusTable;
    }
}
