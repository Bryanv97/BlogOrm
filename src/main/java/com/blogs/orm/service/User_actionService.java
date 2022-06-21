package com.blogs.orm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogs.orm.models.entity.User_action;
import com.blogs.orm.repository.User_actionRepository;

@Service
public class User_actionService {
	@Autowired
	User_actionRepository repository;

	public User_action getUser_actionById(int id) {
		return repository.findById(id).get();
	}

	public List<User_action> getAllUser_action() {
		List<User_action> User_actions = new ArrayList<User_action>();
		repository.findAll().forEach(User_action -> User_actions.add(User_action));
		return User_actions;
	}

	public void saveOrUpdate(User_action user_action) {
		repository.save(user_action);
	}

	public void deleteUser_actionById(int id) {
		repository.deleteById(id);
	}
}
