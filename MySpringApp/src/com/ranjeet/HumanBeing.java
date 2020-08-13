package com.ranjeet;

public class HumanBeing {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//throw new RuntimeException("Error Happened");
	}
	
	public String setName1(String name) {
		this.name = name;
		return this.name;
	}
}
