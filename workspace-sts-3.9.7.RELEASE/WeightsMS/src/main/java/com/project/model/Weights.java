package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Weights {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="weight_id", insertable=false, updatable=false)
	private int weightId;
	private int companyId;
	private double weight;
	private int fundId;
	private double stocks;
	private double buyPrice;
	
	public Weights() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Weights(int weightId, int companyId, double weight, int fundId, double buyPrice, double stocks) {
		super();
		this.weightId = weightId;
		this.companyId = companyId;
		this.weight = weight;
		this.fundId = fundId;
		this.stocks = stocks;
		this.buyPrice = buyPrice;
	}
	
	public double getStocks() {
		return stocks;
	}

	public void setStocks(double stocks) {
		this.stocks = stocks;
	}


	public double getBuyPrice() {
		return buyPrice;
	}


	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public int getWeightId() {
		return weightId;
	}
	public void setWeightId(int weightId) {
		this.weightId = weightId;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getFundId() {
		return fundId;
	}
	public void setFundId(int fundId) {
		this.fundId = fundId;
	}
	
	@Override
	public String toString() {
		return "Weights [weightId=" + weightId + ", companyId=" + companyId + ", weight=" + weight + ", fundId="
				+ fundId + "]";
	}
	
}
