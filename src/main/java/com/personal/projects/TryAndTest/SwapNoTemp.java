package com.personal.projects.TryAndTest;

public class SwapNoTemp {

	
	
	public static void main(String[] args) {
		String a = "sf";
		String b = "interview";
		
		a=a + " " + b;
		b = a.split(" ")[0];
		a = a.split(" ")[1];
		System.out.println(a);
		System.out.println(b);
	}
	
	
}
