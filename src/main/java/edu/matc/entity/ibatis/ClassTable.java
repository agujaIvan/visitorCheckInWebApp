package edu.matc.entity.ibatis;

import java.sql.Date;
import java.sql.Time;

public class ClassTable {
    private int idclassTable;
    private int idUserTable;
    private int idStyleTable;
    private Date classStartDate;
    private Date classEndDate;
    private Time classStartTime;
    private Time classEndTime;
    private String classDays;
    private String styleName;

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


}
