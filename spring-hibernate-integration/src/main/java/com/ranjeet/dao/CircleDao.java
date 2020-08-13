package com.ranjeet.dao;

import java.util.List;

import com.ranjeet.model.Circle;

public interface CircleDao {

	public void save(Circle p);
	
	public List<Circle> listPerson();
	
	
}
