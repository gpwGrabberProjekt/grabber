package com.gpw.grabber.engine.parsing;

import java.util.ArrayList;

import com.gpw.grabber.data.ISpolka;


/**
 * @author GK & GS
 * Klasa odpowiedzialna analizowe ciÄ…gu znakÃ³w w celu ustalenia jego struktury
 * @see <a href="https://jsoup.org/">https://jsoup.org/</a>
 */
public interface IGpwGrabberParsingEngine {

	/**
	 * Metoda parsuj¹ca tabele danych spó³ek
	 * @return lista wierszy tabeli spó³ek
	 */
	ArrayList<ISpolka> parseWebPage();
	/**
	 * @return Metoda zwracaj¹ca liste nazw spó³ek
	 */
	ArrayList<String>  getListOfSpolkaNames();
}
