package com.gpw.grabber.utility;

import com.gpw.grabber.engine.parsing.GpwGrabberParsingEngine;
import com.gpw.grabber.engine.parsing.IGpwGrabberParsingEngine;

import javafx.scene.control.ComboBox;

/**
 * 
 * @author GK
 * 
 *  Klasa odpowiedzialna za inicjacjê listy nazw spó³ek
 *
 */
public class InitSpolkaComboValues {
	/**
	 * metoda inicjalizuj¹ca listê nazw spó³ek
	 * @param comboSpolkiList
	 */
	public static void initComboValues(ComboBox<String> comboSpolkiList) {
		IGpwGrabberParsingEngine parser = new GpwGrabberParsingEngine();
		comboSpolkiList.getItems().addAll(parser.getListOfSpolkaNames());
	}

}
