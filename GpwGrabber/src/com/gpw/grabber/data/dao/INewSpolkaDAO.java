package com.gpw.grabber.data.dao;

import java.sql.Timestamp;
import java.util.Date;

public interface INewSpolkaDAO {

	/**
	 * Mapowanie przez adnotacje spolkaNazwa na Nazwa
	 */
	String getSpolkanazwa();

	void setSpolkanazwa(String spolkanazwa);

	String getSpolkaskrot();

	void setSpolkaskrot(String spolkaskrot);

	double getKursotw();

	void setKursotw(double kursotw);

	double getKursmin();

	void setKursmin(double kursmin);

	double getKursmax();

	void setKursmax(double kursmax);

	double getKursbiez();

	void setKursbiez(double kursbiez);

	double getZmprocdzienna();

	void setZmprocdzienna(double zmprocdzienna);

	String getCzasostzmiany();

	void setCzasostzmiany(String czasostzmiany);

	double getObrotszt();

	void setObrotszt(double obrotszt);

	double getObrotpln();

	void setObrotpln(double obrotpln);

	double getPdtygodniemin();

	void setPdtygodniemin(double pdtygodniemin);

	double getPdtygodniemax();

	void setPdtygodniemax(double pdtygodniemax);

	Date getDataaktualizacji();

	void setDataaktualizacji(Timestamp Dataaktualizacji);

}