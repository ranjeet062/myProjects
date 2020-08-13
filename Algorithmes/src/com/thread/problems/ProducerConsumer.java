package com.thread.problems;

import java.util.LinkedList;

public class ProducerConsumer {

	LinkedList<Integer> l = new LinkedList<>();
	int capacity =2;
	public void produces() throws InterruptedException
	{
		int value =0;
		while(true){
			synchronized (this) {
				while(l.size() == capacity)
					wait();
				System.out.println("producer produced: "+ value);
				l.add(value++);
				notify();
				Thread.sleep(1000);
			}
		}
	}
	public void consumes() throws InterruptedException
	{
		while(true)
		{
			synchronized (this) {
				while(l.isEmpty())
					wait();
				int val = l.removeFirst();
				System.out.println("consumer consumed: "+ val);
				notify();
				Thread.sleep(1000);				
			}
		}
	}
}
