package com.project.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Funds;
import com.project.services.FundServiceJPA;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class FundController {

	@Autowired
	FundServiceJPA Fs;
	
	@RequestMapping(value="/fund", method=RequestMethod.GET, produces= {MediaType.APPLICATION_JSON_VALUE})
	public ArrayList<Funds> getAllFunds(){
		return Fs.getAllFunds();
	}
	
	@RequestMapping(value="/fund/fund-id/{id}", method=RequestMethod.GET)
	public Funds getFundByFundId(@PathVariable("id") int fundId){
		return Fs.getFundByFundId(fundId);
	}
	
	@RequestMapping(value="/fund", method=RequestMethod.POST)
	public int addFund(@RequestBody Funds newFund) {
		System.out.println(newFund);
		return Fs.addFund(newFund);
	}
	
	@RequestMapping(value="/fund/manager-id/{id}",method=RequestMethod.GET)
	public ArrayList<Funds> getFundByManager(@PathVariable("id") int cid){
		return Fs.getFundByManger(cid);
	}
	
	@RequestMapping(value="/fund/fund-id/{id}", method=RequestMethod.PATCH)
	public String updateFund(@PathVariable("id") int updateId, @RequestBody Funds updateFund) {
		System.out.println(updateFund);
//		return null;
		return Fs.updateFund(updateId, updateFund);
	}
}
