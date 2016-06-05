package com.gpw.grabber.engine.parsing;

import java.util.ArrayList;

import com.gpw.grabber.data.ISpolka;


/**
 * @author GK & GS
 * Klasa odpowiedzialna analizowe ciągu znaków w celu ustalenia jego struktury
 * @see <a href="https://jsoup.org/">https://jsoup.org/</a>
 */
public interface IGpwGrabberParsingEngine {

	/**
	 * Metoda parsuj�ca tabele danych sp�ek
	 * @return lista wierszy tabeli sp�ek
	 */
	ArrayList<ISpolka> parseWebPage();
	/**
	 * @return Metoda zwracaj�ca liste nazw sp�ek
	 */
	ArrayList<String>  getListOfSpolkaNames();
}
