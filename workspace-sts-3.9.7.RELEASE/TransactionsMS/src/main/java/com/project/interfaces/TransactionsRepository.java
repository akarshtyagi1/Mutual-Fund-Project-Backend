package com.project.interfaces;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.project.model.Transactions;

public interface TransactionsRepository extends CrudRepository<Transactions,Integer> {
	ArrayList<Transactions> findByInvestorIdOrderByTransactionDateDesc(int id);
}
