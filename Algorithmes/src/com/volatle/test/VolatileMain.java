package com.volatle.test;

public class VolatileMain {

	private final static int noOfThread = 2;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		VolatileData data = new VolatileData();
		
		Thread[] t = new Thread[noOfThread];
		for(int i =0 ; i < noOfThread; i++)
		{
			t[i] = new VolatileThread(data);
		}
		for(int i= 0 ; i< noOfThread; i++)
		{
			t[i].start();
			Thread.sleep(2000);
		}
		for(int i= 0 ; i< noOfThread; i++)
		{
			t[i].join();;
		}
	}

}
