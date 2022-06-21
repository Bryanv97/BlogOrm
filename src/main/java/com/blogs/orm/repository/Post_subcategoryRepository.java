package com.blogs.orm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blogs.orm.models.entity.Post_subcategory;

@Repository

public interface Post_subcategoryRepository extends CrudRepository<Post_subcategory, Integer> {

}
