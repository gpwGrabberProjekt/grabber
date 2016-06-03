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
	private Timestamp Dataaktualizacji;

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

	public double getKursotw() {
		return this.Kursotw;
	}

	public void setKursotw(double kursotw) {
		this.Kursotw = kursotw;
	}

	public double getKursmin() {
		return this.Kursmin;
	}

	public void setKursmin(double kursmin) {
		this.Kursmin = kursmin;
	}

	public double getKursmax() {
		return this.Kursmax;
	}

	public void setKursmax(double kursmax) {
		this.Kursmax = kursmax;
	}

	public double getKursbiez() {
		return this.Kursbiez;
	}

	public void setKursbiez(double kursbiez) {
		this.Kursbiez = kursbiez;
	}

	public double getZmprocdzienna() {
		return this.Zmprocdzienna;
	}

	public void setZmprocdzienna(double zmprocdzienna) {
		this.Zmprocdzienna = zmprocdzienna;
	}

	public String getCzasostzmiany() {
		return this.Czasostzmiany;
	}

	public void setCzasostzmiany(String czasostzmiany) {
		this.Czasostzmiany = czasostzmiany;
	}

	public double getObrotszt() {
		return this.Obrotszt;
	}

	public void setObrotszt(double obrotszt) {
		this.Obrotszt = obrotszt;
	}

	public double getObrotpln() {
		return this.Obrotpln;
	}

	public void setObrotpln(double obrotpln) {
		this.Obrotpln = obrotpln;
	}

	public double getPdtygodniemin() {
		return this.Pdtygodniemin;
	}

	public void setPdtygodniemin(double pdtygodniemin) {
		this.Pdtygodniemin = pdtygodniemin;
	}

	public double getPdtygodniemax() {
		return this.Pdtygodniemax;
	}

	public void setPdtygodniemax(double pdtygodniemax) {
		this.Pdtygodniemax = pdtygodniemax;
	}
	
	@Id
	@Column(name = "DataAktualizacji")
	public Date getDataaktualizacji() {
		java.util.Date date= new java.util.Date();
		Timestamp Dataaktualizacji = new Timestamp(date.getTime());
		return this.Dataaktualizacji;
	}

	public void setDataaktualizacji() {
		this.Dataaktualizacji = new Timestamp(new java.util.Date().getTime());
	}

}
