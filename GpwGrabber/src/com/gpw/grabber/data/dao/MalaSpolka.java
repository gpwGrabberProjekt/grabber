package com.gpw.grabber.data.dao;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DBmala")
public class MalaSpolka implements java.io.Serializable {
	
	private String Spolkaskrot;
	private Timestamp Dataaktualizacji;
	
	public MalaSpolka() {}

	@Id
	@Column(name = "Skr", unique = true, nullable = false)
	public String getSpolkaskrot() {
		return Spolkaskrot;
	}

	public void setSpolkaskrot(String spolkaskrot) {
		Spolkaskrot = spolkaskrot;
	}
	@Id
	@Column(name = "Odciskczasu", unique = true, nullable = false)
	public Date getDataaktualizacji() {
		return Dataaktualizacji;
	}

	public void setDataaktualizacji(Timestamp Dataaktualizacji) {
		this.Dataaktualizacji =  new Timestamp(new java.util.Date().getTime());
	}
	
	
	
	
	
}
