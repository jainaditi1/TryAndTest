package com.personal.projects.TryAndTest;

import java.util.Arrays;
import java.util.HashMap;

public class StringAlgorithms {

	
	
	public static void main(String[] args) {
		String input = "loveleetcode";
		findUniqueCharIndex(input);

		
		
		String input_1 = "anagr2am";
		String input_2 = "nagaram";
		checkIfAnagram(input_1, input_2);

		
		
		
		String s = "A man, a plan, a canal: Panama";
		isPalindrome(s);


		
		
		String atoiString = "42";
		getAtoi(atoiString);

		
		
		String haystack = "hello", needle = "ll";
		strStr(haystack , needle );
		
		
		
		String inputString = "the   sky is blue";
		reverseWordsInString(inputString);
		
		
		

		char[] inputArray = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
		reverseString(inputArray);
		
		
		
		designPDFViewer("zaba");

		
		
		huntNumbersInString("    -46");
		
		
		String sentence = "the day is sunny  the the the sunny is is";
		wordFrequencey(sentence);
	}
	
	public static HashMap<String, Integer> wordFrequencey(String sentence) {
	
		HashMap<String, Integer> counterMap = new HashMap<String, Integer>();
		String[] splittedString = sentence.split("\\s+");
		
		for(String s : splittedString) {
			if(counterMap.containsKey(s)) {
				counterMap.put(s, counterMap.get(s) + 1);
			} else {
				counterMap.put(s, 1);	
			}
		}
		
		
		return counterMap;
	}
	
	
	
	public static int huntNumbersInString(String word) {
	char[] characters = word.trim().toCharArray();
	boolean isNegative = false;

	String resultString = "";

	if (word.trim().startsWith("-")) {
		isNegative = true;
		word = word.trim().substring(1).trim();
		System.out.println(word);
	}

	for (int i = 0; i < characters.length; i++) {
		if (!(characters[0] >= 0 && characters[0] <= 9)) {
			return 0;
		} else if (characters[i] >= 0 && characters[i] <= 9) {
			resultString += characters[i];
		}
	}
	return 0;
}


	
	public static int designPDFViewer(String word) {
		int[] alphabetUnit = { 1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7 };
		HashMap<Character, Integer> alphabetUnitMap = new HashMap<Character, Integer>();
		int counter = 0;
		for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
			alphabetUnitMap.put(alphabet, alphabetUnit[counter]);
			counter++;
		}
		int maxUnit = 0;
		char[] letters = word.toCharArray();

		for (char letter : letters) {
			if (alphabetUnitMap.get(letter) > maxUnit) {
				maxUnit = alphabetUnitMap.get(letter);
			}
		}
		System.out.println(maxUnit * letters.length);
		return maxUnit * letters.length;

	}
	
	private static int findUniqueCharIndex(String input) {

		char[] inputArray = input.toCharArray();

		for (int i = 0, j = inputArray.length - 1; i <= inputArray.length - 1; i++) {
			boolean matchFound = false;
			while (j >= 0) {
				if (i != j && inputArray[i] == inputArray[j]) {
					matchFound = true;
					j = inputArray.length - 1;
					break;
				}
				j--;
			}
			if (!matchFound) {
				System.out.println(i);
				return i;
			}
		}
		System.out.println(-1);
		return -1;

	}

	private static void reverseString(char[] inputArray) {
		char c = inputArray[inputArray.length / 2];
		for (int i = 0, j = inputArray.length - 1; i < inputArray.length / 2; i++, j--) {
			char temp = inputArray[i];
			inputArray[i] = inputArray[j];
			inputArray[j] = temp;
		}

		for (char s : inputArray) {
			System.out.println(s);
		}
	}


	private static int strStr(String haystack, String needle) {

		if (haystack == null || needle == null) {
			return -1;
		}

		if (haystack.isEmpty() && needle.isEmpty()) {
			return 0;
		}

		if (haystack.isEmpty() || needle.isEmpty()) {
			return -1;
		}

		if (haystack.contains(needle)) {
			System.out.println(haystack.indexOf(needle));
			return haystack.indexOf(needle);
		}
		return -1;
	}

	private static int getAtoi(String input) {
		if (input == null || input.isEmpty()) {
			return 0;
		}
		input = input.trim();
		boolean isNegative = false;
		String result = "";
		int start = 0;

		if ((input.charAt(0) - '0' < 0 || input.charAt(0) - '0' > 9) && input.charAt(0) != '-') {
			return 0;
		} else if (input.charAt(0) == '-') {
			isNegative = true;
			start++;
		}
		char[] charArray = input.toCharArray();
		for (int i = start; i < charArray.length; i++) {
			if (charArray[i] - '0' < 0 || charArray[i] - '0' > 9) {
				break;
			}
			result += charArray[i];
		}
		System.out.println(result);
		if (Long.parseLong(result) > Integer.MAX_VALUE) {
			result = String.valueOf(Integer.MAX_VALUE);
		}
		if (isNegative) {
			result = "-" + result;
		}

		return Integer.parseInt(result);
	}

	private static boolean isPalindrome(String input) {
		boolean isPalindrome = true;

		if (input == null) {
			return false;
		}
		if (input.trim().isEmpty()) {
			return true;
		}
		String lowerCaseInput = input.toLowerCase();
		lowerCaseInput = lowerCaseInput.replaceAll("[^a-zA-Z0-9]", "");
		for (int i = 0, j = lowerCaseInput.length() - 1; i < lowerCaseInput.length() / 2; i++, j--) {
			if (lowerCaseInput.charAt(i) != lowerCaseInput.charAt(j)) {
				isPalindrome = false;
			}

		}
		System.out.println(isPalindrome);
		return isPalindrome;
	}

	private static boolean checkIfAnagram(String input_1, String input_2) {
		boolean isAnagram = false;

		if (input_1 == null || input_1.isEmpty() || input_1.length() == 0 || input_2 == null || input_2.isEmpty()
				|| input_2.length() == 0) {
			return false;
		}

		char[] charArray_1 = input_1.toCharArray();
		Arrays.sort(charArray_1);
		input_1 = "";
		for (char c : charArray_1) {
			input_1 += c;
		}

		char[] charArray_2 = input_2.toCharArray();
		Arrays.sort(charArray_2);
		input_2 = "";
		for (char c : charArray_2) {
			input_2 += c;
		}

		if (input_1.equalsIgnoreCase(input_2)) {
			isAnagram = true;
		}
		System.out.println(isAnagram);
		return isAnagram;
	}

	private static String reverseWordsInString(String inputString) {
		//split by all spaces
		String[] splittedString = inputString.split("\\s+");
		String resultString = "";

		for (int i = splittedString.length - 1; i >= 0; i--) {
			resultString += splittedString[i] + " ";
		}
		System.out.println(resultString);
		return resultString.trim();
	}


}
