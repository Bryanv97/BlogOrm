package com.blogs.orm.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subcategory")

public class Subcategory implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_subcategory;
	private int id_category;
	private String subcategory;

	public int getId_subcategory() {
		return id_subcategory;
	}

	public void setId_subcategory(int id_subcategory) {
		this.id_subcategory = id_subcategory;
	}

	public int getId_category() {
		return id_category;
	}

	public void setId_category(int id_category) {
		this.id_category = id_category;
	}

	public String getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
