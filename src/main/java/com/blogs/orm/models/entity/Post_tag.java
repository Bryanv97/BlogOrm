package com.blogs.orm.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "post_tag")
public class Post_tag implements Serializable   {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id_post_tag;
	private int id_post;
	private String tag;

	public int getId_post_tag() {
		return id_post_tag;
	}

	public void setId_post_tag(int id_post_tag) {
		this.id_post_tag = id_post_tag;
	}

	public int getId_post() {
		return id_post;
	}

	public void setId_post(int id_post) {
		this.id_post = id_post;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
