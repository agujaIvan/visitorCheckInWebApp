package edu.matc.persistence;


import edu.matc.entity.UsertableEntity;
import edu.matc.entity.GendertableEntity;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GenderHibernateDao {

    private final Logger log = Logger.getLogger(this.getClass());
    Session session = null;
    Transaction tx = null;

    public GenderHibernateDao(){}

    /**
     * Add new item or record to the status table
     */
    public boolean addNewRecord(String genderName) {

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

    public void addNewUser(LocalDate dancerDate, String dancerEmail, String firstName,
                              String lastName, String dancerPassword, String dancerPhoto,
                              String dancerUser, int dancerGender, String userRole) {

        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            tx = session.beginTransaction();
            UsertableEntity user = new UsertableEntity();
            user.setUserDate(dancerDate);
            user.setUserEmail(dancerEmail);
            user.setUserFirstName(firstName);
            user.setUserLastName(lastName);
            user.setUserPassword(dancerPassword);
            user.setUserPhoto(dancerPhoto);
            user.setUserName(dancerUser);
            user.setUserRole(userRole);
            GendertableEntity gender =
                    (GendertableEntity) session.get(GendertableEntity.class, dancerGender);

            user.setGendertableByGenderTableIdGenderTable(gender);

            session.save(user);
            tx.commit();
        } catch (HibernateException he) {
            if (tx != null) tx.rollback();
            log.info("Error adding new record for Dancer table", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }

    }

    public List<UsertableEntity> getUserByNameAndPassword(String userName, String userPassword) {

        List<UsertableEntity> user = new ArrayList<>();
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            tx = session.beginTransaction();

            // create a query
            String hql = "from edu.matc.entity.UsertableEntity U WHERE U.userName = :userName AND U.userPassword " +
                    "= :userPassword";

            Query theQuery =
                    session.createQuery(hql);

            theQuery.setParameter("userName", userName);
            theQuery.setParameter("userPassword", userPassword);

            // execute query and get result list
            user = theQuery.list();

            //session.save(user);
            //tx.commit();
        } catch (HibernateException he) {
            if (tx != null) tx.rollback();
            log.info("Error searching for user and password in database", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }

        // return the results
        return user;
    }


}
