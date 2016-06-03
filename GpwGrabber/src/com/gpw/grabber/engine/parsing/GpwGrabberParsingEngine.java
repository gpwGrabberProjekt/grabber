package com.gpw.grabber.engine.parsing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.gpw.grabber.data.ISpolka;
import com.gpw.grabber.engine.builders.SpolkaBuilder;


/**
 * Klasa odpowiedzialna analizowe ciągu znaków w celu ustalenia jego struktury
 * @see <a href="https://jsoup.org/">https://jsoup.org/</a>
 */
public class GpwGrabberParsingEngine implements IGpwGrabberParsingEngine {

	public ArrayList<ISpolka> parseWebPage() {

		Document doc;
		String str = "";
		List<List<String>> lista = new ArrayList<List<String>>();
		try {
			// need http protocol
			doc = Jsoup.connect("http://www.money.pl/gielda/gpw/akcje/").get();
			// get all links
			Elements rows = doc.select("tr");
			int i = 0;
			for (Element row : rows) {
				i++;
				Elements columns = row.select("td");
				List<String> wiersz = new ArrayList<String>();
				for (Element col : columns) {
					str = col.text();
					wiersz.add(col.text());
				}
				lista.add(wiersz);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		lista.remove(0);
		lista.remove(0);

		ArrayList<ISpolka> spolki = new ArrayList<ISpolka>();

		for (int i = 0; i < lista.size(); i++) {
			List<String> wiersz = lista.get(i);
			if (!wiersz.isEmpty()) {
				spolki.add(SpolkaBuilder.buildSpolka(wiersz));
			}
		}

		return spolki;

	}
	
	

	public ArrayList<String> getListOfSpolkaNames() {
		ArrayList<ISpolka> listOfSpolki = parseWebPage();
		ArrayList<String> spolkiNames = new ArrayList<String>();
		for (ISpolka spolka : listOfSpolki) {
			spolkiNames.add(spolka.getSpolkaNazwa());
		}
		return spolkiNames;
	}

}
