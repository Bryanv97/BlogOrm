package com.blogs.orm.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "logup")


public class Logup implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id_logup;
	private int id_use;
	private Date date_logup;

	public int getId_logup() {
		return id_logup;
	}

	public void setId_logup(int id_logup) {
		this.id_logup = id_logup;
	}

	public int getId_use() {
		return id_use;
	}

	public void setId_use(int id_use) {
		this.id_use = id_use;
	}

	public Date getDate_logup() {
		return date_logup;
	}

	public void setDate_logup(Date date_logup) {
		this.date_logup = date_logup;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
