package com.project.interfaces;

import org.springframework.data.repository.CrudRepository;
import com.project.model.Funds;

public interface FundsRepository extends CrudRepository<Funds, Integer>{
	
}
