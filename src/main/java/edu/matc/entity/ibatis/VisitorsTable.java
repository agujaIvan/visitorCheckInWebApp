package edu.matc.entity.ibatis;

import java.sql.Timestamp;

public class VisitorsTable {
    private int idVisitorsTable;
    private int idSectionTable;
    private int idUserTable;
    private int idStatusTable;
    private Timestamp whenSignedIn;

    public VisitorsTable() {
    }

    public VisitorsTable(int idVisitorsTable, int idSectionTable, int idUserTable, int idStatusTable, Timestamp signedInTime) {
        this.idVisitorsTable = idVisitorsTable;
        this.idSectionTable = idSectionTable;
        this.idUserTable = idUserTable;
        this.idStatusTable = idStatusTable;
        this.whenSignedIn = signedInTime;
    }

    public int getIdVisitorsTable() {
        return idVisitorsTable;
    }

    public void setIdVisitorsTable(int idVisitorsTable) {
        this.idVisitorsTable = idVisitorsTable;
    }

    public int getIdSectionTable() {
        return idSectionTable;
    }

    public void setIdSectionTable(int idSectionTable) {
        this.idSectionTable = idSectionTable;
    }

    public int getIdUserTable() {
        return idUserTable;
    }

    public void setIdUserTable(int idUserTable) {
        this.idUserTable = idUserTable;
    }

    public int getIdStatusTable() {
        return idStatusTable;
    }

    public void setIdStatusTable(int idStatusTable) {
        this.idStatusTable = idStatusTable;
    }

    public Timestamp getWhenSignedIn() {
        return whenSignedIn;
    }

    public void setWhenSignedIn(Timestamp whenSignedIn) {
        this.whenSignedIn = whenSignedIn;
    }
}
