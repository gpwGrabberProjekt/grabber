package com.gpw.grabber.data.dao;

import java.util.Date;

public interface ISpolkaDAO {
	
	public String getSpolkaNazwa();
	public void setSpolkaNazwa(String spolkaNazwa);
	public String getSpolkaSkrot();
	public void setSpolkaSkrot(String spolkaSkrot);
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
	public void getObrotPLN();
	public void setObrotPLN(double obrotPLN);
	public double getpDtygodnieMIN();
	public void setpDtygodnieMIN(double pDtygodnieMIN);
	public double getpDtygodnieMAX();
	public void setpDtygodnieMAX(double pDtygodnieMAX);
	public Date getDataAktualizacji();
	public void setDataAktualizacji(Date dataAktualizacji);
	

}