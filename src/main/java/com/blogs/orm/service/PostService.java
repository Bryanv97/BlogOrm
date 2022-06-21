package com.blogs.orm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogs.orm.models.entity.Post;
import com.blogs.orm.repository.PostRepository;

@Service
public class PostService {
	@Autowired
	PostRepository repository;

	public Post getPostById(int id) {
		return repository.findById(id).get();
	}

	public List<Post> getAllPosts() {
		List<Post> Posts = new ArrayList<Post>();
		repository.findAll().forEach(Post -> Posts.add(Post));
		return Posts;
	}

	public void saveOrUpdate(Post post) {
		repository.save(post);
	}

	public void deletePostById(int id) {
		repository.deleteById(id);
	}
}
