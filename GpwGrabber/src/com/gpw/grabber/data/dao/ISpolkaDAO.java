package com.gpw.grabber.data.dao;

import java.sql.Timestamp;
/**
 * Interfejs kolekcja metod abstrakcyjnych dla SpolkiDAO
 * @author G.S 
 */
import java.util.Date;

public interface ISpolkaDAO {
	/** 
	 *  Pobranie nazwy spolki DAO
	 */
	String getSpolkanazwa();

	/** 
	 *  Ustawienie nazwy spolki DAO
	 */
	void setSpolkanazwa(String spolkanazwa);

	/** 
	 *  Pobranie nazwy skroconej spolki DAO
	 */
	String getSpolkaskrot();

	/** 
	 *  Ustawienie nazwy skroconej spolki DAO
	 */
	void setSpolkaskrot(String spolkaskrot);

	/** 
	 *  Pobranie kursu otwarcia spolki DAO
	 */
	double getKursotw();

	/** 
	 *  Ustawienie kursu otwarcia spolki DAO
	 */
	void setKursotw(double kursotw);

	/** 
	 *  Poranie kursu minimalnego spolki DAO
	 */
	double getKursmin();

	/** 
	 *  Ustawienie kursu minimalnego spolki DAO
	 */
	void setKursmin(double kursmin);

	/** 
	 *  Poranie kursu maksymalnego spolki DAO
	 */
	double getKursmax();

	/** 
	 *  Ustawienie kursu maksymalnego spolki DAO
	 */
	void setKursmax(double kursmax);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getKursbiez()
	 */
	double getKursbiez();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setKursbiez(double)
	 */
	void setKursbiez(double kursbiez);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getZmprocdzienna()
	 */
	double getZmprocdzienna();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setZmprocdzienna(double)
	 */
	void setZmprocdzienna(double zmprocdzienna);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getCzasostzmiany()
	 */
	String getCzasostzmiany();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setCzasostzmiany(java.lang.String)
	 */
	void setCzasostzmiany(String czasostzmiany);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getObrotszt()
	 */
	double getObrotszt();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setObrotszt(double)
	 */
	void setObrotszt(double obrotszt);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getObrotpln()
	 */
	double getObrotpln();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setObrotpln(double)
	 */
	void setObrotpln(double obrotpln);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getPdtygodniemin()
	 */
	double getPdtygodniemin();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setPdtygodniemin(double)
	 */
	void setPdtygodniemin(double pdtygodniemin);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getPdtygodniemax()
	 */
	double getPdtygodniemax();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setPdtygodniemax(double)
	 */
	void setPdtygodniemax(double pdtygodniemax);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getDataaktualizacji()
	 */
	Date getDataaktualizacji();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setDataaktualizacji(java.sql.Timestamp)
	 */
	void setDataaktualizacji(Timestamp Dataaktualizacji);

}