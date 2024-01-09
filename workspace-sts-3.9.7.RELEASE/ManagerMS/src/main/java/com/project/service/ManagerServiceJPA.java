package com.project.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.DAO.ManagerDAO;
import com.project.interfaces.ManagerRepository;
import com.project.model.LoginForm;
import com.project.model.Manager;



@Service
public class ManagerServiceJPA {

	@Autowired
	ManagerRepository Mr;
	
	@Autowired
	ManagerDAO dao;
	public ArrayList<Manager> getManager(){
		
		ArrayList<Manager> allManagers=new ArrayList<>();
		Mr.findAll().forEach(inv->allManagers.add(inv));
		return allManagers;
	}
	
public Manager managerLogin(LoginForm loginData) {
		
		if(dao.checkUser(loginData.getEmail(), loginData.getPassword())) {
			return Mr.findByEmail(loginData.getEmail());
		}
		
		return null;
		
	}

public Manager getManagerById(int id) {
	return Mr.findOne(id);
}
	
}
