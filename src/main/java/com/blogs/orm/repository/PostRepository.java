package com.blogs.orm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blogs.orm.models.entity.Post;

@Repository

public interface PostRepository extends CrudRepository<Post, Integer> {

}
