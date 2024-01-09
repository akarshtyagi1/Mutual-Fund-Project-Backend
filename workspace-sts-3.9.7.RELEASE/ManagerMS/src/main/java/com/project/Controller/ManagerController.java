package com.project.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.LoginForm;
import com.project.model.Manager;
import com.project.service.ManagerServiceJPA;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class ManagerController {

	@Autowired 
	ManagerServiceJPA Ms;
	
	@RequestMapping(value="/manager", method=RequestMethod.GET)
	public ArrayList<Manager> getAllManagers(){
		return Ms.getManager();
	}
	
	@RequestMapping(value="/manager/id/{id}", method=RequestMethod.GET)
	public Manager getManagerById(@PathVariable("id") int mid){
		return Ms.getManagerById(mid);
	}
	
	@RequestMapping(value="/manager/login", method=RequestMethod.POST)
	public Manager managerLogin(@RequestBody LoginForm loginData) {
		return Ms.managerLogin(loginData);	
	}
}
