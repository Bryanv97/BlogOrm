package com.blogs.orm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogs.orm.models.entity.Post_subcategory;
import com.blogs.orm.repository.Post_subcategoryRepository;

@Service

public class Post_subcategoryService {
	@Autowired
	Post_subcategoryRepository repository;

	public Post_subcategory getPost_subcategoryById(int id) {
		return repository.findById(id).get();
	}

	public List<Post_subcategory> getAllPost_subcategorys() {
		List<Post_subcategory> Post_subcategorys = new ArrayList<Post_subcategory>();
		repository.findAll().forEach(Post_subcategory -> Post_subcategorys.add(Post_subcategory));
		return Post_subcategorys;
	}

	public void saveOrUpdate(Post_subcategory post_subcategory) {
		repository.save(post_subcategory);
	}

	public void deletePost_subcategoryById(int id) {
		repository.deleteById(id);
	}
}
