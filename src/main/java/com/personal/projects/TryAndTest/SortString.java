package com.personal.projects.TryAndTest;

import java.util.PriorityQueue;

public class SortString {
	public static void main(String[] args) {
		sortString("fguecbdavwyxzhijklmnopqrst");
	}
	
	private static void sortString(String input) {
		
		PriorityQueue<Character> chars = new PriorityQueue<Character>();
		for(int i=0; i<input.length(); i++) {
			chars.add(input.charAt(i));
		}
		
//		for(Character c : chars) {
			System.out.println(chars);	
//		}
		
		
	}
	
}
