package com.thread.problems;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ExecuterExceptionHandler {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<Void> future = executor.submit(new Callable<Void>() {
		    @Override
		    public Void call() throws Exception {
		        System.out.println("** Started");
		        Thread.sleep(2000);
		        throw new IllegalStateException("exception from thread");
		    }
		});
		try {
			future.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executor.shutdown();
		System.out.println("Main Stopped");
		
	}

}
