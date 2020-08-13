package com.ranjeet.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class Loggin2Aspect {

	
	public void myAdvice(){
		System.out.println("My Advice ran from xml based config");
	}
}
