package com.ranjeet.gupta;

import javax.persistence.Embeddable;

@Embeddable
public class LoginName {

	private String emailId;
	private String name;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
