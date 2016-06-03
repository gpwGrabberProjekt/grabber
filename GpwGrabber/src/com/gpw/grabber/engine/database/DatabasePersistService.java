package com.gpw.grabber.engine.database;

import org.hibernate.Session;
import org.hibernate.Query;


import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.gpw.grabber.data.dao.ISpolkaDAO;
import com.gpw.grabber.data.dao.NewSpolkaDAO;
//test 
import com.gpw.grabber.data.dao.SpolkaDAO;
import com.gpw.grabber.data.dao.NewSpolkaDAO;
import com.gpw.grabber.data.dao.MalaSpolka;

import com.gpw.grabber.engine.database.HibernateUtil;

/**
 * Zapis do bazy danych spolki typu DAO
 * 
 */

	//public class DatabasePersistService implements IDatabasePersistService {
	public class DatabasePersistService {

	//public void persist(ISpolkaDAO spolkaDAO) {
		public void persist() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		
		// smieci dodane do testowania czy wogole cos sie tworzy
		MalaSpolka spolka = new MalaSpolka();
		spolka.setSpolkaskrot("abc");
		spolka.setDataaktualizacji();
		
		session.save(spolka);
		
		session.getTransaction().commit();
		session.getSessionFactory().close();
		
	}
	
}
