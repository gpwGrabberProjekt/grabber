package com.gpw.grabber.engine.builders;

import java.sql.Timestamp;
import java.util.List;


import com.gpw.grabber.data.dao.SpolkaDAO;
import com.gpw.grabber.data.ISpolka;
import com.gpw.grabber.data.Spolka;
import com.gpw.grabber.data.dao.ISpolkaDAO;
/**
 * Klasa odpowiedzialna z tworzenie obiektow typu SpolkaDAO
 * na podstawie wczesniej stworzonego obiektu Spolka
 * @param spolka Wymagany obiek spolka
 * @author G.S 
 */
public class SpolkaDAOBuilder {

	public static ISpolkaDAO buildSpolkaDAO(ISpolka spolka){
		
		String Spolkanazwa= spolka.getSpolkaNazwa();
		String Spolkaskrot = spolka.getNazwaSkrot();
		double Kursotw = spolka.getKursOtw();
		double Kursmin = spolka.getKursMin();
		double Kursmax = spolka.getKursMax();
		double Kursbiez = spolka.getKursBiez();
		double Zmprocdzienna = spolka.getZmProcDzienna();
		String Czasostzmiany = spolka.getCzasOstZmiany().toString();
		double Obrotszt = spolka.getObrotSzt();
		double Obrotpln= spolka.getObrotPLN();
		double Pdtygodniemin = spolka.getpDtygodnieMIN();
		double Pdtygodniemax = spolka.getpDtygodnieMAX();
		Timestamp Dataaktualizacji = new Timestamp(new java.util.Date().getTime());
		
		ISpolkaDAO spolkadao = new SpolkaDAO(Spolkanazwa, Spolkaskrot, Kursotw, Kursmin, Kursmax,
				Kursbiez, Zmprocdzienna, Czasostzmiany, Obrotszt,  Obrotpln,
				Pdtygodniemin, Pdtygodniemax, Dataaktualizacji);
		
		return spolkadao;
	}
}
