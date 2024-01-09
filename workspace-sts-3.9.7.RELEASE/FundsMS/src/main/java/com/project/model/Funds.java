package com.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funds {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="fund_id", insertable=false, updatable=false)
	private int fundId;
	private String fundName;
	private Date dol;
	private double corpus, aum, balance, nav, expenseRatio, exitLoad;
	private int managerId ;
	
	public Funds() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Funds(int fundId, String fundName, double corpus, double aum, double balance, double nav,
			double expenseRatio, double exitLoad, int managerId, Date dol) {
		super();
		this.fundId = fundId;
		this.fundName = fundName;
		this.corpus = corpus;
		this.aum = aum;
		this.dol = dol;
		this.balance = balance;
		this.nav = nav;
		this.expenseRatio = expenseRatio;
		this.exitLoad = exitLoad;
		this.managerId = managerId;
	}
	
	public Date getDol() {
		return dol;
	}

	public void setDol(Date dol) {
		this.dol = dol;
	}

	public int getFundId() {
		return fundId;
	}

	public void setFundId(int fundId) {
		this.fundId = fundId;
	}

	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}

	public double getCorpus() {
		return corpus;
	}

	public void setCorpus(double corpus) {
		this.corpus = corpus;
	}

	public double getAum() {
		return aum;
	}

	public void setAum(double aum) {
		this.aum = aum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getNav() {
		return nav;
	}

	public void setNav(double nav) {
		this.nav = nav;
	}

	public double getExpenseRatio() {
		return expenseRatio;
	}

	public void setExpenseRatio(double expenseRatio) {
		this.expenseRatio = expenseRatio;
	}

	public double getExitLoad() {
		return exitLoad;
	}

	public void setExitLoad(double exitLoad) {
		this.exitLoad = exitLoad;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "Funds [fundId=" + fundId + ", fundName=" + fundName + ", dol=" + dol + ", corpus=" + corpus + ", aum="
				+ aum + ", balance=" + balance + ", nav=" + nav + ", expenseRatio=" + expenseRatio + ", exitLoad="
				+ exitLoad + ", managerId=" + managerId + "]";
	}	
}
