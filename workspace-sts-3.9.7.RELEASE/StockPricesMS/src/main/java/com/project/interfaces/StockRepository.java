package com.project.interfaces;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.project.model.PricesId;
import com.project.model.StockPrices;

public interface StockRepository extends CrudRepository<StockPrices, PricesId>{
	
	@Query("SELECT s FROM StockPrices s WHERE s.id.timeStamp = :timeStamp")
	ArrayList<StockPrices> findByTimeStamp(@Param("timeStamp") Date date);
}
