package com.thread.executor;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectedExecutionHandelerImpl implements RejectedExecutionHandler{

	@Override
	public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
		System.out.println(runnable.toString() + "I'hv been rejected");
		
	}

}
