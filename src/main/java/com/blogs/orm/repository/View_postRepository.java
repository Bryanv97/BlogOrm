package com.blogs.orm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blogs.orm.models.entity.View_post;

@Repository
public interface View_postRepository extends CrudRepository<View_post, Integer> {

}
