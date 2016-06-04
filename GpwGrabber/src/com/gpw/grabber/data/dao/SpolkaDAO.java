package com.gpw.grabber.data.dao;


import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Data Access Object. SpolkaDAO  - obiekt w formacie dla bazy danych
 * Wykozystano Hibernate / JPA Annotation code
 */

@Entity
@Table(name = "Spolki")
public class SpolkaDAO implements  java.io.Serializable, ISpolkaDAO {
	
	private String Spolkanazwa;
	private String Spolkaskrot;
	private double Kursotw;
	private double Kursmin;
	private double Kursmax;
	private double Kursbiez;
	private double Zmprocdzienna;
	private String Czasostzmiany;
	private double Obrotszt;
	private double Obrotpln;
	private double Pdtygodniemin;
	private double Pdtygodniemax;
	private Timestamp Dataaktualizacji = new Timestamp(new java.util.Date().getTime());

	public SpolkaDAO() {}
	
	
	/**
	 * @param spolkanazwa  Nazwa Spolki w DB
	 * @param spolkaskrot  Skrot spolki W DB
	 * @param kursotw 		Wartosc kursu otwarcia w DB
	 * @param kursmin		Wartosc kursu minimalna z danej chwili czasowej w BD
	 * @param kursmax		Wartosc kursu maksymalna z danej chwili czasowej w BD
	 * @param kursbiez		Wartosc kursu biezaca z danej chwili czasowej w BD
	 * @param zmprocdzienna Zmiana procentowa z danej chwili czasowej w BD
	 * @param czasostzmiany	Data ostatniej zmiany z danej chwili czasowej w BD
	 * @param obrotszt		Obrót w szt. z danej chwili czasowej w BD
	 * @param obrotpln		Obrót w PLN z danej chwili czasowej w BD
	 * @param pdtygodniemin Zmiana min z 52 tyg z danej chwili czasowej w BD
	 * @param pdtygodniemax Zmiana max z 52 tyg z danej chwili czasowej w BD
	 * @param dataaktualizacji Znacznik generowany przez aplikacje
	 */
	public SpolkaDAO(String spolkanazwa, String spolkaskrot, double kursotw, double kursmin, double kursmax,
			double kursbiez, double zmprocdzienna, String czasostzmiany, double obrotszt, double obrotpln,
			double pdtygodniemin, double pdtygodniemax, Timestamp dataaktualizacji) {
		super();
		Spolkanazwa = spolkanazwa;
		Spolkaskrot = spolkaskrot;
		Kursotw = kursotw;
		Kursmin = kursmin;
		Kursmax = kursmax;
		Kursbiez = kursbiez;
		Zmprocdzienna = zmprocdzienna;
		Czasostzmiany = czasostzmiany;
		Obrotszt = obrotszt;
		Obrotpln = obrotpln;
		Pdtygodniemin = pdtygodniemin;
		Pdtygodniemax = pdtygodniemax;
		Dataaktualizacji = dataaktualizacji;
	}


	/* 
	 * Mapowanie na kolumne w bazie danych Nazwa spolki -> Nazwa
	 */
	@Column(name = "Nazwa", length = 128)
	public String getSpolkanazwa() {
		return this.Spolkanazwa;
	}

	/* 
	 * Ustawienie nazwy Spolki dla DB
	 */
	
	public void setSpolkanazwa(String spolkanazwa) {
		this.Spolkanazwa = spolkanazwa;
	}
	
	
	/* 
	 * Mapowanie na kolumne w bazie danych Skrot spolki -> Skrot
	 */
	@Id
	@Column(name = "Skrot", unique = true, nullable = false)
	public String getSpolkaskrot() {
		return this.Spolkaskrot;
	}


