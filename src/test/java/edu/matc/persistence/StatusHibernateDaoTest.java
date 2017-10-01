package edu.matc.persistence;

import org.junit.Test;

import static org.junit.Assert.*;

public class StatusHibernateDaoTest {
    StatusHibernateDao statusHibernateDao = new StatusHibernateDao();
    @Test
    public void addNewRecord() throws Exception {
        assertEquals("record couldnt been made", true,
                statusHibernateDao.addNewRecord("new record") );

        assertEquals("record couldnt been made", false,
                statusHibernateDao.addNewRecord(null) );
    }

    @Test
    public void getListOfRecords() throws Exception {
        assertEquals("Total of record didnt match with database", 3,
                statusHibernateDao.listOfStatus() );
    }

    @Test
    public void updateAnRecord() throws Exception {
        assertEquals("record wasnt updated in the database", true,
                statusHibernateDao.updateStatusItem(2, "Ivan") );
    }

    @Test
    public void deleteAnItem(){
        assertEquals("record wasnt deleted in the table status", true,
                statusHibernateDao.deleteStatusItem(3) );
    }

}