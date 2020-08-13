package com.volatle.test;

public class VolatileData {

	private static volatile int counter =0;
	
	public int getCounter()
	{
		return counter;
	}
	
	public void increaseCounter()
	{
		++counter;
	}
	
	
}
