package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="company_id", insertable=false, updatable=false)
	private int companyId;
	private String Name, ticker;
	
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", Name=" + Name + ", ticker=" + ticker + "]";
	}
}