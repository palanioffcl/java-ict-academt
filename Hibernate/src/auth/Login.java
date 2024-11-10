package auth;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import auth.User;

public class Login {

	public static void main(String[] args) throws Exception {
		SessionFactory sessions = new Configuration().configure().buildSessionFactory();
		Session session = sessions.openSession();
		Transaction tx = null;
		try {
			User obj = new User();
			tx = session.beginTransaction();
			
			obj.setUsername("whoami");
			obj.setPassword("password");
			session.save(obj);
			tx.commit();
		} catch (HibernateException e) {
			System.out.println(e);
		} finally {
			session.close();
		}
	}
}