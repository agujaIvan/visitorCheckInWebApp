package edu.matc.persistence;


import edu.matc.entity.Status;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;

public class StatusHibernateDao {

    private final Logger log = Logger.getLogger(this.getClass());


    /**
     * Add new item or record to the status table
     */
    public boolean addNewRecord(String statusName) {
        Session session = null;
        Transaction tx = null;
        boolean operationStatus = false;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            tx = session.beginTransaction();
            Status status = new Status();
            status.setStatusName(statusName);
            session.save(status);
            tx.commit();
            operationStatus = true;
        } catch (HibernateException he) {
            if (tx != null) tx.rollback();
            log.info("Error adding new record for statusTable", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return operationStatus;
    }

    /* Method to  READ all the record in status table */
    public int listOfStatus() {
        Session session = null;
        Transaction tx = null;
        int totalOfRecords = 0;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            tx = session.beginTransaction();
            List statusList = session.createQuery("FROM Status").list();
            for (Iterator iterator =
                 statusList.iterator(); iterator.hasNext(); ) {
                Status status = (Status) iterator.next();
                log.info("Items" + status.getStatusName());
                totalOfRecords++;
            }
            tx.commit();
        } catch (HibernateException he) {
            if (tx != null) tx.rollback();
            log.info("Error retrieving records from statusTable", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return totalOfRecords;
    }

    /* Method to UPDATE the name in the statustable */
    public boolean updateStatusItem(Integer itemId, String statusName) {
        Session session = null;
        Transaction tx = null;
        boolean operation = false;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            tx = session.beginTransaction();
            Status status =
                    (Status) session.get(Status.class, itemId);
            status.setStatusName(statusName);
            session.update(status);
            tx.commit();
            operation = true;
        } catch (HibernateException he) {
            if (tx != null) tx.rollback();
            log.info("Error updating name in statusTable", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return operation;
    }

    /* Method to UPDATE the name in the statustable */
    public boolean deleteStatusItem(Integer itemId) {
        Session session = null;
        Transaction tx = null;
        boolean operation = false;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            tx = session.beginTransaction();
            Status status =
                    (Status) session.get(Status.class, itemId);
            session.delete(status);
            tx.commit();
            operation = true;
        } catch (HibernateException he) {
            if (tx != null) tx.rollback();
            log.info("Error deleting a item from statusTable", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return operation;
    }
}
