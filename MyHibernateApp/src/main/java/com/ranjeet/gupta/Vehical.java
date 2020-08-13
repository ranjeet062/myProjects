package com.ranjeet.gupta;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="VEHICAL")
/*@Inheritance(strategy=InheritanceType.JOINED)*/

@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

/*@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		name="VEHICAL_TYPE",
		discriminatorType=DiscriminatorType.STRING
		)*/
public class Vehical {

	@Id 
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="VEHICAL_ID")
	private int vehicalId;
	
	@Column(name="VEHICAL_NAME")
	private String vehicalName;
	
	/*@ManyToOne
	@NotFound(action=NotFoundAction.IGNORE)
	@JoinColumn(name="USER_ID")
	private User user;*/
	
	/*@ManyToMany(mappedBy="vehicals")
	private Collection<User> users = new ArrayList<User>();
	
	
	public Collection<User> getUsers() {
		return users;
	}
	public void setUsers(Collection<User> users) {
		this.users = users;
	}*/
	/*public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}*/
	public int getVehicalId() {
		return vehicalId;
	}
	public void setVehicalId(int vehicalId) {
		this.vehicalId = vehicalId;
	}
	public String getVehicalName() {
		return vehicalName;
	}
	public void setVehicalName(String vehicalName) {
		this.vehicalName = vehicalName;
	}
	
	
}
