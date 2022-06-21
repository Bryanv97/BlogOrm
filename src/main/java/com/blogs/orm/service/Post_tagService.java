package com.blogs.orm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogs.orm.models.entity.Post_tag;
import com.blogs.orm.repository.Post_tagRepository;

@Service
public class Post_tagService {
	@Autowired
	Post_tagRepository repository;

	public Post_tag getPost_tagById(int id) {
		return repository.findById(id).get();
	}

	public List<Post_tag> getAllPost_tags() {
		List<Post_tag> Post_tags = new ArrayList<Post_tag>();
		repository.findAll().forEach(Post_tag -> Post_tags.add(Post_tag));
		return Post_tags;
	}

	public void saveOrUpdate(Post_tag post_tag) {
		repository.save(post_tag);
	}

	public void deletePost_tagById(int id) {
		repository.deleteById(id);
	}
}
