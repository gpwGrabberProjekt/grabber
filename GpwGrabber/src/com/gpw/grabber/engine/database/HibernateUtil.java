package com.gpw.grabber.engine.database;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Klasa odpowiedzialna za konfiguracje 
 * @see <a href="http://hibernate.org/orm/documentation/5.2/">Hibernate DOC</a>
 * 
 */
public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	/**
	 * Fabryka sesji dla Hibernate wraz z odczytem konfiguracji
	 * 
	 */
		private static SessionFactory buildSessionFactory() {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			return new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	/**
	 * Zamkniecie puli polaczen
	 * 
	 */
	public static void shutdown() {
		// Close caches and connection pools
		getSessionFactory().close();
	}


}
