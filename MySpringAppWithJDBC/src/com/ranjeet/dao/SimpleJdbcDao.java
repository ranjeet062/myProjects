package com.ranjeet.dao;

import java.util.List;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.ranjeet.model.User;

public class SimpleJdbcDao extends SimpleJdbcDaoSupport {

	public int getCircleCount(){
		 String sql= "SELECT COUNT(*) FROM CIRCLE";
		 return this.getJdbcTemplate().queryForInt(sql);
	 }
}
