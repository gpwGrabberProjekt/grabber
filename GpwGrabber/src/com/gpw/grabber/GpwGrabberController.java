package com.gpw.grabber;

import java.net.URL;
import java.util.ResourceBundle;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import com.gpw.grabber.constants.Constants;
import com.gpw.grabber.data.Spolka;
import com.gpw.grabber.job.GrabberJob;
import com.gpw.grabber.utility.InitSpolkaComboValues;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


/**
 * Kontroler
 */

public class GpwGrabberController implements Initializable {

	private ObservableList<Spolka> data = FXCollections.observableArrayList();
	private ObservableList<Spolka> dataOfOneSpolka = FXCollections.observableArrayList();
	private ObservableList<XYChart.Series<String, Double>> lineChartData = FXCollections.observableArrayList();
	private LineChart.Series<String, Double> series1 = new LineChart.Series<String, Double>();
	private Scheduler scheduler;
	private Trigger trigger;
	private JobDetail job;
	private Boolean isSeriesAdded = false;

	
	/**
	 * Deklaracja dla JavaFX Scene Builder 
	 */
	
	@FXML
	private TableView<Spolka> table;
	@FXML
	private TableView<Spolka> tableOfOneSpolka;
	@FXML
	private TextField regexp;
	@FXML
	private TableColumn<Spolka, String> spolkaNazwaCol;
	@FXML
	private TableColumn<Spolka, String> nazwaSkrotCol;
	@FXML
	private TableColumn<Spolka, String> idCol;
	@FXML
	private TableColumn<Spolka, String> kursOtwCol;
	@FXML
	private TableColumn<Spolka, String> kursMinCol;
	@FXML
	private TableColumn<Spolka, String> kursMaxCol;
	@FXML
	private TableColumn<Spolka, String> kursBiezCol;
	@FXML
	private TableColumn<Spolka, String> zmProcDziennaCol;
	@FXML
	private TableColumn<Spolka, String> czasOstZmianyCol;
	@FXML
	private TableColumn<Spolka, String> obrotSztCol;
	@FXML
	private TableColumn<Spolka, String> obrotPLNCol;
	@FXML
	private TableColumn<Spolka, String> pDtygodnieMINCol;
	@FXML
	private TableColumn<Spolka, String> pDtygodnieMAXCol;
	@FXML
	private TableColumn<Spolka, String> dataAktualizacjiCol;
	@FXML
	private TableColumn<Spolka, String> spolkaNazwaCol2;
	@FXML
	private TableColumn<Spolka, String> nazwaSkrotCol2;
	@FXML
	private TableColumn<Spolka, String> idCol2;
	@FXML
	private TableColumn<Spolka, String> kursOtwCol2;
	@FXML
	private TableColumn<Spolka, String> kursMinCol2;
	@FXML
	private TableColumn<Spolka, String> kursMaxCol2;
	@FXML
	private TableColumn<Spolka, String> kursBiezCol2;
	@FXML
	private TableColumn<Spolka, String> zmProcDziennaCol2;
	@FXML
	private TableColumn<Spolka, String> czasOstZmianyCol2;
	@FXML
	private TableColumn<Spolka, String> obrotSztCol2;
	@FXML
	private TableColumn<Spolka, String> obrotPLNCol2;
	@FXML
	private TableColumn<Spolka, String> pDtygodnieMINCol2;
	@FXML
	private TableColumn<Spolka, String> pDtygodnieMAXCol2;
	@FXML
	private TableColumn<Spolka, String> dataAktualizacjiCol2;
	@FXML
	private ComboBox<String> comboSpolkiList;

	@FXML
	private LineChart<String, Double> wykresSpolek;

	public void startGrabberJob() throws SchedulerException {
		scheduler.resumeJob(job.getKey());
		System.out.println("Start grabber job");
	}

	/**
	 * Deklaracja metod JavaFX Scene Builder 
	 */
	
	
	/**
	 * 
	 * @param dataaktualizacji Znacznik generowany przez aplikacje
	 */
	
	
	@FXML
	public void loadDataOfSpolka() {
		String selectedSpolka = comboSpolkiList.getValue();
		dataOfOneSpolka.clear();
		for (Spolka spolka : data) {
			if (selectedSpolka != null && selectedSpolka.equalsIgnoreCase(spolka.getSpolkaNazwa())) {
				dataOfOneSpolka.add(spolka);
			}
		}
		tableOfOneSpolka.setItems(dataOfOneSpolka);
	}

	@FXML
	public void stopGrabberJob() throws SchedulerException {
		scheduler.pauseJob(job.getKey());
		System.out.println("Stop Grabber JOb");
	}

	public void initialize(URL arg0, ResourceBundle arg1) {

		createTables();
		createChart();
		tableOfOneSpolka.setItems(dataOfOneSpolka);
		tableOfOneSpolka.setEditable(false);
		table.setItems(data);
		table.setEditable(false);

		// trigger scheduler every minute
		regexp.setText("0/5 * * * * ? *");

		job = JobBuilder.newJob(GrabberJob.class).withIdentity("dummyJobName", "group1").build();

		trigger = TriggerBuilder.newTrigger().withIdentity("dummyTriggerName", "group1")
				.withSchedule(CronScheduleBuilder.cronSchedule(regexp.getText())).build();

		// schedule it
		try {
			scheduler = new StdSchedulerFactory().getScheduler();
			scheduler.start();
			scheduler.scheduleJob(job, trigger);
			scheduler.pauseJob(job.getKey());
			scheduler.getContext().put(Constants.LIST_OF_SPOLKI, data);
			scheduler.getContext().put(Constants.TABLE_DATA, table);
		} catch (SchedulerException e) {
			e.printStackTrace();
		}

		InitSpolkaComboValues.initComboValues(comboSpolkiList);
	}

