package com.test.polymorph;

public class Main {

	public static void main(String[] args) {
		
		Shape s1 = new Shape();
		s1.draw();
		System.out.println("-----");
		Shape s2 = new Triangle();
		s2.draw();
		System.out.println("-----");
		Shape s3 = new Circle();
		s3.draw();
		
		//Circle c1 = (Circle) new Shape();
		System.out.println("-----");
		Shape s4 = (Shape)new Triangle();
		s4.draw();
		System.out.println("-----");
		Triangle t = new Triangle();
		t.draw();
		t.draw2();
		System.out.println("-----");
		/*Triangle t1 = (Triangle) new Shape();
		t1.draw();
		t1.draw2();*/
		
		System.out.println("-----");
		
		Shape s6 = new Triangle();
		Triangle t3= (Triangle)s6;
		t3.draw();
		t3.draw2();
	}

}
