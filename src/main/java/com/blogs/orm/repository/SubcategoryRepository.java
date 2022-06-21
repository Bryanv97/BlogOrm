package com.blogs.orm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blogs.orm.models.entity.Subcategory;

@Repository
public interface SubcategoryRepository extends CrudRepository<Subcategory, Integer> {

}
