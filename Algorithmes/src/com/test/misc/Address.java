package com.test.misc;

public class Address implements Cloneable{

	private String country;
	private String state;
	private String pincode;

	public Address() {
		System.out.println("Address No args Constuctor");
	}

	public Address(String country, String state, String pincode) {
		System.out.println("Address with args Constuctor");
		this.country = country;
		this.state = state;
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		return new Address("TEST","TEST","TEST");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.country +" - " +this.state + " - " +this.pincode.toString();
	}
}
