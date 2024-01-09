package com.project.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.project.model.Company;

public interface CompanyCrud extends CrudRepository<Company, Integer>{
	
}
