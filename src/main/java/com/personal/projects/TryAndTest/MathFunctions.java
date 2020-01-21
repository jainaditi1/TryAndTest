package com.personal.projects.TryAndTest;

public class MathFunctions {

	public static void main(String[] args) {
		calculatePowerOfANumber(3, 5);
	}
	
	private static void calculatePowerOfANumber(int power, int input) {
		int result = input;

		while(power > 1) {
			result *= input;
			power--;
		}
		
		System.out.println(result);
		
		
		System.out.println(Math.pow(5, 3));
		
		
	}
	
	
	
	
	
}
