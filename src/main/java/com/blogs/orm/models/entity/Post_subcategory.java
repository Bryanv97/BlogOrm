package com.blogs.orm.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "post_subcategory")
public class Post_subcategory implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_post_subcategory;
	private int id_post;
	private int id_subcategory;

	public int getId_post_subcategory() {
		return id_post_subcategory;
	}

	public void setId_post_subcategory(int id_post_subcategory) {
		this.id_post_subcategory = id_post_subcategory;
	}

	public int getId_post() {
		return id_post;
	}

	public void setId_post(int id_post) {
		this.id_post = id_post;
	}

	public int getId_subcategory() {
		return id_subcategory;
	}

	public void setId_subcategory(int id_subcategory) {
		this.id_subcategory = id_subcategory;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
