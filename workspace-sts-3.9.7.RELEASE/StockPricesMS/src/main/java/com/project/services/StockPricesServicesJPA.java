package com.project.services;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.interfaces.StockRepository;
import com.project.model.StockPrices;

@Service
public class StockPricesServicesJPA {
	@Autowired
	StockRepository stockRepo;
	
	public ArrayList<StockPrices> getPrices(){
		ArrayList<StockPrices> stockPrices = new ArrayList<>();
		stockRepo.findAll()
		.forEach( price -> stockPrices.add(price));
		return stockPrices;
	}
	
	public String addStock(StockPrices Sp) {
		try {
			stockRepo.save(Sp);
			return "Stock added";
		}catch(Exception e) {
			return e.getMessage();
		}
	}

	public ArrayList<StockPrices> getPricesByDate(Date date) {
		return stockRepo.findByTimeStamp(date);
	}
}
