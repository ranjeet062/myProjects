package com.thread.executor;

import java.util.List;

public class MultiRunnable implements Runnable{

	
	private final List<Runnable> multRunnable;
	public MultiRunnable(List<Runnable> runnables) {
		this.multRunnable = runnables;
	}
	@Override
	public void run() {
		for (Runnable runnable : multRunnable) {
			new Thread(runnable).start();
		}
		
	}

}
