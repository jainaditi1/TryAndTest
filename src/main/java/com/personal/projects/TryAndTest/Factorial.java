package com.personal.projects.TryAndTest;

public class Factorial {
	public static void main(String[] args) {
		findFactorialOf(20);
	}
	
	private static void findFactorialOf(int input) {
		long factorial = 1;
		for(int i = input; i>0; i--) {
			factorial*=i;
		}
		System.out.println(factorial);
	}	
}
