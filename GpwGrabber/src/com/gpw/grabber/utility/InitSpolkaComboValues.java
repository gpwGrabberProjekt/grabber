package com.gpw.grabber.utility;

import com.gpw.grabber.engine.parsing.GpwGrabberParsingEngine;
import com.gpw.grabber.engine.parsing.IGpwGrabberParsingEngine;

import javafx.scene.control.ComboBox;

/**
 * 
 * @author GK
 * 
 *  Klasa odpowiedzialna za inicjacj� listy nazw sp�ek
 *
 */
public class InitSpolkaComboValues {
	/**
	 * metoda inicjalizuj�ca list� nazw sp�ek
	 * @param comboSpolkiList
	 */
	public static void initComboValues(ComboBox<String> comboSpolkiList) {
		IGpwGrabberParsingEngine parser = new GpwGrabberParsingEngine();
		comboSpolkiList.getItems().addAll(parser.getListOfSpolkaNames());
	}

}
