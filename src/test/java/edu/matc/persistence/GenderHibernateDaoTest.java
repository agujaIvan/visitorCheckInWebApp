package edu.matc.persistence;

import edu.matc.entity.GendertableEntity;
import org.junit.Test;

import java.sql.Timestamp;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class GenderHibernateDaoTest {
    GenderHibernateDao gender = new GenderHibernateDao();
/*

    @Test
    public void addNewGender() throws Exception {
        assertEquals("couldnt add the gender", true ,
                gender.addNewRecord("Famale"));
    }

    @Test
    public void addNewUser() throws Exception {
        LocalDate currenttime = LocalDate.now();
        assertEquals("couldnt add the gender", true ,
                gender.addNewUser(Timestamp.valueOf("2017-10-05 11:12:15"), "hernandez@gmail.com",
                        "Ivan", "Hernandez", "something",
                        "/photos", "aguja", 1));
    }
    */
}