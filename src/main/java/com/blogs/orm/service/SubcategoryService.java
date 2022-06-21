package com.blogs.orm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogs.orm.models.entity.Subcategory;
import com.blogs.orm.repository.SubcategoryRepository;

@Service
public class SubcategoryService {
	@Autowired
	SubcategoryRepository repository;

	public Subcategory getSubcategoryById(int id) {
		return repository.findById(id).get();
	}

	public List<Subcategory> getAllSubcategory() {
		List<Subcategory> Subcategorys = new ArrayList<Subcategory>();
		repository.findAll().forEach(Subcategory -> Subcategorys.add(Subcategory));
		return Subcategorys;
	}

	public void saveOrUpdate(Subcategory subcategory) {
		repository.save(subcategory);
	}

	public void deleteSubcategoryById(int id) {
		repository.deleteById(id);
	}
}
