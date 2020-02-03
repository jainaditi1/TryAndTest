package com.personal.projects.TryAndTest;

public class IsRotationalString {

	public static void main(String[] args) {
		String input = "tiadi4";
		System.out.println(isRotationalString(input, "aditi"));
	}
	
	private static boolean isRotationalString(String input, String original) {
		
		original+=original;
		
		if(original.contains(input)) {
			return true;
		}
		
		
		return false;
	}
	
}
