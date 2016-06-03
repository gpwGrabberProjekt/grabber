package com.gpw.grabber.data.dao;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Spolki")
public class NewSpolkaDAO implements java.io.Serializable, INewSpolkaDAO {

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
	
	
	public NewSpolkaDAO() {}

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
	public NewSpolkaDAO(String spolkanazwa, String spolkaskrot, double kursotw, double kursmin, double kursmax,
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
	
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getSpolkanazwa()
	 */
	@Column(name = "Nazwa", length = 128)
	public String getSpolkanazwa() {
		return this.Spolkanazwa;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setSpolkanazwa(java.lang.String)
	 */
	public void setSpolkanazwa(String spolkanazwa) {
		this.Spolkanazwa = spolkanazwa;
	}
	
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getSpolkaskrot()
	 */
	@Id
	@Column(name = "Skrot", unique = true, nullable = false)
	public String getSpolkaskrot() {
		return this.Spolkaskrot;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setSpolkaskrot(java.lang.String)
	 */
	public void setSpolkaskrot(String spolkaskrot) {
		this.Spolkaskrot = spolkaskrot;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getKursotw()
	 */
	@Column(name = "KursOtw")
	public double getKursotw() {
		return this.Kursotw;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setKursotw(double)
	 */
	public void setKursotw(double kursotw) {
		this.Kursotw = kursotw;
	}
	
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getKursmin()
	 */
	@Column(name = "KursMin")
	public double getKursmin() {
		return this.Kursmin;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setKursmin(double)
	 */
	public void setKursmin(double kursmin) {
		this.Kursmin = kursmin;
	}
	
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getKursmax()
	 */
	@Column(name = "KursMax")
	public double getKursmax() {
		return this.Kursmax;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setKursmax(double)
	 */
	public void setKursmax(double kursmax) {
		this.Kursmax = kursmax;
	}
	
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getKursbiez()
	 */
	@Column(name = "KursBiez")
	public double getKursbiez() {
		return this.Kursbiez;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setKursbiez(double)
	 */
	public void setKursbiez(double kursbiez) {
		this.Kursbiez = kursbiez;
	}
	
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getZmprocdzienna()
	 */
	@Column(name = "zmProcDzienna")
	public double getZmprocdzienna() {
		return this.Zmprocdzienna;
	}
	
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setZmprocdzienna(double)
	 */
	public void setZmprocdzienna(double zmprocdzienna) {
		this.Zmprocdzienna = zmprocdzienna;
	}
	
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getCzasostzmiany()
	 */
	@Column(name = "czasOstZmiany")
	public String getCzasostzmiany() {
		return this.Czasostzmiany;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setCzasostzmiany(java.lang.String)
	 */
	public void setCzasostzmiany(String czasostzmiany) {
		this.Czasostzmiany = czasostzmiany;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getObrotszt()
	 */
	@Column(name = "ObrotSzt")
	public double getObrotszt() {
		return this.Obrotszt;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setObrotszt(double)
	 */
	public void setObrotszt(double obrotszt) {
		this.Obrotszt = obrotszt;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getObrotpln()
	 */
	@Column(name = "ObrotPLN")
	public double getObrotpln() {
		return this.Obrotpln;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setObrotpln(double)
	 */
	public void setObrotpln(double obrotpln) {
		this.Obrotpln = obrotpln;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getPdtygodniemin()
	 */
	@Column(name = "pDtygodnieMIN")
	public double getPdtygodniemin() {
		return this.Pdtygodniemin;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setPdtygodniemin(double)
	 */
	public void setPdtygodniemin(double pdtygodniemin) {
		this.Pdtygodniemin = pdtygodniemin;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getPdtygodniemax()
	 */
	@Column(name = "pDtygodnieMAX")
	public double getPdtygodniemax() {
		return this.Pdtygodniemax;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setPdtygodniemax(double)
	 */
	public void setPdtygodniemax(double pdtygodniemax) {
		this.Pdtygodniemax = pdtygodniemax;
	}
	
	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getDataaktualizacji()
	 */
	@Id
	@Column(name = "DataAktualizacji",unique = true, nullable = false)
	public Date getDataaktualizacji() {
		return Dataaktualizacji;
	}

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setDataaktualizacji(java.sql.Timestamp)
	 */
	public void setDataaktualizacji(Timestamp Dataaktualizacji) {
		this.Dataaktualizacji =  new Timestamp(new java.util.Date().getTime());
	}
	

	
}
