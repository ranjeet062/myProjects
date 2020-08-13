package com.test.polymorph;

public class Circle extends Shape {

	
	public Circle() {
		super();
		System.out.println("Constructure of Circle");
	}

	@Override
	public void draw() {
	 
		System.out.println(this.getClass()+ ": Drawing");
	}
}
