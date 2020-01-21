package com.personal.projects.TryAndTest;

public class First2Max {

	
	public static void main(String[] args) {
		findTwoMaxValues();
	}
	private static void findTwoMaxValues() {
		int[] input = {4,55,1,33,5,22,88};
		int highest = input[0];
		int secondHighest = 0;
		int temp = 0;
		for(int i=1; i<input.length; i++) {
			if(input[i] > highest) {
				temp = highest;
				highest = input[i];
			}
			if(temp > secondHighest) {
				secondHighest = temp;	
			}
			
		}
		System.out.println(highest);
		System.out.println(temp);
	}
}
