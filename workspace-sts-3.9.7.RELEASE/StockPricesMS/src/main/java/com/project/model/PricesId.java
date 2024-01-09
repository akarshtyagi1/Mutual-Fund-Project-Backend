package com.project.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PricesId implements Serializable{

	@Column(name="time_stamp")
	private Date timeStamp;
	private int companyId;
	
	public PricesId() {
	}
	
	public PricesId(Date timeStamp, int companyId) {
		super();
		this.timeStamp = timeStamp;
		this.companyId = companyId;
	}
	
	public PricesId(Date timeStamp) {
		super();
		this.timeStamp = timeStamp;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	

}
