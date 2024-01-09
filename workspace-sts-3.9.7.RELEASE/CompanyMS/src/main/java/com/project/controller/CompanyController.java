package com.project.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Company;
import com.project.services.CompanyServiceJPA;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class CompanyController {
	
	@Autowired
	CompanyServiceJPA csjpa;
	
	@RequestMapping(path="/companies", method=RequestMethod.GET)
	public ArrayList<Company> getCompanies() {
		return csjpa.getAllCompany();
	}
	
	@RequestMapping(path="/companies/company-id/{id}", method=RequestMethod.GET)
	public Company getCompaniesByCompanyId(@PathVariable("id") int cid) {
		return csjpa.getCompaniesByCompanyId(cid);
	}
	
	@RequestMapping(path="/companies", method=RequestMethod.POST)
	public Company addCompany( @RequestBody Company company ) {
		return csjpa.addCompany(company);
	}
	
	
}
