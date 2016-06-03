package com.gpw.grabber.data.dao;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Spolki")
public class NewSpolkaDAO implements java.io.Serializable {

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
	
	/**
	 * Mapowanie przez adnotacje spolkaNazwa na Nazwa
	 */
	@Column(name = "Nazwa", length = 128)
	public String getSpolkanazwa() {
		return this.Spolkanazwa;
	}

	public void setSpolkanazwa(String spolkanazwa) {
		this.Spolkanazwa = spolkanazwa;
	}
	
	@Id
	@Column(name = "SSkrot", unique = true, nullable = false)
	public String getSpolkaskrot() {
		return this.Spolkaskrot;
	}

	public void setSpolkaskrot(String spolkaskrot) {
		this.Spolkaskrot = spolkaskrot;
	}

	@Column(name = "KursOtw")
	public double getKursotw() {
		return this.Kursotw;
	}

	public void setKursotw(double kursotw) {
		this.Kursotw = kursotw;
	}
	
	@Column(name = "KursMin")
	public double getKursmin() {
		return this.Kursmin;
	}

	public void setKursmin(double kursmin) {
		this.Kursmin = kursmin;
	}
	
	@Column(name = "KursMax")
	public double getKursmax() {
		return this.Kursmax;
	}

	public void setKursmax(double kursmax) {
		this.Kursmax = kursmax;
	}
	
	@Column(name = "KursBiez")
	public double getKursbiez() {
		return this.Kursbiez;
	}

	public void setKursbiez(double kursbiez) {
		this.Kursbiez = kursbiez;
	}
	
	@Column(name = "zmProcDzienna")
	public double getZmprocdzienna() {
		return this.Zmprocdzienna;
	}
	
	public void setZmprocdzienna(double zmprocdzienna) {
		this.Zmprocdzienna = zmprocdzienna;
	}
	
	@Column(name = "czasOstZmiany")
	public String getCzasostzmiany() {
		return this.Czasostzmiany;
	}

	public void setCzasostzmiany(String czasostzmiany) {
		this.Czasostzmiany = czasostzmiany;
	}

	@Column(name = "ObrotSzt")
	public double getObrotszt() {
		return this.Obrotszt;
	}

	public void setObrotszt(double obrotszt) {
		this.Obrotszt = obrotszt;
	}

	@Column(name = "ObrotPLN")
	public double getObrotpln() {
		return this.Obrotpln;
	}

	public void setObrotpln(double obrotpln) {
		this.Obrotpln = obrotpln;
	}

	@Column(name = "pDtygodnieMIN")
	public double getPdtygodniemin() {
		return this.Pdtygodniemin;
	}

	public void setPdtygodniemin(double pdtygodniemin) {
		this.Pdtygodniemin = pdtygodniemin;
	}

	@Column(name = "pDtygodnieMAX")
	public double getPdtygodniemax() {
		return this.Pdtygodniemax;
	}

	public void setPdtygodniemax(double pdtygodniemax) {
		this.Pdtygodniemax = pdtygodniemax;
	}
	
	@Id
	@Column(name = "DataAktualizacji",unique = true, nullable = false)
	public Date getDataaktualizacji() {
		return Dataaktualizacji;
	}

	public void setDataaktualizacji(Timestamp Dataaktualizacji) {
		this.Dataaktualizacji =  new Timestamp(new java.util.Date().getTime());
	}
	

	
}
