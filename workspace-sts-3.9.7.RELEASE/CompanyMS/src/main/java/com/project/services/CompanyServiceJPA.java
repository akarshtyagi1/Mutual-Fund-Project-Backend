package com.project.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.interfaces.CompanyCrud;
import com.project.model.Company;

@Service
public class CompanyServiceJPA {
	
	@Autowired
	CompanyCrud comRepo;
	
	public ArrayList<Company> getAllCompany(){
		ArrayList<Company> companies = new ArrayList<>();
		comRepo.findAll().forEach( com -> companies.add(com));
		return companies;
	}

	public Company addCompany(Company company) {
		return comRepo.save(company);
	}

	public Company getCompaniesByCompanyId(int cid) {
		return comRepo.findOne(cid);
	}
}
