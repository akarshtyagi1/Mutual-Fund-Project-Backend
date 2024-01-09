package com.project.DAO;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class ManagerDAO extends JdbcDaoSupport {


	@Autowired
	DataSource dataSource;

	@PostConstruct
	public void setDataSouce() {
		
		setDataSource(this.dataSource);
		
	}
	

public boolean checkUser(String email,String password) {
	String sql="SELECT * FROM PORTFOLIOMANAGERS WHERE EMAIL='"+email+"'"+" AND PASSWORD='"+password+"'";
	List<Map<String, Object>> allRows= getJdbcTemplate().queryForList(sql);
	System.out.println(allRows.size());
	if(allRows.size()>0) {
		return true;
	}else {
		return false;
	}
}

public Integer getManagerId(String email) {
	String sql="SELECT MANAGER_ID FROM PORTFOLIOMANAGERS WHERE EMAIL='"+email+"'";
	return getJdbcTemplate().queryForObject(sql,Integer.class);
}

}