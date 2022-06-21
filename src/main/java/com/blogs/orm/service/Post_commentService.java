package com.blogs.orm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogs.orm.models.entity.Post_comment;
import com.blogs.orm.repository.Post_commentRepository;

@Service
public class Post_commentService {
	@Autowired
	Post_commentRepository repository;

	public Post_comment getPost_commentById(int id) {
		return repository.findById(id).get();
	}

	public List<Post_comment> getAllPost_comments() {
		List<Post_comment> Post_comments = new ArrayList<Post_comment>();
		repository.findAll().forEach(Post_comment -> Post_comments.add(Post_comment));
		return Post_comments;
	}

	public void saveOrUpdate(Post_comment post_comment) {
		repository.save(post_comment);
	}

	public void deletePost_commentById(int id) {
		repository.deleteById(id);
	}
}
