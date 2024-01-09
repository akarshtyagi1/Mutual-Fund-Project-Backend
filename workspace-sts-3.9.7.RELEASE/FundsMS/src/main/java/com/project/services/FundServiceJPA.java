package com.project.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.interfaces.FundsRepository;
import com.project.model.Funds;

@Service
public class FundServiceJPA {
		
	@Autowired
	FundsRepository Fr;
	
	public ArrayList<Funds> getAllFunds(){
		ArrayList<Funds> allFunds=new ArrayList();
		Fr.findAll().forEach(fund->allFunds.add(fund));
		return allFunds;
	}
	
	public int addFund(Funds newFund) {
		try {
			Funds fund = Fr.save(newFund);
			return fund.getFundId();
		}catch(Exception e) {
			return -1;
		}
	}
	
	
	public ArrayList<Funds> getFundByManger(int cid){
		ArrayList<Funds> allFunds=new ArrayList<Funds>();
		
		for(Funds f : Fr.findAll()) {
			if(f.getManagerId()==cid) {
				allFunds.add(f);
			}
		}
		return allFunds;
	}
	
	
	public String updateFund(int id,Funds updateFund) {
		Funds fund=Fr.findOne(id);
		
		if(updateFund.getCorpus()!=0) {
			fund.setCorpus(updateFund.getCorpus());
		}
		if(updateFund.getBalance()!=0) {
			fund.setBalance(updateFund.getBalance());
		}
		if(updateFund.getNav()!=0) {
			fund.setNav(updateFund.getNav());
		}
		if(updateFund.getExpenseRatio()!=0) {
			fund.setExpenseRatio(updateFund.getExpenseRatio());
		}
		if(updateFund.getExitLoad()!=0) {
			fund.setExitLoad(updateFund.getExitLoad());
		}
		
		try {
			Fr.save(fund);
			return "SUCCESS";
		}catch(Exception e) {
			return e.getMessage();
		}
	}

	public Funds getFundByFundId(int fundId) {
		return Fr.findOne(fundId);
	}
	
}
