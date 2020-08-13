package com.ranjeet.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.weaver.patterns.IScope;

import com.ranjeet.Animal;
import com.ranjeet.HumanBeing;

@Aspect
public class LogginAspect {

	/*@Before("execution(public String getName())")*/
	/*@Before("execution(public String com.ranjeet.Animal.getName())")*/
    /*@Before("execution(public * get*())")*/
	/*@Before("execution(* get*())")*/
	/*@Before("execution(* get*(..))")*/
	/*@Before("execution(* com.ranjeet.Animal.*.get*())")*/
	/*@Before("allGetters() && allAnimalMethod()")*/
	/*@Before("allGetters()")
	public void loggingAdvice(){
		System.out.println("Advice run. Get Method call");
	}*/
	
	@Before("allGetters()")
	public void loggingAdvice(JoinPoint joinpoint){
		
		System.out.println("Joinpoint: "+joinpoint.toString());
		Object target = joinpoint.getTarget();
		if (target instanceof Animal) {
			Animal new_name = (Animal) target;
			System.out.println("Joinpoint Target: "+new_name);
			
		}else if(target instanceof HumanBeing){
			HumanBeing new_name = (HumanBeing) target;
			System.out.println("Joinpoint Target: "+new_name);
		}
		else{
			System.out.println("oops");
		}
		
	}
	
	@Before("args(name)")
	public void stringArgMethod(String name){
		System.out.println("Argument Advice Before : "+name);
	}
	
	@After("args(name)")
	public void stringArgMethod1(String name){
		System.out.println("Argument Advice After : "+name);
	}
	
	/*@AfterReturning("args(name)")
	public void stringArgMethod2(String name){
		System.out.println("Argument Advice AfterReturnings : "+name);
	}*/
	@AfterReturning(pointcut="args(name)",returning="returnString")
	public void stringArgMethod2(String name, String returnString){
		System.out.println("Argument Advice AfterReturnings : "+name + ", and returned : "+ returnString);
	}
	
	@AfterThrowing(pointcut="args(name)",throwing="ex")
	public void stringArgMethod3(String name, Throwable ex){
		System.out.println("Argument Advice AfterThrowing : "+name);
		System.out.println(ex);
	}
	
	@Before("allGetters()")
	public void secondAdvice(){
		System.out.println("second adviced executed");
	}
	
	/*@Around("allGetters()")
	public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("Before Around");
		try {
			Object proceed = proceedingJoinPoint.proceed();
			System.out.println("Object: "+proceed);
		} catch (Throwable e) {
			System.out.println("After throwing");
		}
		System.out.println("After Around");
	}*/
	@Around("@annotation(com.ranjeet.aspect.Loggable)")
	public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("Before Around");
		try {
			Object proceed = proceedingJoinPoint.proceed();
			System.out.println("Object: "+proceed);
		} catch (Throwable e) {
			System.out.println("After throwing");
		}
		System.out.println("After Around");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters(){}
	
//	@Pointcut("within(com.ranjeet.Animal)")
//	public void allAnimalMethod(){
//		System.out.println("ooops");
//	}
//	
//	@Pointcut(argNames="")
//	public void allArgsMethod(){
//		System.out.println("ooops");
//	}
	
	public void loggingAdvice(){
		System.out.println("logging from the advice");
	}
}
