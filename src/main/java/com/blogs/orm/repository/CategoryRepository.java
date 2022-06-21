package com.blogs.orm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blogs.orm.models.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
