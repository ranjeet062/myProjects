package com.ranjeet.model;

import java.util.Date;

public class Profile {
	private long id;
	private String profileName;
	private Date created;
	private String firstName;
	private String lastName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
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
	public Profile(long id, String profileName, Date created, String firstName, String lastName) {
		super();
		this.id = id;
		this.profileName = profileName;
		this.created = created;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Profile() {
		super();
	}
	
	
}
