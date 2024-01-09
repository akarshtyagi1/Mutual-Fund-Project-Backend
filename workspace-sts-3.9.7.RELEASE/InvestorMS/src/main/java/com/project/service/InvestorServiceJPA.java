package com.project.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.InvestorDAO;
import com.project.interfaces.InvestorRepository;
import com.project.model.Investor;
import com.project.model.LoginForm;

@Service
public class InvestorServiceJPA {
	
	@Autowired
	InvestorRepository Ir;
	
	@Autowired
	InvestorDAO dao;
		
	public ArrayList<Investor> getAllInvestors(){
		ArrayList<Investor> allInvestors=new ArrayList<>();
		Ir.findAll().forEach(inv->allInvestors.add(inv));
		return allInvestors;
	}
	
	public String investorRegister(Investor Inv) {	
		if(dao.checkEmail(Inv.getEmail())) {
			try {
				Ir.save(Inv);
				return "SUCCESS";
			}catch(Exception e) {
				System.out.println(e.getMessage());
				return e.getMessage();
			}
		}
		return "EMAIL_EXISTS";
	}
	
	public Investor investorLogin(Investor loginData) {
		if(Ir.existsByEmailAndPassword(loginData.getEmail(), loginData.getPassword())) {
			return Ir.findByEmail(loginData.getEmail());
		}
		return null;
	}
	
	public String investorDel(LoginForm delData) {
		
		Integer delId=dao.getInvestorId(delData.getEmail());
		try {
			Ir.delete(delId);
			return "Deleted User with ID: "+delId;
		}catch(Exception e) {
			return e.getMessage();
		}
		
	}
	
	public String investorUpdate(Investor Inv) {
		Integer updateId=dao.getInvestorId(Inv.getEmail());
		Investor updateInv=Ir.findOne(updateId);
		
		if(Inv.getPassword()!=null) {
			updateInv.setPassword(Inv.getPassword());
		}
		
		if(Inv.getPhone()!=null) {
			updateInv.setPhone(Inv.getPhone());
		}
		
		try {
			Ir.save(updateInv);
			return "Updated";
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	

}
