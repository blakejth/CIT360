package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;
import java.lang.*;

public class TestDAO {
    SessionFactory factory = null;
    Session session = null;

    private static TestDAO single_instance = null;

    private TestDAO() {
        factory = HibernateUtils.getSessionFactory();
    }

    public static TestDAO getInstance() {
        if (single_instance == null) {
            single_instance = new TestDAO();
        }
        return single_instance;
    }

    public List<Customer> getCustomers() {
        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from hibernate.Customer";
            List<Customer> cs = (List<Customer>)session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return cs;
        }
        catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        } finally{
            session.close();
        }
    }
    public Customer getCustomer(Integer id) {
        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from hibernate.Customer where id=" + Integer.toString(id);
            Customer c = (Customer)session.createQuery(sql).getSingleResult();
            session.getTransaction().commit();
            return c;
        }
        catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }
        finally {
            session.close();
        }
    }
}