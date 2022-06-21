package com.blogs.orm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blogs.orm.models.entity.Logup;

@Repository
public interface LogupRepository extends CrudRepository<Logup, Integer> {

}
