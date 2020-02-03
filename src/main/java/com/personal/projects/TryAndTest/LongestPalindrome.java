package com.personal.projects.TryAndTest;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

	public static void main(String args[]) {
		findLongestPalindrome("a");
	}

	private static String findLongestPalindrome(String input) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String result = "";
		char[] inputChars = input.toCharArray();
		
		if(input == null || input.length() == 0) {
			return "";
		}
		
		if (input.length() == 1) {
			return input;
		}
		
		
		for (char c : inputChars) {
			if (map.get(c) != null) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				int start = input.indexOf(entry.getKey());
				int end = input.indexOf(entry.getKey(), start + 1);
				
				if(isPalindrome(input.substring(start, end + 1)) && input.substring(start, end + 1).length() > result.length()) {
					result = input.substring(start, end + 1);
				}
				
				
				
				//USING STRING BUFFER
//				StringBuffer buffer = new StringBuffer(input.substring(start, end + 1));
//				StringBuffer reversed = new StringBuffer(input.substring(start, end + 1)).reverse();
//				if (buffer.toString().equals(reversed.toString()) && buffer.toString().length() > result.length()) {
//					result = buffer.toString();
//				}
			}
		}

		return result;
	}

	private static boolean isPalindrome(String input) {
		char[] inputChars = input.toCharArray();
		for (int i = 0, j = input.length() - 1; i < input.length() && j > 0; i++, j--) {
			if (inputChars[i] != inputChars[j]) {
				return false;
			}
		}
		return true;
	}

}
