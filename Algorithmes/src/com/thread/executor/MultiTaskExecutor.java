package com.thread.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MultiTaskExecutor {

	public static void main(String[] args) {

		BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(10);
		RejectedExecutionHandler rejectHandler= new RejectedExecutionHandelerImpl();
		ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 3, 10, TimeUnit.SECONDS, workQueue, rejectHandler);
		executor.prestartAllCoreThreads();
		List<Runnable>  taskGroup = new ArrayList<>();
		taskGroup.add(new TaskOne());
		taskGroup.add(new TaskTwo());
		taskGroup.add(new TaskThree());
		
		workQueue.add(new MultiRunnable(taskGroup));
	}

}
