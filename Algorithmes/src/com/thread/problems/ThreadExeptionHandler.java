package com.thread.problems;

public class ThreadExeptionHandler {
	public static void main(String[] args) {
		
	Thread.UncaughtExceptionHandler h = new Thread.UncaughtExceptionHandler() {
		
		@Override
		public void uncaughtException(Thread t, Throwable e) {

			System.out.println(t.getName() +" therad got Uncaught Exception : " + e );
		}
	};
	
	Thread t = new Thread(() -> {System.out.println("Sleeping....");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		System.out.println("Intrupted....");
		e.printStackTrace();
	}
	System.out.println("Throwing Exception...");
	throw new RuntimeException();
	});
	
	t.setUncaughtExceptionHandler(h);
	t.start();
	}
}
