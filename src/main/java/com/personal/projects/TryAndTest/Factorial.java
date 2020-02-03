package com.personal.projects.TryAndTest;

public class Factorial {
	public static void main(String[] args) {
		findFactorialOf(20);
		findFactorialOf_2(20);
		findFactorialOf_3(1, 20);
	}
	
	

	public static long findFactorialOf_2(int input) {
		long result = 1;
		while(input >=1) {
			result *= input--;			
		}
		System.out.println(result);
		return result;
	}	
	
	public static long findFactorialOf(int input) {
		long factorial = 1;
		for(int i = input; i>0; i--) {
			factorial*=i;
		}
		System.out.println(factorial);
		return factorial;
	}
	
	public static long findFactorialOf_3(long factorial, int input) {
		while(input > 1) {
			factorial *= input;
			return findFactorialOf_3(factorial, --input);
		}
		
		System.out.println(factorial);
		return factorial;
	}	
}
