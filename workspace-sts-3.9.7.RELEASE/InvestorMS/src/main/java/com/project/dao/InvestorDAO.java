package com.project.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;



@Repository
public class InvestorDAO extends JdbcDaoSupport{
	
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void setDataSouce() {
		
		setDataSource(this.dataSource);
		
	}
	
	public boolean checkEmail(String email) {
		String sql="SELECT * FROM INVESTORS WHERE EMAIL='"+email+"'";
		List<Map<String, Object>> allRows= getJdbcTemplate().queryForList(sql);
		if(allRows.size()>0) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean checkUser(String email,String password) {
		String sql="SELECT * FROM INVESTORS WHERE EMAIL='"+email+"'"+" AND PASSWORD='"+password+"'";
		List<Map<String, Object>> allRows= getJdbcTemplate().queryForList(sql);
		System.out.println(allRows.size());
		if(allRows.size()>0) {
			return true;
		}else {
			return false;
		}
	}
	
	public Integer getInvestorId(String email) {
		String sql="SELECT INVESTOR_ID FROM INVESTORS WHERE EMAIL='"+email+"'";
		return getJdbcTemplate().queryForObject(sql,Integer.class);
	}
	
}
