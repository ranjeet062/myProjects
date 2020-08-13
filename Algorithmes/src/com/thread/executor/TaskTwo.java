package com.thread.executor;

public class TaskTwo implements Runnable{

	@Override
	public void run() {
		System.out.println("Running Task two .....");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}