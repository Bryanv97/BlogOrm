package com.blogs.orm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blogs.orm.models.entity.Post_comment;

@Repository
public interface Post_commentRepository extends CrudRepository<Post_comment, Integer> {

}
