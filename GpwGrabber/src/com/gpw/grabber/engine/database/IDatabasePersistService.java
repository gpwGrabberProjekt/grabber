package com.gpw.grabber.engine.database;

import com.gpw.grabber.data.dao.ISpolkaDAO;
/**
 * Interfejs kolekcja metody abstrakcyjnej persist
 * @author G.S 
 */

public interface IDatabasePersistService {
	
	public void persist(ISpolkaDAO spolkaDAO) throws Exception;
	
}
