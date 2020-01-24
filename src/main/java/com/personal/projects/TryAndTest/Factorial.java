package com.personal.projects.TryAndTest;

public class Factorial {
	public static void main(String[] args) {
		findFactorialOf(20);
	}
	
	public static long findFactorialOf(int input) {
		long factorial = 1;
		for(int i = input; i>0; i--) {
			factorial*=i;
		}
		return factorial;
	}	
}
