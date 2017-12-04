package edu.matc.entity.ibatis;

import java.sql.Timestamp;

public class JoinedVisitorsTable {
    private int idSectionTable;
    private int idUserTable;
    private String statusName;
    private Timestamp whenSignedIn;
    private String userName;
    private String genderName;

    public JoinedVisitorsTable() {
    }

    public String getStatusName() {
        return statusName;
    }

    public int getIdSectionTable() {
        return idSectionTable;
    }

    public int getIdUserTable() {
        return idUserTable;
    }

    public void setIdUserTable(int idUserTable) {
        this.idUserTable = idUserTable;
    }

    public void setIdSectionTable(int idSectionTable) {
        this.idSectionTable = idSectionTable;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Timestamp getWhenSignedIn() {
        return whenSignedIn;
    }

    public void setWhenSignedIn(Timestamp whenSignedIn) {
        this.whenSignedIn = whenSignedIn;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }
}
