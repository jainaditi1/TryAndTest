package com.personal.projects.TryAndTest;

import java.util.HashSet;
import java.util.PriorityQueue;

public class LongestUniqueSubsequence {
	
	
	public static void main(String args[]) {
		
		String input = "javaconceptoftheday";
		int maxLength = 0;
		HashSet<Character> set = new HashSet<Character>();
//		hashset with all unique chars
		// tempMax = 0 
		// i and j
		//i  increments only when char is found in hashset, remove first from hashset
		//j increments every time char is not ofund in hashset , also increments maxtemp
		
		
		int i = 0;
		int j=0;
		while(j<input.length()) {
			
			if(!set.contains(input.charAt(j))) {
				set.add(input.charAt(j));
				if(maxLength < set.size()) {
					maxLength = set.size();
				}
				j++;
			} else {
				set.remove(input.charAt(i));
				i++;
			}
			
			
		}
		System.out.println(maxLength);
		
		
		
		
	}

}
