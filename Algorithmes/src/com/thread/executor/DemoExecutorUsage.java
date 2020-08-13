package com.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoExecutorUsage {

	public static ExecutorService executer= null;
	public static volatile Future taskOneResult = null;
	public static volatile Future taskTwoResult = null;
	
	public static void main(String[] args) throws InterruptedException {
		executer= Executors.newFixedThreadPool(2);
		
		while(true)
		{
			checkTask();
			Thread.sleep(1000);
		}
		
	}
	public static void checkTask()
	{
		if(taskOneResult == null || taskOneResult.isCancelled() || taskOneResult.isDone()){
			executer.submit(new TaskOne());
		}
		if(taskTwoResult == null || taskTwoResult.isCancelled() || taskTwoResult.isDone()){
			executer.submit(new TaskTwo());
		}

	}
}
