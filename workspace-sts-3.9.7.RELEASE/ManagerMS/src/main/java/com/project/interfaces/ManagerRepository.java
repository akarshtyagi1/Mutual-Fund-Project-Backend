package com.project.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.project.model.Manager;

public interface ManagerRepository extends CrudRepository<Manager,Integer>{
	Manager findByEmail(String email);
}
