package edu.matc.persistence;

import edu.matc.entity.ibatis.ClassTable;
import edu.matc.entity.ibatis.SectionTable;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class IbatisJavaTest {
    @Test
    public void getAllRecords() throws Exception {
        IbatisJava ibatisJava = new IbatisJava();
        ClassTable classTable = new ClassTable();
        classTable = (ClassTable) ibatisJava.getTheLastId("Class.getTheLastClassId");
    }

}