package com.gpw.grabber.data.dao;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public interface ISpolkaDAO {

	String getSpolkanazwa();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setSpolkanazwa(java.lang.String)
	 */
	void setSpolkanazwa(String spolkanazwa);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getSpolkaskrot()
	 */
	String getSpolkaskrot();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setSpolkaskrot(java.lang.String)
	 */
	void setSpolkaskrot(String spolkaskrot);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getKursotw()
	 */
	double getKursotw();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setKursotw(double)
	 */
	void setKursotw(double kursotw);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getKursmin()
	 */
	double getKursmin();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setKursmin(double)
	 */
	void setKursmin(double kursmin);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getKursmax()
	 */
	double getKursmax();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setKursmax(double)
	 */
	void setKursmax(double kursmax);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getKursbiez()
	 */
	double getKursbiez();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setKursbiez(double)
	 */
	void setKursbiez(double kursbiez);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getZmprocdzienna()
	 */
	double getZmprocdzienna();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setZmprocdzienna(double)
	 */
	void setZmprocdzienna(double zmprocdzienna);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getCzasostzmiany()
	 */
	String getCzasostzmiany();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setCzasostzmiany(java.lang.String)
	 */
	void setCzasostzmiany(String czasostzmiany);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getObrotszt()
	 */
	double getObrotszt();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setObrotszt(double)
	 */
	void setObrotszt(double obrotszt);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getObrotpln()
	 */
	double getObrotpln();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setObrotpln(double)
	 */
	void setObrotpln(double obrotpln);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getPdtygodniemin()
	 */
	double getPdtygodniemin();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setPdtygodniemin(double)
	 */
	void setPdtygodniemin(double pdtygodniemin);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getPdtygodniemax()
	 */
	double getPdtygodniemax();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setPdtygodniemax(double)
	 */
	void setPdtygodniemax(double pdtygodniemax);

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#getDataaktualizacji()
	 */
	Date getDataaktualizacji();

	/* (non-Javadoc)
	 * @see com.gpw.grabber.data.dao.INewSpolkaDAO#setDataaktualizacji(java.sql.Timestamp)
	 */
	void setDataaktualizacji(Timestamp Dataaktualizacji);

}