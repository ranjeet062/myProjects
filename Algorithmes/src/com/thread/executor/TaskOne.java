package com.thread.executor;

public class TaskOne implements Runnable{

	@Override
	public void run() {
		System.out.println("Running Task One .....");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
