package com.blogs.orm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogs.orm.models.entity.Subscription_blog;
import com.blogs.orm.repository.Subscription_blogRepository;

@Service

public class Subscription_blogService {
	@Autowired
	Subscription_blogRepository repository;

	public Subscription_blog getSubscription_blogById(int id) {
		return repository.findById(id).get();
	}

	public List<Subscription_blog> getAllSubscription_blog() {
		List<Subscription_blog> Subscription_blogs = new ArrayList<Subscription_blog>();
		repository.findAll().forEach(Subscription_blog -> Subscription_blogs.add(Subscription_blog));
		return Subscription_blogs;
	}

	public void saveOrUpdate(Subscription_blog subscription_blog) {
		repository.save(subscription_blog);
	}

	public void deleteSubscription_blogById(int id) {
		repository.deleteById(id);
	}
}
