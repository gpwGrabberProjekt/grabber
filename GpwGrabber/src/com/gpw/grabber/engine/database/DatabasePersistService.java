package com.gpw.grabber.engine.database;

import java.util.Calendar;

import org.hibernate.Session;

import com.gpw.grabber.data.dao.ISpolkaDAO;
import com.gpw.grabber.data.dao.SpolkaDAO;

/**
 * Zapis do bazy danych spolki typu DAO
 * 
 */

public class DatabasePersistService implements IDatabasePersistService {

	public void persist(ISpolkaDAO spolkaDAO) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		Calendar calendar = Calendar.getInstance();
		SpolkaDAO spolka = new SpolkaDAO();
		spolka.setKursbiez(1.0);
		spolka.setDataaktualizacji(new java.sql.Timestamp(calendar.getTime().getTime()));
		spolka.setSpolkanazwa("ABC");
		spolka.setSpolkaskrot("adbd");

		session.save(spolka);

		session.getTransaction().commit();
		session.getSessionFactory().close();

	}

}
