package com.thread.executor;

public class TaskThree implements Runnable{

	@Override
	public void run() {
		System.out.println("Running Task third .....");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
