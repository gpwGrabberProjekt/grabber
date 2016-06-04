package com.gpw.grabber.job;

import java.util.ArrayList;

import org.hibernate.Session;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerContext;
import org.quartz.SchedulerException;

import com.gpw.grabber.constants.Constants;
import com.gpw.grabber.data.ISpolka;
import com.gpw.grabber.engine.builders.SpolkaDAOBuilder;
import com.gpw.grabber.engine.database.DatabasePersistService;
import com.gpw.grabber.engine.database.HibernateUtil;
import com.gpw.grabber.engine.database.IDatabasePersistService;
import com.gpw.grabber.engine.parsing.GpwGrabberParsingEngine;
import com.gpw.grabber.engine.parsing.IGpwGrabberParsingEngine;

import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

/**
 * Klasa odpowiedzialna tworzenie zadan wykonywanych 
 * 
 */
public class GrabberJob implements Job {
	private ObservableList<ISpolka> data;
	private TableView<ISpolka> table;
	private IGpwGrabberParsingEngine parsingEngine = new GpwGrabberParsingEngine();
	private ArrayList<ISpolka> spolki;

	@SuppressWarnings("unchecked")
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("PRINT MESSAGE EVERY - job");

		SchedulerContext schedulerContext = null;
		try {
			schedulerContext = context.getScheduler().getContext();
		} catch (SchedulerException e1) {
			e1.printStackTrace();
		}
		setData((ObservableList<ISpolka>) schedulerContext.get(Constants.LIST_OF_SPOLKI));

		grabSpolkiFromWebPage();
		
		/**
		 * Transformacja Spolka na SpolkaDAO
		 * 
		 */
		IDatabasePersistService dbService=new DatabasePersistService();
		for (ISpolka iSpolka : spolki) {
			try {
				dbService.persist(SpolkaDAOBuilder.buildSpolkaDAO(iSpolka));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
			 
		}
		
		
	

	

	private void grabSpolkiFromWebPage() {
		spolki=parsingEngine.parseWebPage();
		
		data.addAll(spolki);
	}

	public ObservableList<ISpolka> getData() {
		return data;
	}

	public void setData(ObservableList<ISpolka> data) {
		this.data = data;
	}

}
