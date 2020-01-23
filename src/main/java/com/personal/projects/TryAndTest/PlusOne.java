package com.personal.projects.TryAndTest;

public class PlusOne {

	public static void main(String args[]) {
		int[] input = {0};
		plusOne(input);
	}
	
	public static int[] plusOne(int[] digits) {
		

		for (int i = digits.length - 1; i >= 0; i--) {
			if(digits[i] < 9) {
				digits[i]+=1;
				return digits;
			} 
			digits[i] = 0;
		}

		//if ALL digits are 9
		int[] newArray = new int[digits.length+1];
		newArray[0] = 1;
		return newArray;
		
	}

}
