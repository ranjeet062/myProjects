package com.ranjeet.model;

public class User {

	private int id;
	private String userName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public User(int id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}
	public User() {
		super();
	}
	
	
}
