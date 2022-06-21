package com.blogs.orm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blogs.orm.models.entity.User;

@Repository

public interface UserRepository extends CrudRepository<User, Integer> {

}
