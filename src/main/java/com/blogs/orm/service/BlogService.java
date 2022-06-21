package com.blogs.orm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogs.orm.models.entity.Blog;
import com.blogs.orm.repository.BlogRepository;

@Service
public class BlogService {
	@Autowired
	BlogRepository repository;

	public Blog getBlogById(int id) {
		return repository.findById(id).get();
	}

	public List<Blog> getAllBlogs() {
		List<Blog> Blogs = new ArrayList<Blog>();
		repository.findAll().forEach(Blog -> Blogs.add(Blog));
		return Blogs;
	}

	public void saveOrUpdate(Blog blog) {
		repository.save(blog);
	}

	public void deleteBlogById(int id) {
		repository.deleteById(id);
	}

}
