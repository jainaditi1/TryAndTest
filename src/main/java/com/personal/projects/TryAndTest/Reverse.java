package com.personal.projects.TryAndTest;

public class Reverse {

	public static void main(String[] args) {
//		reverse_NUMBER();
		reverse_STRING();
        
	
	
	}
	
	private static void reverse_NUMBER() {
		int number = 1234, reversed = 0;
        while(number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
	}
	
	private static void reverse_STRING() {
		String str = "aditi", reversed = "";
        
		char[] chars= str.toCharArray();
		
		for(int i=chars.length-1; i>=0; i--) {
			reversed += chars[i];
		}
        System.out.println(reversed);
	}
	
}
