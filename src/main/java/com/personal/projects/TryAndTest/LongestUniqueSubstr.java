package com.personal.projects.TryAndTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LongestUniqueSubstr {


	public static void main(String[] args) {
		longestUniqueString("GEEKSFORGEEKS");
	}
	
	public static void longestUniqueString(String input) {
		
		//convert string to ArrayList of characters
		char[] charArray = input.toCharArray();
		List<Character> cList = new ArrayList<Character>();
		for(int i = 0; i<charArray.length; i++){
			cList.add(charArray[i]);
		}
		
		List<Character> tempResults = new ArrayList<Character>();
		List<String> subStringList = new ArrayList<String>();
		
		
		//Iterate through list
		for(int i=0; i<cList.size(); i++) {
			
			//If tempResults already has the character
			if(tempResults.contains(cList.get(i))){
				//Stop and store each result as a new list in 2 steps
				
				//#1 convert unique characters list to string and store
				String listToString = tempResults.stream().map(Object::toString)
		                .collect(Collectors.joining(""));
				subStringList.add(listToString);
				
				//#2 substring original input to current index and get last index of char occurrence 
				//reset index of to result first occurrence
				int index = cList.subList(0, i).lastIndexOf(cList.get(i));
				
				//reset i to last occurrence
				i = index;
			
				tempResults = new ArrayList<Character>();
			//If tempResults does NOT have character then keep adding to tempResult
			} else {
				tempResults.add(cList.get(i));
			}
		}
		
		System.out.println(subStringList);
		
		
		int maxLength = 0;
		String longestString = "";
		for(int i=0; i<subStringList.size(); i++){
			if(maxLength < subStringList.get(i).length()) {
				longestString = subStringList.get(i);
				
			}		
		}
		System.out.println(longestString);
		
	}
}
