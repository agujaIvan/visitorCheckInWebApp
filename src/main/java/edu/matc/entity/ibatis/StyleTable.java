package edu.matc.entity.ibatis;

public class StyleTable {
    private int idStyleTable;
    private String styleName;

    public StyleTable(){

    }

    public StyleTable(int id, String styleName) {
        this.idStyleTable = id;
        this.styleName = styleName;
    }

    public int getIdStyleTable() {
        return idStyleTable;
    }

    public void setIdStyleTable(int idStyleTable) {
        this.idStyleTable = idStyleTable;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }
}
