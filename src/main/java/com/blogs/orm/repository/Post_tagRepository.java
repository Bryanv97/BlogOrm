package com.blogs.orm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blogs.orm.models.entity.Post_tag;

@Repository

public interface Post_tagRepository extends CrudRepository<Post_tag, Integer> {

}
