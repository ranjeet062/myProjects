package com.test.misc;

public class Employee implements Comparable, Cloneable{

	private int id;
	private String name;
	private Address address;
	
	public Employee() {
		System.out.println("Employee No args Constuctor");
	}
	public Employee(String name, int id, Address address)
	{
		System.out.println("Employee with args Constuctor");
		this.id= id;
		this.name= name;
		this.address= address;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public int hashCode() {
		System.out.println("In hashCode method of Employee");
		// TODO Auto-generated method stub
		// return super.hashCode();
		int val =this.id+this.name.hashCode();
		System.out.println("hashcode: "+val%16);
		 return val;
		//return this.id%16;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("In equals method of Employee");
		System.out.println(this == obj);
		// TODO Auto-generated method stub
		// return super.equals(obj);
		if(this == obj)
			return true;
		if(obj instanceof Employee)
		{
			Employee e = (Employee)obj;
			if(e.id == this.id)
				return true;
		}
		return false;
	}
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public int compareTo(Object o) {
		System.out.println("In comapareTo method of Employee with: "+o);
		// TODO Auto-generated method stub
		if(o instanceof Employee )
		{
			Employee e = (Employee) o;
			return this.name.compareTo(e.name);
		}
		return 0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" - " +this.name.toString();
		//return super.toString();
	}
}
