package edu.matc.controller;

import edu.matc.entity.ClassEntity;
import edu.matc.entity.ClasstableEntity;
import edu.matc.entity.StyleEntity;
import edu.matc.entity.StyletableEntity;
import edu.matc.persistence.HibernateDao;
import edu.matc.persistence.SessionFactoryProvider;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.sql.Date;
import java.sql.Time;

public class TestingOut {

    @Test
    public void testing() throws Exception {
        final Logger log = Logger.getLogger(this.getClass());
        Session session = null;
        Transaction tx = null;

        HibernateDao hibernateDao = new HibernateDao();
        StyletableEntity styletableEntity = new StyletableEntity();
        StyletableEntity style = null;

        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            tx = session.beginTransaction();

            //style = (StyletableEntity) hibernateDao.getById(styletableEntity, 2);
            style = (StyletableEntity) session.get(StyletableEntity.class, 2);

            ClasstableEntity classtableEntity = new ClasstableEntity();

        /*ClasstableEntity classtableEntity2 = new ClasstableEntity(Date.valueOf("2017-11-10"), Date.valueOf("2017-12-11"),
                Time.valueOf("12:12:12"), Time.valueOf("11:11:11"), "Wednesday", style);*/

            //hibernateDao.addNewRecord(classtableEntity2);

            classtableEntity.setClassStartDate(Date.valueOf("2017-09-09"));
            classtableEntity.setClassEndDate(Date.valueOf("2017-10-10"));
            classtableEntity.setClassStartTime(Time.valueOf("11:11:11"));
            classtableEntity.setClassEndTime(Time.valueOf("11:11:11"));
            classtableEntity.setClassDays("Wednesday");

            //style.getClasstableEntities().add(classtableEntity);
            classtableEntity.setStyletableEntityById(style);

            session.save(classtableEntity);
            tx.commit();
            //hibernateDao.addNewRecord(classtableEntity);


        } catch (HibernateException he) {
            if (tx != null) tx.rollback();
            log.info("Error updating user profile", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }


    }

    @Test
    public void testingThe2ndPart() throws Exception{
        HibernateDao hibernateDao = new HibernateDao();
        StyleEntity styleEntity = new StyleEntity();

        styleEntity.setStyleName("new salsa");

        hibernateDao.addNewRecord(styleEntity);
    }

    @Test
    public void testingClass() throws Exception {
        final Logger log = Logger.getLogger(this.getClass());
        Session session = null;
        Transaction tx = null;

        HibernateDao hibernateDao = new HibernateDao();
        StyleEntity styleEntity = new StyleEntity();

        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            tx = session.beginTransaction();

            //style = (StyletableEntity) hibernateDao.getById(styletableEntity, 2);
            styleEntity = (StyleEntity) session.get(StyleEntity.class, 2);

            ClassEntity classtableEntity = new ClassEntity();

        /*ClasstableEntity classtableEntity2 = new ClasstableEntity(Date.valueOf("2017-11-10"), Date.valueOf("2017-12-11"),
                Time.valueOf("12:12:12"), Time.valueOf("11:11:11"), "Wednesday", style);*/

            //hibernateDao.addNewRecord(classtableEntity2);

            classtableEntity.setClassStartDate(Date.valueOf("2017-09-09"));
            classtableEntity.setClassEndDate(Date.valueOf("2017-10-10"));
            classtableEntity.setClassStartTime(Time.valueOf("11:11:11"));
            classtableEntity.setClassEndTime(Time.valueOf("11:11:11"));
            classtableEntity.setClassDays("Wednesday");

            //style.getClasstableEntities().add(classtableEntity);
            classtableEntity.setStyleEntity(styleEntity);

            session.save(classtableEntity);
            tx.commit();
            //hibernateDao.addNewRecord(classtableEntity);


        } catch (HibernateException he) {
            if (tx != null) tx.rollback();
            log.info("Error updating user profile", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }


    }
}
