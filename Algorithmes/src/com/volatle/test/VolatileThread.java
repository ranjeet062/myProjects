package com.volatle.test;

public class VolatileThread extends Thread{
	
	private final VolatileData data;
	public VolatileThread(VolatileData data)
	{
		this.data= data;
	}
	@Override
	public void run() {
		int oldVal = data.getCounter();
		
		System.out.println("[Thread" + Thread.currentThread().getId() + "]: " + oldVal);
		data.increaseCounter();
		
		int newVal = data.getCounter();
		System.out.println("[Thread" + Thread.currentThread().getId() + "]: " + newVal);
		
	}

}
