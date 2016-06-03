package com.gpw.grabber.utility;

import com.gpw.grabber.engine.parsing.GpwGrabberParsingEngine;
import com.gpw.grabber.engine.parsing.IGpwGrabberParsingEngine;

import javafx.scene.control.ComboBox;

public class InitSpolkaComboValues {

	public static void initComboValues(ComboBox<String> comboSpolkiList) {
		IGpwGrabberParsingEngine parser = new GpwGrabberParsingEngine();
		comboSpolkiList.getItems().addAll(parser.getListOfSpolkaNames());
	}

}
