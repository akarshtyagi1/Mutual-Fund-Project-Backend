package com.project.interfaces;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.project.model.Weights;

public interface WeightsRepository extends CrudRepository<Weights, Integer>{
	ArrayList<Weights> findByFundId(int fundId);
}