	@FXML
	private void createChart() {

		if (!dataOfOneSpolka.isEmpty()) {
			for (Spolka spolka : dataOfOneSpolka) {
				series1.setName(spolka.getSpolkaNazwa());
				series1.getData().add(new XYChart.Data<String, Double>(spolka.getDataAktualizacji().toString(),
						spolka.getKursBiez()));
			}

			if (!isSeriesAdded) {
				lineChartData.add(series1);
				wykresSpolek.setData(lineChartData);
				wykresSpolek.createSymbolsProperty();
				isSeriesAdded = true;
			} else if (isSeriesAdded && !series1.equals(lineChartData.get(0))) {
				lineChartData.add(series1);
				wykresSpolek.setData(lineChartData);
				wykresSpolek.createSymbolsProperty();
				isSeriesAdded = true;
			}

		}

	}

	@FXML
	private void getCronExpression() {
		Trigger newTrigger = TriggerBuilder.newTrigger().withIdentity("dummyTriggerName", "group1")
				.withSchedule(CronScheduleBuilder.cronSchedule(regexp.getText())).build();

		try {
			scheduler.addJob(job, true, true);
			scheduler.rescheduleJob(trigger.getKey(), newTrigger);
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 2nd parameter true means updating the existing job with the updated
			// one.

	}

	private void createTables() {
		// table settings
		idCol.setCellValueFactory(new PropertyValueFactory<Spolka, String>("id"));
		dataAktualizacjiCol.setCellValueFactory(new PropertyValueFactory<Spolka, String>("dataAktualizacji"));
		spolkaNazwaCol.setCellValueFactory(new PropertyValueFactory<Spolka, String>("spolkaNazwa"));
		nazwaSkrotCol.setCellValueFactory(new PropertyValueFactory<Spolka, String>("nazwaSkrot"));
		kursOtwCol.setCellValueFactory(new PropertyValueFactory<Spolka, String>("kursOtw"));
		kursMinCol.setCellValueFactory(new PropertyValueFactory<Spolka, String>("kursMin"));
		kursMaxCol.setCellValueFactory(new PropertyValueFactory<Spolka, String>("kursMax"));
		kursBiezCol.setCellValueFactory(new PropertyValueFactory<Spolka, String>("kursBiez"));
		zmProcDziennaCol.setCellValueFactory(new PropertyValueFactory<Spolka, String>("zmProcDzienna"));
		czasOstZmianyCol.setCellValueFactory(new PropertyValueFactory<Spolka, String>("czasOstZmiany"));
		obrotSztCol.setCellValueFactory(new PropertyValueFactory<Spolka, String>("obrotSzt"));
		obrotPLNCol.setCellValueFactory(new PropertyValueFactory<Spolka, String>("obrotPLN"));
		pDtygodnieMINCol.setCellValueFactory(new PropertyValueFactory<Spolka, String>("pDtygodnieMIN"));
		pDtygodnieMAXCol.setCellValueFactory(new PropertyValueFactory<Spolka, String>("pDtygodnieMAX"));
		// table 2 data of one particular stock
		idCol2.setCellValueFactory(new PropertyValueFactory<Spolka, String>("id"));
		dataAktualizacjiCol2.setCellValueFactory(new PropertyValueFactory<Spolka, String>("dataAktualizacji"));
		spolkaNazwaCol2.setCellValueFactory(new PropertyValueFactory<Spolka, String>("spolkaNazwa"));
		nazwaSkrotCol2.setCellValueFactory(new PropertyValueFactory<Spolka, String>("nazwaSkrot"));
		kursOtwCol2.setCellValueFactory(new PropertyValueFactory<Spolka, String>("kursOtw"));
		kursMinCol2.setCellValueFactory(new PropertyValueFactory<Spolka, String>("kursMin"));
		kursMaxCol2.setCellValueFactory(new PropertyValueFactory<Spolka, String>("kursMax"));
		kursBiezCol2.setCellValueFactory(new PropertyValueFactory<Spolka, String>("kursBiez"));
		zmProcDziennaCol2.setCellValueFactory(new PropertyValueFactory<Spolka, String>("zmProcDzienna"));
		czasOstZmianyCol2.setCellValueFactory(new PropertyValueFactory<Spolka, String>("czasOstZmiany"));
		obrotSztCol2.setCellValueFactory(new PropertyValueFactory<Spolka, String>("obrotSzt"));
		obrotPLNCol2.setCellValueFactory(new PropertyValueFactory<Spolka, String>("obrotPLN"));
		pDtygodnieMINCol2.setCellValueFactory(new PropertyValueFactory<Spolka, String>("pDtygodnieMIN"));
		pDtygodnieMAXCol2.setCellValueFactory(new PropertyValueFactory<Spolka, String>("pDtygodnieMAX"));
	}

}