	/* 
	 * Ustawienie nazwy Skrotu spolki dla DB
	 */
	public void setSpolkaskrot(String spolkaskrot) {
		this.Spolkaskrot = spolkaskrot;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getKursotw()
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#getKursotw()
	 */
	@Column(name = "KursOtw")
	public double getKursotw() {
		return this.Kursotw;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setKursotw(double)
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#setKursotw(double)
	 */
	public void setKursotw(double kursotw) {
		this.Kursotw = kursotw;
	}
	
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getKursmin()
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#getKursmin()
	 */
	@Column(name = "KursMin")
	public double getKursmin() {
		return this.Kursmin;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setKursmin(double)
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#setKursmin(double)
	 */
	public void setKursmin(double kursmin) {
		this.Kursmin = kursmin;
	}
	
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getKursmax()
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#getKursmax()
	 */
	@Column(name = "KursMax")
	public double getKursmax() {
		return this.Kursmax;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setKursmax(double)
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#setKursmax(double)
	 */
	public void setKursmax(double kursmax) {
		this.Kursmax = kursmax;
	}
	
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getKursbiez()
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#getKursbiez()
	 */
	@Column(name = "KursBiez")
	public double getKursbiez() {
		return this.Kursbiez;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setKursbiez(double)
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#setKursbiez(double)
	 */
	public void setKursbiez(double kursbiez) {
		this.Kursbiez = kursbiez;
	}
	
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getZmprocdzienna()
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#getZmprocdzienna()
	 */
	@Column(name = "zmProcDzienna")
	public double getZmprocdzienna() {
		return this.Zmprocdzienna;
	}
	
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setZmprocdzienna(double)
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#setZmprocdzienna(double)
	 */
	public void setZmprocdzienna(double zmprocdzienna) {
		this.Zmprocdzienna = zmprocdzienna;
	}
	
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getCzasostzmiany()
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#getCzasostzmiany()
	 */
	@Column(name = "czasOstZmiany")
	public String getCzasostzmiany() {
		return this.Czasostzmiany;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setCzasostzmiany(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#setCzasostzmiany(java.lang.String)
	 */
	public void setCzasostzmiany(String czasostzmiany) {
		this.Czasostzmiany = czasostzmiany;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getObrotszt()
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#getObrotszt()
	 */
	@Column(name = "ObrotSzt")
	public double getObrotszt() {
		return this.Obrotszt;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setObrotszt(double)
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#setObrotszt(double)
	 */
	public void setObrotszt(double obrotszt) {
		this.Obrotszt = obrotszt;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getObrotpln()
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#getObrotpln()
	 */
	@Column(name = "ObrotPLN")
	public double getObrotpln() {
		return this.Obrotpln;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setObrotpln(double)
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#setObrotpln(double)
	 */
	public void setObrotpln(double obrotpln) {
		this.Obrotpln = obrotpln;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getPdtygodniemin()
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#getPdtygodniemin()
	 */
	@Column(name = "pDtygodnieMIN")
	public double getPdtygodniemin() {
		return this.Pdtygodniemin;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setPdtygodniemin(double)
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#setPdtygodniemin(double)
	 */
	public void setPdtygodniemin(double pdtygodniemin) {
		this.Pdtygodniemin = pdtygodniemin;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getPdtygodniemax()
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#getPdtygodniemax()
	 */
	@Column(name = "pDtygodnieMAX")
	public double getPdtygodniemax() {
		return this.Pdtygodniemax;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setPdtygodniemax(double)
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#setPdtygodniemax(double)
	 */
	public void setPdtygodniemax(double pdtygodniemax) {
		this.Pdtygodniemax = pdtygodniemax;
	}
	
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getDataaktualizacji()
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#getDataaktualizacji()
	 */
	@Id
	@Column(name = "DataAktualizacji",unique = true, nullable = false)
	public Date getDataaktualizacji() {
		return Dataaktualizacji;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setDataaktualizacji(java.sql.Timestamp)
	 */
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.ISpolkaDAO#setDataaktualizacji(java.sql.Timestamp)
	 */
	public void setDataaktualizacji(Timestamp Dataaktualizacji) {
		this.Dataaktualizacji =  new Timestamp(new java.util.Date().getTime());
	}
	
	
	

}
