package com.gpw.grabber.data.dao;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;
import java.sql.Timestamp;


/**
 * Data Access Object. SpolkaDAO  - obiekt do w formacie dla bazy danych
 * Wykozystano Hibernate / JPA Annotation code
 */

@Entity
@Table(name = "Spolki")
public class SpolkaDAO implements ISpolkaDAO {
	
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
    private Date Dataaktualizacji;
	
	
	
	
	
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
	
	
	
	

	public SpolkaDAO() {}
	
	













	/**
	 * @param spolkanazwa
	 * @param spolkaskrot
	 * @param kursotw
	 * @param kursmin
	 * @param kursmax
	 * @param kursbiez
	 * @param zmprocdzienna
	 * @param czasostzmiany
	 * @param obrotszt
	 * @param obrotpln
	 * @param pdtygodniemin
	 * @param pdtygodniemax
	 * @param dataaktualizacji
	 */
	public SpolkaDAO(String spolkanazwa, String spolkaskrot, double kursotw, double kursmin, double kursmax,
			double kursbiez, double zmprocdzienna, String czasostzmiany, double obrotszt, double obrotpln,
			double pdtygodniemin, double pdtygodniemax, Date dataaktualizacji) {
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















	/**
	 * Mapowanie przez adnotacje spolkaNazwa na Nazwa
	 */
	@Column(name = "Nazwa", length = 128)
	public String getSpolkaNazwa() {
		return Spolkanazwa;
	}


	public void setSpolkaNazwa(String spolkaNazwa) {
		this.Spolkanazwa = spolkaNazwa;
	}

	/**
	 * Mapowanie przez adnotacje spolkaSkrot na Skrot
	 * + dodatkowo czesc klucza glownego
	 */
	@Id
	@Column(name = "Skrot",nullable = false, length = 16)
	public String getSpolkaSkrot() {
		return Spolkaskrot;
	}




	
	public void setSpolkaSkrot(String spolkaSkrot) {
		this.Spolkaskrot = spolkaSkrot;
	}


	/**
	 * Mapowanie przez adnotacje KursOtw na kolumne w bazie danych KursOtw
	 * 
	 */
	@Column(name = "KursOtw")
	public double getKursOtw() {
		return Kursotw;
	}





	public void setKursOtw(double kursOtw) {
		Kursotw = kursOtw;
	}




	/**
	 * Mapowanie przez adnotacje KursMin na kolumne w bazie danych KursMin
	 * 
	 */
	@Column(name = "KursMin")
	public double getKursMin() {
		return Kursmin;
	}





	public void setKursMin(double kursMin) {
		Kursmin = kursMin;
	}


	/**
	 * Mapowanie przez adnotacje KursMax na kolumne w bazie danych KursMax
	 * 
	 */

	@Column(name = "KursMax")
	public double getKursMax() {
		return Kursmax;
	}





	public void setKursMax(double kursMax) {
		Kursmax = kursMax;
	}


	/**
	 * Mapowanie przez adnotacje KursBiez na kolumne w bazie danych KursBiez
	 * 
	 */

	@Column(name = "KursBiez")
	public double getKursBiez() {
		return Kursbiez;
	}





	public void setKursBiez(double kursBiez) {
		Kursbiez = kursBiez;
	}


	/**
	 * Mapowanie przez adnotacje zmProcDzienna na kolumne w bazie danych zmProcDzienna
	 * 
	 */

	@Column(name = "zmProcDzienna")
	public double getZmProcDzienna() {
		return Zmprocdzienna;
	}





	public void setZmProcDzienna(double zmProcDzienna) {
		this.Zmprocdzienna = zmProcDzienna;
	}


	/**
	 * Mapowanie przez adnotacje czasOstZmiany na kolumne w bazie danych czasOstZmiany
	 * format danych String
	 * 
	 */

	@Column(name = "czasOstZmiany")
	public String getCzasOstZmiany() {
		return Czasostzmiany;
	}





	public void setCzasOstZmiany(String czasOstZmiany) {
		this.Czasostzmiany = czasOstZmiany;
	}


	/**
	 * Mapowanie przez adnotacje ObrotSzt na kolumne w bazie danych ObrotSzt
	 * format danych String
	 * 
	 */

	@Column(name = "ObrotSzt")
	public double getObrotSzt() {
		return Obrotszt;
	}





	public void setObrotSzt(double obrotSzt) {
		Obrotszt = obrotSzt;
	}


	/**
	 * Mapowanie przez adnotacje ObrotPLN na kolumne w bazie danych ObrotPLN
	 * format danych String
	 * 
	 */

	@Column(name = "ObrotPLN")
	public double getObrotPLN() {
		return Obrotpln;
	}





	public void setObrotPLN(double obrotPLN) {
		Obrotpln = obrotPLN;
	}


	/**
	 * Mapowanie przez adnotacje pDtygodnieMIN na kolumne w bazie danych pDtygodnieMIN
	 * 
	 * 
	 */

	@Column(name = "pDtygodnieMIN")
	public double getpDtygodnieMIN() {
		return Pdtygodniemin;
	}





	public void setpDtygodnieMIN(double pDtygodnieMIN) {
		this.Pdtygodniemin = pDtygodnieMIN;
	}

	/**
	 * Mapowanie przez adnotacje pDtygodnieMAX na kolumne w bazie danych pDtygodnieMAX
	 * 
	 * 
	 */


	@Column(name = "pDtygodnieMAX")
	public double getpDtygodnieMAX() {
		return Pdtygodniemax;
	}





	public void setpDtygodnieMAX(double pDtygodnieMAX) {
		this.Pdtygodniemax = pDtygodnieMAX;
	}

	/**
	 * Wygenerowanie znacznika czasu do bazy danych jako  DataAktualizacji
	 * 
	 * 
	 */

	@Id
	@Column(name = "DataAktualizacji")
	public Date getDataAktualizacji() {
		java.util.Date date= new java.util.Date();
		Timestamp znacznik = new Timestamp(date.getTime());
		
		return znacznik;
	}





	public void setDataAktualizacji() {
		Dataaktualizacji = new Timestamp(new java.util.Date().getTime());
	};

	
	
	

}
