package com.project.controller;

import java.util.Date;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.StockPrices;
import com.project.services.StockPricesServicesJPA;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class StockPricesController {

	@Autowired
	StockPricesServicesJPA sp;
	
	@RequestMapping(method=RequestMethod.GET, value="/stock", produces= {MediaType.APPLICATION_JSON_VALUE})
	public ArrayList<StockPrices> getPrices(){
		return sp.getPrices();
	}
	
	@RequestMapping(value="/stock", method=RequestMethod.POST)
	public String addStock(@RequestBody StockPrices newStock) {
		return sp.addStock(newStock);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/stock/by-date")
	public ArrayList<StockPrices> getPricesByDate(@RequestBody StockPrices sPrice){
		Date date = sPrice.getId().getTimeStamp();
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		return sp.getPricesByDate(sqlDate);
	}
	
}
