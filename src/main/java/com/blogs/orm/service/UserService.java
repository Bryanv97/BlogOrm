package com.blogs.orm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogs.orm.models.entity.User;
import com.blogs.orm.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repository;

	public User getUser_actionById(int id) {
		return repository.findById(id).get();
	}

	public List<User> getAllUser_action() {
		List<User> Users = new ArrayList<User>();
		repository.findAll().forEach(User -> Users.add(User));
		return Users;
	}

	public void saveOrUpdate(User user) {
		repository.save(user);
	}

	public void deleteUserById(int id) {
		repository.deleteById(id);
	}
}
