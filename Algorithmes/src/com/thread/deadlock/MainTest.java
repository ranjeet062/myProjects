package com.thread.deadlock;

public class MainTest {

	public static void main(String[] args) {

		SharedObject obj1 = new SharedObject();
		SharedObject obj2= new SharedObject();
		
		Thread t1= new Thread(new Thread1(obj1, obj2));
		
		Thread t2= new Thread(new Thread2(obj1, obj2));
		
		/*t1.start();
		t2.start();*/
		
		System.out.println("Called run() method directly....");
		
		t1.run();
		t2.run();
		
		
	}

}
