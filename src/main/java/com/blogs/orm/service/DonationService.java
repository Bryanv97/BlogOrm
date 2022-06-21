package com.blogs.orm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogs.orm.models.entity.Donation;
import com.blogs.orm.repository.DonationRepository;

@Service
public class DonationService {
	@Autowired
	DonationRepository repository;

	public Donation getDonationById(int id) {
		return repository.findById(id).get();
	}

	public List<Donation> getAllDonations() {
		List<Donation> Donations = new ArrayList<Donation>();
		repository.findAll().forEach(Donation -> Donations.add(Donation));
		return Donations;
	}

	public void saveOrUpdate(Donation donation) {
		repository.save(donation);
	}

	public void deleteDonationById(int id) {
		repository.deleteById(id);
	}
}
