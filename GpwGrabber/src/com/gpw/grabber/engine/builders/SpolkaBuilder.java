package com.gpw.grabber.engine.builders;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.gpw.grabber.data.ISpolka;
import com.gpw.grabber.data.Spolka;
/**
 * Klasa odpowiedzialna z tworzenie obiektow typu Spolka na podstawie przetworzonych wierszy z strony WWW
 * 
 */
public class SpolkaBuilder {
	private static int counter = 0;

	public static ISpolka buildSpolka(List<String> wiersz) {

		String spolkaNazwa = wiersz.get(0);
		String nazwaSkrot = wiersz.get(2);
		Double kursOtw = convertToDouble(wiersz.get(3));
		Double kursMin = convertToDouble(wiersz.get(4));
		Double kursMax = convertToDouble(wiersz.get(5));
		Double kursBiez = convertToDouble(wiersz.get(6));
		Double zmProcDzienna = convertToDouble(wiersz.get(7));
		String czasOstZmiany = wiersz.get(8);
		Double obrotSzt = convertToDouble(wiersz.get(9));
		Double obrotPLN = convertToDouble(wiersz.get(10));
		Double pDtygodnieMIN = convertToDouble(wiersz.get(11));
		Double pDtygodnieMAX = convertToDouble(wiersz.get(12));
		String dataAktualizacji=(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss")).format(GregorianCalendar.getInstance().getTime());

		ISpolka spolka = new Spolka(counter++, spolkaNazwa, nazwaSkrot, kursOtw, kursMin, kursMax, kursBiez,
				zmProcDzienna, czasOstZmiany, obrotSzt, obrotPLN, pDtygodnieMIN, pDtygodnieMAX,dataAktualizacji);

		return spolka;

	}
	/**
	 * Metoda konwertujaca tekst  wartości typu Double
	 */
	private static double convertToDouble(String string) {

		if (!string.contentEquals("-") && !string.contentEquals("PKC/PCR")) {
			string = string.replace(",", ".");
			string = string.replace(" ", "");

			return Double.parseDouble(string);
		} else {
			return 0;
		}
	}
	/**
	 * Metoda konwetujaca Date pobrana z tabeli z strony WWW na format Java 
	 */
	private static Date convertToDate(String date) {

		if (!date.contentEquals("-")) {
			DateFormat df = new SimpleDateFormat("HH:mm:ss");
			try {
				Date result = df.parse(date);

				return result;
			} catch (ParseException e) {

				e.printStackTrace();
				return new Date();
			}
		} else {
			return new Date();
		}
	}

}
