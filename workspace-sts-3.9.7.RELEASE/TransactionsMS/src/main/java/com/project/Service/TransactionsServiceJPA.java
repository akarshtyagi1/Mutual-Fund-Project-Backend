package com.project.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.interfaces.TransactionsRepository;

import com.project.model.Transactions;

@Service
public class TransactionsServiceJPA {

	@Autowired
	TransactionsRepository Tr;
	
	public ArrayList<Transactions> getAllTransactions(){
		ArrayList<Transactions> allTransactions=new ArrayList<>();
		Tr.findAll().forEach(Transaction->allTransactions.add(Transaction));
		return allTransactions;
	}
	
	public String addTransaction(Transactions newTransaction) {
		try {
			Tr.save(newTransaction);
			return "SUCCESS";
		}catch(Exception e) {
			return e.getMessage();
		}
	}

	public ArrayList<Transactions> getTransactionsByInvestorId(int id) {
		return Tr.findByInvestorIdOrderByTransactionDateDesc(id);
	}
}
