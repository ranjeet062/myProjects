package com.test.misc;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("INDIA", "KARNATAKA","560077");
		Employee empl = new Employee("Ranjeet", 123, address);
		
		Address address1 = new Address("INDIA", "KARNATAKA","560077");
		Employee empl1 = new Employee("Ranjeet-1", 124, address1);
		
		Address address2 = new Address("INDIA", "KARNATAKA","560077");
		Employee empl2 = new Employee("Ranjeet-2", 125, address2);
		
		System.out.println(empl);
		System.out.println(address);
		
		Employee Emplclone = (Employee)empl.clone();
		System.out.println(Emplclone);
		System.out.println(empl.getAddress());
		
		System.out.println(address.clone());
		
		Set<Employee> set = new TreeSet<>();
		set.add(empl);
		set.add(empl1);
		set.add(empl2);
		System.out.println(set);
		
		Employee e = new Employee("ran",12,new Address());
		Object o = (Object)e;
		System.out.println(o);
		Set<Employee> s = new HashSet<>();
		Set<Employee> s1 = new TreeSet<>();
		for(int i=0 ;i <10; i++)
		{
			//s.add(new Employee("ran",12,new Address()));
			//s.add(e);
			s1.add(e);
		}
		System.out.println(s1.size());
		
		
	}

}
