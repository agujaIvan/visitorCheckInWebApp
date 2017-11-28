package edu.matc.entity.ibatis;

import java.sql.Date;
import java.sql.Time;

public class ClassTable {
    private int idClassTable;
    private int idUserTable;
    private int idStyleTable;
    private Date classStartDate;
    private Date classEndDate;
    private Time classStartTime;
    private Time classEndTime;
    private String classDays;
    private String styleName;
    private String userFirstName;
    private String userLastName;

    public ClassTable(){

    }

    public ClassTable(int idUserTable, int style_id, Date startDate, Date endDate, Time startTime, Time endTime, String days) {
        this.idUserTable = idUserTable;
        this.idStyleTable = style_id;
        this.classStartDate = startDate;
        this.classEndDate = endDate;
        this.classStartTime = startTime;
        this.classEndTime = endTime;
        this.classDays = days;
    }

    public ClassTable(int idUserTable, int idStyleTable, Date classStartDate, Date classEndDate, Time classStartTime,
                      Time classEndTime, String classDays, String styleName, String userFirstName, String userLastName) {
        this.idUserTable = idUserTable;
        this.idStyleTable = idStyleTable;
        this.classStartDate = classStartDate;
        this.classEndDate = classEndDate;
        this.classStartTime = classStartTime;
        this.classEndTime = classEndTime;
        this.classDays = classDays;
        this.styleName = styleName;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
    }

    public int getIdclassTable() {
        return idClassTable;
    }

    public void setIdclassTable(int idclassTable) {
        this.idClassTable = idclassTable;
    }

    public int getIdUserTable() {
        return idUserTable;
    }

    public void setIdUserTable(int idUserTable) {
        this.idUserTable = idUserTable;
    }

    public int getIdStyleTable() {
        return idStyleTable;
    }

    public void setIdStyleTable(int idStyleTable) {
        this.idStyleTable = idStyleTable;
    }

    public Date getClassStartDate() {
        return classStartDate;
    }

    public void setClassStartDate(Date classStartDate) {
        this.classStartDate = classStartDate;
    }

    public Date getClassEndDate() {
        return classEndDate;
    }

    public void setClassEndDate(Date classEndDate) {
        this.classEndDate = classEndDate;
    }

    public Time getClassStartTime() {
        return classStartTime;
    }

    public void setClassStartTime(Time classStartTime) {
        this.classStartTime = classStartTime;
    }

    public Time getClassEndTime() {
        return classEndTime;
    }

    public void setClassEndTime(Time classEndTime) {
        this.classEndTime = classEndTime;
    }

    public String getClassDays() {
        return classDays;
    }

    public void setClassDays(String classDays) {
        this.classDays = classDays;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }
}
