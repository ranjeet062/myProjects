package com.test.polymorph;

public class Triangle extends Shape{

	private String lenght;
	
	public Triangle() {
		System.out.println("Constructure of Triangle");
	}
	@Override
	public void draw() {
		System.out.println(this.getClass()+ ": Drawing");
	}
	
	public void draw2(){
		System.out.println(this.getClass()+ ": Drawing2");
	}
}
