package com.linkdin.learning;

import java.util.ArrayList;
import java.util.Collection;

public class GCD {

	public static void main(String[] args) {

		Collection c = new ArrayList();
		System.out.println(gcd(10,6));
	}
	
	public static int gcd(int m, int n){
		if(n ==0){
			return m;
		}
		else{
			return gcd(n,m%n);
		}
		
	}

}
