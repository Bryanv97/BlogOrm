package com.blogs.orm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogs.orm.models.entity.Logup;
import com.blogs.orm.repository.LogupRepository;

@Service
public class LogupService {
	@Autowired
	LogupRepository repository;

	public Logup getLogupById(int id) {
		return repository.findById(id).get();
	}

	public List<Logup> getAllLogups() {
		List<Logup> Logups = new ArrayList<Logup>();
		repository.findAll().forEach(Logup -> Logups.add(Logup));
		return Logups;
	}

	public void saveOrUpdate(Logup logup) {
		repository.save(logup);
	}

	public void deleteLogupById(int id) {
		repository.deleteById(id);
	}
}
