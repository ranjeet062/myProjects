package com.thread.local;

public class MyThreadLocal {

	
	public static void main(String[] args) {
		ThreadLocal<String> threadLocal = new ThreadLocal<>();
		threadLocal.set("My Thread");
		
		System.out.println(threadLocal.get());
		
		ThreadLocal<String> myThreadLocal = new ThreadLocal<String>() {
			@Override
			protected String initialValue() {
				return String.valueOf(System.currentTimeMillis());
			}
		};
		
	}
	
	
	
}
