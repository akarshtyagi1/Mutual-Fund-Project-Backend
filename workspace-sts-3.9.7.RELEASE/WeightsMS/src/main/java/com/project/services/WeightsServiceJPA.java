package com.project.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.interfaces.WeightsRepository;

import com.project.model.Weights;

@Service
public class WeightsServiceJPA {

	@Autowired
	WeightsRepository Fr;
	
	public ArrayList<Weights> getAllWeights(){
		ArrayList<Weights> allWeights=new ArrayList<>();
		Fr.findAll().forEach(fund->allWeights.add(fund));
		return allWeights;
	}
	
	public ArrayList<Weights> getAllWeightsByFundId(int fundId){
		ArrayList<Weights> allWeights=new ArrayList();
		return Fr.findByFundId(fundId);
	}
	
	public String addWeight(Weights newWeight) {
		try {
			Fr.save(newWeight);
			return "SUCCESS";
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	
}
