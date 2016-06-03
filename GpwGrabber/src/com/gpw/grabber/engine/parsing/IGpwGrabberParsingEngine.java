package com.gpw.grabber.engine.parsing;

import java.util.ArrayList;

import com.gpw.grabber.data.ISpolka;

public interface IGpwGrabberParsingEngine {

	ArrayList<ISpolka> parseWebPage();
	ArrayList<String>  getListOfSpolkaNames();
}
