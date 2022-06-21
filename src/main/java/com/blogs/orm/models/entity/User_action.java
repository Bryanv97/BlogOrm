package com.blogs.orm.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_action")

public class User_action implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id_user_action;
	private int id_user;
	private String user_action;
	private Date date_creation;
	
	public int getId_user_action() {
		return id_user_action;
	}
	public void setId_user_action(int id_user_action) {
		this.id_user_action = id_user_action;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getUser_action() {
		return user_action;
	}
	public void setUser_action(String user_action) {
		this.user_action = user_action;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
