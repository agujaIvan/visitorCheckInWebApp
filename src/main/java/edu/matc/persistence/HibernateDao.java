package edu.matc.persistence;



import edu.matc.entity.StyleEntity;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.ArrayList;
import java.util.List;

public class HibernateDao {

    private final Logger log = Logger.getLogger(this.getClass());
    Session session = null;
    Transaction tx = null;

    public HibernateDao(){}

    /**
     * Add new item or record to the a table
     */
    public void addNewStyleRecord(StyleEntity style) {

        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(style);
            tx.commit();
        } catch (HibernateException he) {
            if (tx != null) tx.rollback();
            log.info("Error adding new record for style table",  he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }



    public List getAllRecords(Object object) {
        List items = new ArrayList<>();
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            items = session.createCriteria(object.getClass()).list();
        } catch (HibernateException he) {
            log.error("Error getting all record from " + object.getClass(), he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return items;
    }

}

