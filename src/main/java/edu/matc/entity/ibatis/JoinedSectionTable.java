package edu.matc.entity.ibatis;

import java.sql.Time;

public class JoinedSectionTable {
    private int idSectionTable;
    private String userFirstName;
    private String userLastName;
    private String sectionDay;
    private String styleName;
    private Time classStartTime;
    private Time classEndTime;

    public JoinedSectionTable() {
    }

    public JoinedSectionTable(String userFirstName, String userLastName, String sectionDay, String styleName,
                              Time classStartTime, Time classEndTime) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.sectionDay = sectionDay;
        this.styleName = styleName;
        this.classStartTime = classStartTime;
        this.classEndTime = classEndTime;
    }

    public int getIdSectionTable() {
        return idSectionTable;
    }

    public void setIdSectionTable(int idSectionTable) {
        this.idSectionTable = idSectionTable;
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

    public String getSectionDay() {
        return sectionDay;
    }

    public void setSectionDay(String sectionDay) {
        this.sectionDay = sectionDay;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
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
}
