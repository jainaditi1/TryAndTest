package com.personal.projects.TryAndTest;

public class AlphabetOrNot {

	public static void main(String[] args) {
		System.out.println(isAlphabet('x'));
	}
	
	private static boolean isAlphabet(char input) {
		if((input >= 'a' && input >= 'z') || (input >= 'A' && input >= 'Z')) {
			return true;
		} else {
			return false;
		}
	}

	
	//List of all small and capital alphabets and check if that contains a given character
}
