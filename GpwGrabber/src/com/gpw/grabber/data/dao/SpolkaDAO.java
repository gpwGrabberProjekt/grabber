package com.gpw.grabber.data.dao;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Data Access Object. SpolkaDAO  - obiekt do w formacie dla bazy danych
 * Wykozystano Hibernate / JPA Annotation code
 */

@Entity
@Table(name = "DBSpolki")
public class SpolkaDAO implements ISpolkaDAO {
	
	private String spolkaNazwa;
	private String spolkaSkrot;
	private double KursOtw;
	private double KursMin;
	private double KursMax;
	private double KursBiez;
	private double zmProcDzienna;
	private String czasOstZmiany;
	private double ObrotSzt;         
	private double ObrotPLN;     
	private double pDtygodnieMIN;    
	private double pDtygodnieMAX;  
    private Date DataAktualizacji;
	
	
	
	
	
	/*Nazwa            VARCHAR2 (128 CHAR) ,
	    Skrot            VARCHAR2 (16 CHAR) NOT NULL ,
	    KursOtw          NUMBER ,
	    KursMin          NUMBER ,
	    KursMax          NUMBER ,
	    KursBiez         NUMBER ,
	    zmProcDzienna    NUMBER ,
	    czasOstZmiany    VARCHAR2 (16 CHAR) ,
	    ObrotSzt         NUMBER ,
	    ObrotPLN         NUMBER ,
	    pDtygodnieMIN    NUMBER ,
	    pDtygodnieMAX    NUMBER ,
	    DataAktualizacji DATE NOT NULL*/
	
	
	
	

	public SpolkaDAO() {
	}


	public SpolkaDAO(String spolkaNazwa, String spolkaSkrot, double kursOtw, double kursMin, double kursMax,
			double kursBiez, double zmProcDzienna, String czasOstZmiany, double obrotSzt, double obrotPLN,
			double pDtygodnieMIN, double pDtygodnieMAX) {
		super();
		this.spolkaNazwa = spolkaNazwa;
		this.spolkaSkrot = spolkaSkrot;
		this.KursOtw = kursOtw;
		this.KursMin = kursMin;
		this.KursMax = kursMax;
		this.KursBiez = kursBiez;
		this.zmProcDzienna = zmProcDzienna;
		this.czasOstZmiany = czasOstZmiany;
		this.ObrotSzt = obrotSzt;
		this.ObrotPLN = obrotPLN;
		this.pDtygodnieMIN = pDtygodnieMIN;
		this.pDtygodnieMAX = pDtygodnieMAX;
	}


	/**
	 * Mapowanie przez adnotacje spolkaNazwa na Nazwa
	 */
	@Column(name = "Nazwa", length = 128)
	public String getSpolkaNazwa() {
		return spolkaNazwa;
	}


	public void setSpolkaNazwa(String spolkaNazwa) {
		this.spolkaNazwa = spolkaNazwa;
	}

	/**
	 * Mapowanie przez adnotacje spolkaSkrot na Skrot
	 * + dodatkowo czesc klucza glownego
	 */
	@Id
	@Column(name = "Skrot",nullable = false, length = 16)
	public String getSpolkaSkrot() {
		return spolkaSkrot;
	}




	
	public void setSpolkaSkrot(String spolkaSkrot) {
		this.spolkaSkrot = spolkaSkrot;
	}


	/**
	 * Mapowanie przez adnotacje KursOtw na kolumne w bazie danych KursOtw
	 * 
	 */
	@Column(name = "KursOtw")
	public double getKursOtw() {
		return KursOtw;
	}





	public void setKursOtw(double kursOtw) {
		KursOtw = kursOtw;
	}




	/**
	 * Mapowanie przez adnotacje KursMin na kolumne w bazie danych KursMin
	 * 
	 */
	@Column(name = "KursMin")
	public double getKursMin() {
		return KursMin;
	}





	public void setKursMin(double kursMin) {
		KursMin = kursMin;
	}


	/**
	 * Mapowanie przez adnotacje KursMax na kolumne w bazie danych KursMax
	 * 
	 */

	@Column(name = "KursMax")
	public double getKursMax() {
		return KursMax;
	}





	public void setKursMax(double kursMax) {
		KursMax = kursMax;
	}


	/**
	 * Mapowanie przez adnotacje KursBiez na kolumne w bazie danych KursBiez
	 * 
	 */

	@Column(name = "KursBiez")
	public double getKursBiez() {
		return KursBiez;
	}





	public void setKursBiez(double kursBiez) {
		KursBiez = kursBiez;
	}


	/**
	 * Mapowanie przez adnotacje zmProcDzienna na kolumne w bazie danych zmProcDzienna
	 * 
	 */

	@Column(name = "zmProcDzienna")
	public double getZmProcDzienna() {
		return zmProcDzienna;
	}





	public void setZmProcDzienna(double zmProcDzienna) {
		this.zmProcDzienna = zmProcDzienna;
	}


	/**
	 * Mapowanie przez adnotacje czasOstZmiany na kolumne w bazie danych czasOstZmiany
	 * format danych String
	 * 
	 */

	@Column(name = "czasOstZmiany")
	public String getCzasOstZmiany() {
		return czasOstZmiany;
	}





	public void setCzasOstZmiany(String czasOstZmiany) {
		this.czasOstZmiany = czasOstZmiany;
	}


	/**
	 * Mapowanie przez adnotacje ObrotSzt na kolumne w bazie danych ObrotSzt
	 * format danych String
	 * 
	 */

	@Column(name = "ObrotSzt")
	public double getObrotSzt() {
		return ObrotSzt;
	}





	public void setObrotSzt(double obrotSzt) {
		ObrotSzt = obrotSzt;
	}


	/**
	 * Mapowanie przez adnotacje ObrotPLN na kolumne w bazie danych ObrotPLN
	 * format danych String
	 * 
	 */

	@Column(name = "ObrotPLN")
	public double getObrotPLN() {
		return ObrotPLN;
	}





	public void setObrotPLN(double obrotPLN) {
		ObrotPLN = obrotPLN;
	}


	/**
	 * Mapowanie przez adnotacje pDtygodnieMIN na kolumne w bazie danych pDtygodnieMIN
	 * 
	 * 
	 */

	@Column(name = "pDtygodnieMIN")
	public double getpDtygodnieMIN() {
		return pDtygodnieMIN;
	}





	public void setpDtygodnieMIN(double pDtygodnieMIN) {
		this.pDtygodnieMIN = pDtygodnieMIN;
	}

	/**
	 * Mapowanie przez adnotacje pDtygodnieMAX na kolumne w bazie danych pDtygodnieMAX
	 * 
	 * 
	 */


	@Column(name = "pDtygodnieMAX")
	public double getpDtygodnieMAX() {
		return pDtygodnieMAX;
	}





	public void setpDtygodnieMAX(double pDtygodnieMAX) {
		this.pDtygodnieMAX = pDtygodnieMAX;
	}

	/**
	 * Wygenerowanie znacznika czasu do bazy danych jako  DataAktualizacji
	 * 
	 * 
	 */


	@Column(name = "DataAktualizacji")
	public Date getDataAktualizacji() {
		java.util.Date date= new java.util.Date();
		Timestamp znacznik = new Timestamp(date.getTime());
		return znacznik;
	}





	public void setDataAktualizacji(Date dataAktualizacji) {
		DataAktualizacji = dataAktualizacji;
	};

	
	
	

}
