package com.gpw.grabber.job;

import java.util.ArrayList;
import java.util.Calendar;

import org.hibernate.Session;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerContext;
import org.quartz.SchedulerException;

import com.gpw.grabber.constants.Constants;
import com.gpw.grabber.data.ISpolka;
import com.gpw.grabber.data.dao.MalaSpolka;
import com.gpw.grabber.engine.builders.SpolkaDAOBuilder;
import com.gpw.grabber.engine.database.DatabasePersistService;
import com.gpw.grabber.engine.database.HibernateUtil;
import com.gpw.grabber.engine.database.IDatabasePersistService;
import com.gpw.grabber.engine.parsing.GpwGrabberParsingEngine;
import com.gpw.grabber.engine.parsing.IGpwGrabberParsingEngine;

import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public class GrabberJob implements Job {
	private ObservableList<ISpolka> data;
	private TableView<ISpolka> table;
	private IGpwGrabberParsingEngine parsingEngine = new GpwGrabberParsingEngine();
	private ArrayList<ISpolka> spolki;

	@SuppressWarnings("unchecked")
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("PRINT MESSAGE EVERY 1 minute");

		SchedulerContext schedulerContext = null;
		try {
			schedulerContext = context.getScheduler().getContext();
		} catch (SchedulerException e1) {
			e1.printStackTrace();
		}
		setData((ObservableList<ISpolka>) schedulerContext.get(Constants.LIST_OF_SPOLKI));

		grabSpolkiFromWebPage();
		
		
		/*IDatabasePersistService dbService=new DatabasePersistService();
		for (ISpolka iSpolka : spolki) {
			dbService.persist(SpolkaDAOBuilder.buildSpolkaDAO(iSpolka));
		}*/
		//DatabasePersistService dbService=new DatabasePersistService();
		//dbService.persist();
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		
		// smieci dodane do testowania czy wogole cos sie tworzy
		MalaSpolka spolka = new MalaSpolka();
		spolka.setSpolkaskrot("abc");
		Calendar calendar = Calendar.getInstance();
		//new java.sql.Timestamp(calendar.getTime().getTime());
		spolka.setDataaktualizacji(new java.sql.Timestamp(calendar.getTime().getTime()));
		
		session.save(spolka);
		
		session.getTransaction().commit();
		session.getSessionFactory().close();
		
		
		
		
		table = (TableView<ISpolka>) schedulerContext.get(Constants.TABLE_DATA);
		table.setItems(data);

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
