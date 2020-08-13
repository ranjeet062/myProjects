package com.test.polymorph;

public class Shape {

	
	public Shape() {
		super();
		System.out.println("Constructure of Shape");
	}

	public void draw(){
		System.out.println(this.getClass()+": drawing");
	}

}
