package com.gpw.grabber.engine.database;

import org.hibernate.Session;

import com.gpw.grabber.data.dao.ISpolkaDAO;

import com.gpw.grabber.engine.database.HibernateUtil;

	public class DatabasePersistService implements IDatabasePersistService {

	public void persist(ISpolkaDAO spolkaDAO) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		
		session.getTransaction().commit();
		session.getSessionFactory().close();
		
	}
	
}
