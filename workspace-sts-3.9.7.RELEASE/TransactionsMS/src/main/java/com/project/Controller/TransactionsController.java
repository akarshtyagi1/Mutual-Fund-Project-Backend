package com.project.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.Service.TransactionsServiceJPA;
import com.project.model.Transactions;
@RestController
@CrossOrigin(origins="http://localhost:3000")
public class TransactionsController {

	
	@Autowired
	TransactionsServiceJPA Ts;
	
	
	@RequestMapping(value="/transactions", method=RequestMethod.GET)
	public ArrayList<Transactions> getAllFunds(){
		return Ts.getAllTransactions();
	}
	
	@RequestMapping(value="/transactions/investor-id/{id}", method=RequestMethod.GET)
	public ArrayList<Transactions> getTransactionsByInvestorId(@PathVariable("id") int id){
		return Ts.getTransactionsByInvestorId(id);
	}
	
	@RequestMapping(value="/transactions", method=RequestMethod.POST)
	public String addTransaction(@RequestBody Transactions newTransaction ) {
		return Ts.addTransaction(newTransaction);
	}
	
}
