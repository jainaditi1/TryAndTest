package com.personal.projects.TryAndTest;

public class Palindrome {
	public static void main(String[] args) {
		checkIfPalindrome(42134);
	}
	
	
	@SuppressWarnings("unlikely-arg-type")
	public static void checkIfPalindrome(int input) {
		//***************
		//# 1
		//***************		
		StringBuilder stringBuilder = new StringBuilder(Integer.toString(input));
		System.out.println(Integer.toString(input).equals(stringBuilder.reverse()));

		
		//***************
		//# 2
		//***************
		char[] chars = Integer.toString(input).toCharArray();
		int counter = chars.length;
		for(int i=0; i<counter; i++) {
			if(chars[i] == chars[counter-1]) {
				counter--;
				continue;
			} else {
				System.out.println("NOT a palindrome");
				break;
			}
		}
		
	}
	
	
	
}
