package com.blogs.orm.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subscription_blog")
public class Subscription_blog implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id_subscription_blog;
	private int id_user;
	private int id_blog;
	private String user_level;
	private String account_status;

	public int getId_subscription_blog() {
		return id_subscription_blog;
	}

	public void setId_subscription_blog(int id_subscription_blog) {
		this.id_subscription_blog = id_subscription_blog;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public int getId_blog() {
		return id_blog;
	}

	public void setId_blog(int id_blog) {
		this.id_blog = id_blog;
	}

	public String getUser_level() {
		return user_level;
	}

	public void setUser_level(String user_level) {
		this.user_level = user_level;
	}

	public String getAccount_status() {
		return account_status;
	}

	public void setAccount_status(String account_status) {
		this.account_status = account_status;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
