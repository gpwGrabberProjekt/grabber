package com.gpw.grabber.data;

/**
 * @author GK & GS
 * Interfejs definiujacy opracje na Spolce
 *  
 */
public interface ISpolka {

	public String getDataAktualizacji();
	
	public void setDataAktualizacji(String data);
	
	public int getId();

	public void setId(int id);

	public String getSpolkaNazwa();

	public void setSpolkaNazwa(String spolkaNazwa);

	public String getNazwaSkrot();

	public void setNazwaSkrot(String nazwaSkrot);

	public double getKursOtw();

	public void setKursOtw(double kursOtw);

	public double getKursMin();

	public void setKursMin(double kursMin);

	public double getKursMax();

	public void setKursMax(double kursMax);

	public double getKursBiez();

	public void setKursBiez(double kursBiez);

	public double getZmProcDzienna();

	public void setZmProcDzienna(double zmProcDzienna);

	public String getCzasOstZmiany();

	public void setCzasOstZmiany(String czasOstZmiany);

	public double getObrotSzt();

	public void setObrotSzt(double obrotSzt);

	public double getObrotPLN();

	public void setObrotPLN(double obrotPLN);

	public double getpDtygodnieMIN();

	public void setpDtygodnieMIN(double pDtygodnieMIN);

	public double getpDtygodnieMAX();

	public void setpDtygodnieMAX(double pDtygodnieMAX);

}