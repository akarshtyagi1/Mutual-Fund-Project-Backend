package com.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transactions {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="transaction_id", insertable=false, updatable=false)
	private int transactionId;
	private int investorId, fundId;
	private Date transactionDate;
	private double amount;
	private double units;
	private double closingNav;
	private String transactionType;
	
	public Transactions() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Transactions(int transactionId, int investorId, int fundId, Date transactionDate, double amount,
			double units, String transactionType, double closingNav) {
		super();
		this.closingNav = closingNav;
		this.transactionId = transactionId;
		this.investorId = investorId;
		this.fundId = fundId;
		this.transactionDate = transactionDate;
		this.amount = amount;
		this.units = units;
		this.transactionType = transactionType;
	}

	public double getClosingNav() {
		return closingNav;
	}

	public void setClosingNav(double closingNav) {
		this.closingNav = closingNav;
	}

	public double getUnits() {
		return units;
	}
	public void setUnits(double units) {
		this.units = units;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getInvestorId() {
		return investorId;
	}
	public void setInvestorId(int investorId) {
		this.investorId = investorId;
	}
	public int getFundId() {
		return fundId;
	}
	public void setFundId(int fundId) {
		this.fundId = fundId;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	@Override
	public String toString() {
		return "Transactions [transactionId=" + transactionId + ", investorId=" + investorId + ", fundId=" + fundId
				+ ", transactionDate=" + transactionDate + ", amount=" + amount + ", units=" + units + ", closingNav="
				+ closingNav + ", transactionType=" + transactionType + "]";
	}
	
}
