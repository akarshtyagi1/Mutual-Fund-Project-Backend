package com.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Investors")
public class Investor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="investor_id", insertable=false, updatable=false)
	private int investorId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String password;
	
	
	public Investor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Investor(int investorId, String firstName, String lastName, String email, String phone, String password,
			Date aOD) {
		super();
		this.investorId = investorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	
	public int getInvestorId() {
		return investorId;
	}
	public void setInvestorId(int investorId) {
		this.investorId = investorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Investor [investorId=" + investorId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phone=" + phone + ", password=" + password + "]";
	}
	
}
