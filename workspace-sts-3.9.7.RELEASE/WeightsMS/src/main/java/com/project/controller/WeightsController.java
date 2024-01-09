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

import com.project.model.Weights;
import com.project.services.WeightsServiceJPA;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class WeightsController {

	@Autowired
	WeightsServiceJPA Fs;
	
	@RequestMapping(value="/weights", method=RequestMethod.GET, produces= {MediaType.APPLICATION_JSON_VALUE})
	public ArrayList<Weights> getAllFunds(){
		return Fs.getAllWeights();
	}
	
	@RequestMapping(value="/weights/fund-id/{id}", method=RequestMethod.GET, produces= {MediaType.APPLICATION_JSON_VALUE})
	public ArrayList<Weights> getAllFundsByFundId(@PathVariable("id") int fundId){
		return Fs.getAllWeightsByFundId(fundId);
	}
	
	@RequestMapping(value="/weights", method=RequestMethod.POST)
	public String addFund(@RequestBody Weights newWeight) {
		return Fs.addWeight(newWeight);
	}
}
