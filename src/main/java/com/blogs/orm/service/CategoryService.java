package com.blogs.orm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogs.orm.models.entity.Category;
import com.blogs.orm.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	CategoryRepository repository;

	public Category getCategoryById(int id) {
		return repository.findById(id).get();
	}

	public List<Category> getAllCategorys() {
		List<Category> Categorys = new ArrayList<Category>();
		repository.findAll().forEach(Category -> Categorys.add(Category));
		return Categorys;
	}

	public void saveOrUpdate(Category category) {
		repository.save(category);
	}

	public void deleteCategoryById(int id) {
		repository.deleteById(id);
	}

}
