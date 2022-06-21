package com.blogs.orm.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blog")

public class Blog implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id_blog;
	private int id_user;
	private String title;
	private String description;
	private Date date_creation;
	private String icon_blog;
	private String cover_blog;

	public int getId_blog() {
		return id_blog;
	}

	public void setId_blog(int id_blog) {
		this.id_blog = id_blog;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}

	public String getIcon_blog() {
		return icon_blog;
	}

	public void setIcon_blog(String icon_blog) {
		this.icon_blog = icon_blog;
	}

	public String getCover_blog() {
		return cover_blog;
	}

	public void setCover_blog(String cover_blog) {
		this.cover_blog = cover_blog;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
