package com.blogs.orm.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "donation")
public class Donation implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_donation;
	private int id_user;
	private int id_blog;
	private float amount;
	private Date date_donation;
	private String payment_method;

	public int getId_donation() {
		return id_donation;
	}

	public void setId_donation(int id_donation) {
		this.id_donation = id_donation;
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

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Date getDate_donation() {
		return date_donation;
	}

	public void setDate_donation(Date date_donation) {
		this.date_donation = date_donation;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
