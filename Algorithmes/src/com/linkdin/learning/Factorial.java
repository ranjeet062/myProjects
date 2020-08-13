package com.linkdin.learning;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("factorial : "+factorial(5));
		
		System.out.println("factorialTail : "+factorialTail(5,1));
		
		System.out.println("factorialLimear : "+factorialLinear(5));
	}
	
	public static int factorial(int n){
		if(n==0)
			return 1;
		return n*factorial(n-1);
	}
	public static int factorialTail(int n, int result){
		if(n==0)
			return result;
		return factorialTail(n-1,n*result);
	}
	
	public static int factorialLinear(int n){
		int result=1;
		for(int i =1; i<= n; i++){
			result = result * i;
		}
		return result;
	}
}
