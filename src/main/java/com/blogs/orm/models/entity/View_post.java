package com.blogs.orm.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "view_post")
public class View_post implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_view_post;
	private int id_post;
	private int id_user;

	public int getId_view_post() {
		return id_view_post;
	}

	public void setId_view_post(int id_view_post) {
		this.id_view_post = id_view_post;
	}

	public int getId_post() {
		return id_post;
	}

	public void setId_post(int id_post) {
		this.id_post = id_post;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
