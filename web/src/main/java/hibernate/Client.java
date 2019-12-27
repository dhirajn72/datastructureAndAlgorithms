package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * @author Dhiraj
 * @date 08/12/19
 */
public class Client {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        System.out.println(sessionFactory);

        Customer c1 = new Customer("dk", "CS", 9743);
        Address a1 = new Address("MCR", "BLore", "KA", "IN", 560068);

        Session session =null;
        Transaction transaction=null;

        try {
            session= sessionFactory.openSession();
            transaction = sessionFactory.openSession().getTransaction();
            transaction.begin();
            session.save(c1);
            session.save(a1);
            c1.setAddress(a1);
            transaction.commit();
            session.flush();

            session= sessionFactory.openSession();
            transaction=session.getTransaction();
            transaction.begin();
            Customer customer = (Customer) session.load(Customer.class, 1);
            System.out.println(customer);
            transaction.commit();
            session.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (transaction!=null)
                transaction.rollback();
            if (session!=null)
                session.close();
        }

        //HibernateUtil.shutdown();
    }


}
