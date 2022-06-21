package com.blogs.orm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blogs.orm.models.entity.Subscription_blog;

@Repository
public interface Subscription_blogRepository extends CrudRepository<Subscription_blog, Integer> {

}
