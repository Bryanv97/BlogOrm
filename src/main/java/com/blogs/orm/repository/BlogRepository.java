package com.blogs.orm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.blogs.orm.models.entity.Blog;

@Repository
public interface BlogRepository extends CrudRepository<Blog, Integer> {
}
