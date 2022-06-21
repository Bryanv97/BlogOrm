package com.blogs.orm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blogs.orm.models.entity.User_action;

@Repository
public interface User_actionRepository extends CrudRepository<User_action, Integer> {

}
