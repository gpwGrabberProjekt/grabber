package com.gpw.grabber.engine.database;

import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.gpw.grabber.data.dao.ISpolkaDAO;
import com.gpw.grabber.data.dao.SpolkaDAO;



/**
 * Zapis do bazy danych spolki typu DAO
 * 
 */

public class DatabasePersistService implements IDatabasePersistService {

	public void persist(ISpolkaDAO spolkaDAO) throws Exception {

		
		//System.out.println(spolkaDAO.getSpolkanazwa() +spolkaDAO.getDataaktualizacji());
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(spolkaDAO);
			session.getTransaction().commit();
			//session.getSessionFactory().close();
			
			// Configuration configuration = new Configuration();
			 //sessionFactory = configuration.buildSessionFactory();
			// StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
			 //SessionFactory sessionFactory = configuration.buildSessionFactory(ssrb.build());
	         //Session session = sessionFactory.openSession();
			// session.beginTransaction();
			// Calendar calendar = Calendar.getInstance();
			// SpolkaDAO spolka = new SpolkaDAO();
			// spolka.setKursbiez(1.0);
			// spolka.setDataaktualizacji(new
			// java.sql.Timestamp(calendar.getTime().getTime()));
			// spolka.setSpolkanazwa("ABC");
			// spolka.setSpolkaskrot("adbd");
			// session.save(spolkaDAO);
			// session.save(spolka);
			
			///session.getTransaction().commit();
			//session.getSessionFactory().close();
		} catch (Exception e) {
			// Sterownik nieodnaleziony
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
			return;
		}

	}

}
