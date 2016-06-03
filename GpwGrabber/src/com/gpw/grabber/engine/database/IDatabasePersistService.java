package com.gpw.grabber.engine.database;

import com.gpw.grabber.data.dao.ISpolkaDAO;

public interface IDatabasePersistService {
	
	public void persist(ISpolkaDAO spolkaDAO) throws Exception;
	
}
