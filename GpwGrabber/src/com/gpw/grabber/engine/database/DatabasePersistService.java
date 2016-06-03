package com.gpw.grabber.engine.database;

import org.hibernate.Session;

import com.gpw.grabber.data.dao.ISpolkaDAO;

//test 
import com.gpw.grabber.data.dao.SpolkaDAO;

import com.gpw.grabber.engine.database.HibernateUtil;

/**
 * Zapis do bazy danych spolki typu DAO
 * 
 */

	public class DatabasePersistService implements IDatabasePersistService {

	public void persist(ISpolkaDAO spolkaDAO) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		
		// smieci dodane do testowania czy wogole cos sie tworzy
		SpolkaDAO spolka = new SpolkaDAO();
		spolka.setSpolkaSkrot("Testowa");
		spolka.setDataAktualizacji();
		
		session.save(spolkaDAO);
		
		session.getTransaction().commit();
		session.getSessionFactory().close();
		
	}
	
}
