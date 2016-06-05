package com.gpw.grabber.data;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * @author GK & GS
 * Klasa odpowiedzialna za Spolke
 *  
 */
public class Spolka implements ISpolka {

	private SimpleIntegerProperty id;
	private SimpleStringProperty spolkaNazwa;
	private SimpleStringProperty nazwaSkrot;
	private SimpleDoubleProperty kursOtw;
	private SimpleDoubleProperty kursMin;
	private SimpleDoubleProperty kursMax;
	private SimpleDoubleProperty kursBiez;
	private SimpleDoubleProperty zmProcDzienna;
	private SimpleStringProperty czasOstZmiany;
	private SimpleDoubleProperty obrotSzt;
	private SimpleDoubleProperty obrotPLN;
	private SimpleDoubleProperty pDtygodnieMIN;
	private SimpleDoubleProperty pDtygodnieMAX;
	private SimpleStringProperty dataAktualizacji;

	public Spolka(int id, String spolkaNazwa, String nazwaSkrot, Double kursOtw, Double kursMin, Double kursMax,
			Double kursBiez, Double zmProcDzienna, String czasOstZmiany, Double obrotSzt, Double obrotPLN,
			Double pDtygodnieMIN, Double pDtygodnieMAX, String dataAktualizacji) {
		super();
		this.id = new SimpleIntegerProperty(id);
		this.spolkaNazwa = new SimpleStringProperty(spolkaNazwa);
		this.nazwaSkrot = new SimpleStringProperty(nazwaSkrot);
		this.kursOtw = new SimpleDoubleProperty(kursOtw);
		this.kursMin = new SimpleDoubleProperty(kursMin);
		this.kursMax = new SimpleDoubleProperty(kursMax);
		this.kursBiez = new SimpleDoubleProperty(kursBiez);
		this.zmProcDzienna = new SimpleDoubleProperty(zmProcDzienna);
		this.czasOstZmiany = new SimpleStringProperty(czasOstZmiany);
		this.obrotSzt = new SimpleDoubleProperty(obrotSzt);
		this.obrotPLN = new SimpleDoubleProperty(obrotPLN);
		this.pDtygodnieMIN = new SimpleDoubleProperty(pDtygodnieMIN);
		this.pDtygodnieMAX = new SimpleDoubleProperty(pDtygodnieMAX);
		this.dataAktualizacji = new SimpleStringProperty(dataAktualizacji);
	}

	public int getId() {
		return id.get();
	}

	public void setId(int id) {
		this.id.set(id);
	}

	public String getSpolkaNazwa() {
		return spolkaNazwa.get();
	}

	public void setSpolkaNazwa(String spolkaNazwa) {
		this.spolkaNazwa.set(spolkaNazwa);
	}

	public String getNazwaSkrot() {
		return nazwaSkrot.get();
	}

	public void setNazwaSkrot(String nazwaSkrot) {
		this.nazwaSkrot.set(nazwaSkrot);
	}

	public double getKursOtw() {
		return kursOtw.get();
	}

	public void setKursOtw(double kursOtw) {
		this.kursOtw.set(kursOtw);
	}

	public double getKursMin() {
		return kursMin.get();
	}

	public void setKursMin(double kursMin) {
		this.kursMin.set(kursMin);
	}

	public double getKursMax() {
		return kursMax.get();
	}

	public void setKursMax(double kursMax) {
		this.kursMax.set(kursMax);
	}

	public double getKursBiez() {
		return kursBiez.get();
	}

	public void setKursBiez(double kursBiez) {
		this.kursBiez.set(kursBiez);
	}

	public double getZmProcDzienna() {
		return zmProcDzienna.get();
	}

	public void setZmProcDzienna(double zmProcDzienna) {
		this.zmProcDzienna.set(zmProcDzienna);
	}

	public String getCzasOstZmiany() {
		return czasOstZmiany.get();
	}

	public void setCzasOstZmiany(String czasOstZmiany) {
		this.czasOstZmiany.set(czasOstZmiany);
	}

	public double getObrotSzt() {
		return obrotSzt.get();
	}

	public void setObrotSzt(double obrotSzt) {
		this.obrotSzt.set(obrotSzt);
	}

	public double getObrotPLN() {
		return obrotPLN.get();
	}

	public void setObrotPLN(double obrotPLN) {
		this.obrotPLN.set(obrotPLN);
	}

	public double getpDtygodnieMIN() {
		return pDtygodnieMIN.get();
	}

	public void setpDtygodnieMIN(double pDtygodnieMIN) {
		this.pDtygodnieMIN.set(pDtygodnieMIN);
	}

	public double getpDtygodnieMAX() {
		return pDtygodnieMAX.get();
	}

	public void setpDtygodnieMAX(double pDtygodnieMAX) {
		this.pDtygodnieMAX.set(pDtygodnieMAX);
	}

	public String getDataAktualizacji() {

		return dataAktualizacji.get();
	}

	public void setDataAktualizacji(String data) {
		this.dataAktualizacji.set(data);

	}

}
