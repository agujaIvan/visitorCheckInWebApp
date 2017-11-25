package edu.matc.entity.ibatis;

public class GenderTable {
    private int idGenderTable;
    private String genderName;

    public GenderTable(){}

    public GenderTable(String genderName){
        this.genderName = genderName;
    }

    public int getIdGenderTable() {
        return idGenderTable;
    }

    public void setIdGenderTable(int idGenderTable) {
        this.idGenderTable = idGenderTable;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }
}
