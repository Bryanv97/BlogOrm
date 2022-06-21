package com.blogs.orm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blogs.orm.models.entity.Donation;

@Repository
public interface DonationRepository extends CrudRepository<Donation, Integer> {

}
