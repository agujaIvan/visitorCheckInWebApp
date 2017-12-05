package edu.matc.persistence;

import edu.matc.entity.ibatis.ClassTable;
import edu.matc.entity.ibatis.JoinedVisitorsTable;
import edu.matc.entity.ibatis.SectionTable;
import edu.matc.entity.ibatis.VisitorsTable;
import org.junit.Test;

import java.util.List;

public class IbatisJavaTest {
    @Test
    public void getAllRecordsById() throws Exception {
        IbatisJava ibatisJava = new IbatisJava();
        SectionTable sectionTable = new SectionTable();
        ClassTable classTable = new ClassTable();
        Object obj = new Object();

        classTable = (ClassTable) ibatisJava.getRecordById("Class.getTheLastClassId", null);
        sectionTable.setIdSectionTable(1);

        obj = ibatisJava.getRecordById("SectionTable.getSectionByIdJoinUserClassAndStyleTables", sectionTable);
    }
    @Test
    public void getAllRecords() throws Exception {
        IbatisJava ibatisJava = new IbatisJava();
        VisitorsTable visitors = new VisitorsTable();

        Object obj = new Object();
        visitors.setIdSectionTable(1);
        List<? super JoinedVisitorsTable> listOfVisitors = ibatisJava.getAllRecords("VisitorsTable.getAllVisitorsBySectionId", "1");
        String ivan = "hey";

        //obj = ibatisJava.getRecordById("SectionTable.getSectionByIdJoinUserClassAndStyleTables", sectionTable);
    }

    @Test
    public void deleteRecord() throws Exception{
        IbatisJava ibatisJava = new IbatisJava();

        int result = ibatisJava.deleteRecordById("VisitorsTable.deleteUserByIdAndSectionId", 6);
    }

}