package com.project.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.project.model.Investor;

public interface InvestorRepository extends CrudRepository<Investor, Integer>{
	Investor findByEmail(String email);
	boolean existsByEmailAndPassword(String email, String password);
}

