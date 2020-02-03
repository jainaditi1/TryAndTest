package com.personal.projects.TryAndTest;

public class LongestPalindromeSubString {
	
	public static void main(String[] args) {

		String input = "geeksabcbageeks";
		System.out.println(longestPalindromicSubstring(input));
		
		
	}

	private static String longestPalindromicSubstring(String input) {
		String result = "";
		
		for(int i=0; i<input.length(); i++) {
			for(int j=i+1; j<input.length()-1; j++) {
				
				String substring = input.substring(i, j+1);
				
				if(isPalindrome(substring) && result.length() < substring.length()) {
					result = substring;
				}
			}
		}
		
		return result;
	}
	
	private static boolean isPalindrome(String input) {
		StringBuilder str = new StringBuilder(input);
		str = str.reverse();
		if(str.toString().equals(input)) {
			return true;
		}
		return false;
	}
	
	
}
