package com.blogs.orm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.blogs.orm.models.entity.View_post;
import com.blogs.orm.repository.View_postRepository;

public class View_postService {
	
	@Autowired
	View_postRepository repository;

	public View_post getView_postById(int id) {
		return repository.findById(id).get();
	}

	public List<View_post> getAllView_post() {
		List<View_post> View_posts = new ArrayList<View_post>();
		repository.findAll().forEach(View_post -> View_posts.add(View_post));
		return View_posts;
	}

	public void saveOrUpdate(View_post view_post) {
		repository.save(view_post);
	}

	public void deleteView_postById(int id) {
		repository.deleteById(id);
	}
}
