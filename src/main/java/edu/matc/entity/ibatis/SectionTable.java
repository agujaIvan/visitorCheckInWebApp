package edu.matc.entity.ibatis;

public class SectionTable {
    private int idSectionTable;
    private int idClassTable;
    private int idStatusTable;
    private String sectionDay;

    public SectionTable(int idSectionTable, int idClassTable, int idStatusTable, String sectionDay) {
        this.idSectionTable = idSectionTable;
        this.idClassTable = idClassTable;
        this.idStatusTable = idStatusTable;
        this.sectionDay = sectionDay;
    }

    public int getIdSectionTable() {
        return idSectionTable;
    }

    public void setIdSectionTable(int idSectionTable) {
        this.idSectionTable = idSectionTable;
    }

    public int getIdClassTable() {
        return idClassTable;
    }

    public void setIdClassTable(int idClassTable) {
        this.idClassTable = idClassTable;
    }

    public int getIdStatusTable() {
        return idStatusTable;
    }

    public void setIdStatusTable(int idStatusTable) {
        this.idStatusTable = idStatusTable;
    }

    public String getSectionDay() {
        return sectionDay;
    }

    public void setSectionDay(String sectionDay) {
        this.sectionDay = sectionDay;
    }
}
