package com.ranjeet.gupta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@NamedQuery(name="user.byId", query="from User where userid = :userid ")
@NamedNativeQuery(name="native.user.byid",query="select * from USER_TABLE where USER_ID = :userid",resultClass=User.class )
@Table(name = "USER_TABLE")
//@org.hibernate.annotations.Entity(selectBeforeUpdate=true)
public class User {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "USER_ID")
    private int userid;
 
//	@EmbeddedId
//	private LoginName userIdName;
	
    @Column(name = "USER_NAME")
    //@Transient
    private String username;
 
    /*@Column(name = "CREATED_BY")
    private String createdBy;
 
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    */
    /*@Lob
    private String description;*/
    
/*    @OneToOne
    @JoinColumn(name="VEHICAL_ID")
    private Vehical vehical;*/
    
   /* @OneToMany(mappedBy="user")
//    @JoinTable(name="USER_VEHICAL",joinColumns=@JoinColumn(name="USER_ID"),
//    			inverseJoinColumns=@JoinColumn(name="VEHICAL_ID"))
    private Collection<Vehical> vehicals = new ArrayList<Vehical>();*/
    
   /* @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="USER_VEHICAL",joinColumns=@JoinColumn(name="USER_ID"),
	inverseJoinColumns=@JoinColumn(name="VEHICAL_ID"))
    private Collection<Vehical> vehicals = new ArrayList<Vehical>();
    */

/*    @Embedded
    private Address address;
    
    @Embedded
    @AttributeOverrides(
    		{
    			@AttributeOverride(name="street",column=@Column(name="OFFICE_STREET")),
    			@AttributeOverride(name="city",column=@Column(name="OFFICE_CITY")),
    			@AttributeOverride(name="state",column=@Column(name="OFFICE_STATE")),
    			@AttributeOverride(name="pin",column=@Column(name="OFFICE_PINCODE"))
    		}
    )
    
    
    private Address officeAddress;
*/    
    
//    @ElementCollection(fetch=FetchType.EAGER)
//    @JoinTable(name="USER_ADDRESSES",
//    		joinColumns=@JoinColumn(name="USER_ID")
//    		)
//   /* @GenericGenerator(name="hilo-gen",strategy="hilo")
//    @CollectionId(columns = { @Column(name="ADDRESS_ID") }, generator = "hilo-gen", type = @Type(type="long"))*/
//    private Collection<Address> addresses = new ArrayList<Address>();
//    
//    
//	public Collection<Address> getAddresses() {
//		return addresses;
//	}
//
//	public void setAddresses(ArrayList<Address> addresses) {
//		this.addresses = addresses;
//	}


	public int getUserid() {
		return userid;
	}

	/*public Vehical getVehical() {
		return vehical;
	}

	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}*/

	
	public void setUserid(int userid) {
		this.userid = userid;
	}

	/*public Collection<Vehical> getVehicals() {
		return vehicals;
	}

	public void setVehicals(Collection<Vehical> vehical) {
		this.vehicals = vehical;
	}*/

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/*public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}*/

	
	/*public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	
	public LoginName getUserIdName() {
		return userIdName;
	}

	public void setUserIdName(LoginName userIdName) {
		this.userIdName = userIdName;
	}*/

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + "]";
	}
    
    
}
