package com.personal.projects.TryAndTest;

import java.util.LinkedList;
import java.util.Stack;

public class PalindromeLinkedList {


	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(1);
		isPalindrome(list );
	}
	
	private static boolean isPalindrome(LinkedList<Integer> list ) {

		for(int i=0, j=list.size()-1; i<list.size(); i++, j--) {
			if(list.get(i) != list.get(j)) {
				System.out.println("false");
				return false;
			} 
		}
		System.out.println("true");
		return true;
	}
	
}
