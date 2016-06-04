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

		
	
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(spolkaDAO);
			session.getTransaction().commit();
			//session.getSessionFactory().close();
			
		
		} catch (Exception e) {
			// Sterownik nieodnaleziony
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
			return;
		}

	}

}
