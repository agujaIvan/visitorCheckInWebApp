package edu.matc.persistence;


import edu.matc.entity.DancertableEntity;
import edu.matc.entity.GendertableEntity;
import edu.matc.entity.Status;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class GenderHibernateDao {

    private final Logger log = Logger.getLogger(this.getClass());

    public GenderHibernateDao(){}

    /**
     * Add new item or record to the status table
     */
    public boolean addNewRecord(String genderName) {
        Session session = null;
        Transaction tx = null;
        boolean operationStatus = false;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            tx = session.beginTransaction();
            GendertableEntity gender = new GendertableEntity();
            gender.setGenderName(genderName);
            session.save(gender);
            tx.commit();
            operationStatus = true;
        } catch (HibernateException he) {
            if (tx != null) tx.rollback();
            log.info("Error adding new record for GenderTable", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return operationStatus;
    }

    public boolean addNewDancer(Timestamp dancerDate, String dancerEmail, String firstName,
                                String lastName, String dancerPassword, String dancerPhoto,
                                String dancerUser, int dancerGender) {
        Session session = null;
        Transaction tx = null;
        boolean operationStatus = false;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            tx = session.beginTransaction();
            DancertableEntity dancer = new DancertableEntity();
            dancer.setDancerDate(dancerDate);
            dancer.setDancerEmail(dancerEmail);
            dancer.setDancerFistName(firstName);
            dancer.setDancerLastName(lastName);
            dancer.setDancerPassword(dancerPassword);
            dancer.setDancerPhoto(dancerPhoto);
            dancer.setDancerUser(dancerUser);
            GendertableEntity gender =
                    (GendertableEntity) session.get(GendertableEntity.class, dancerGender);


            dancer.setGendertableByGenderTableIdGenderTable(gender);

            session.save(dancer);
            tx.commit();
            operationStatus = true;
        } catch (HibernateException he) {
            if (tx != null) tx.rollback();
            log.info("Error adding new record for Dancer table", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return operationStatus;
    }
}
