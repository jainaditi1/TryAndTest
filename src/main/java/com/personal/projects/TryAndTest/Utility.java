package com.personal.projects.TryAndTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Utility {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5 };
		intArrayToStringArray(intArray);

		convertStringToListAndViceVersa();

		convertIntArrayToList();
		
		alphaNumericString("A man, a plan, a canal: Panama");
		
		convertIntCharToInteger("4");
		
		
		
	}

	// **************************
	// Convert INT CHAR to INT
	// char c = '8' ---> 8
	// **************************
	public static int convertIntCharToInteger(String input) {
		int convertedInt = 	input.charAt(0)-'0';
		System.out.println(convertedInt);
		return convertedInt;
	}
	

	
	

	
	
	// **************************
	// ALPHANUMERIC STRING
	// **************************
	public static String alphaNumericString(String input) {
		String lowerCaseInput = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		return lowerCaseInput;
	}
	
	
	
	
	// **************************
	// INT [] TO STRING []
	// **************************
	public static String[] intArrayToStringArray(int[] intArray) {
		// input primitive integer array
		String strArray[] = Arrays.stream(intArray).mapToObj(String::valueOf).toArray(String[]::new);
		return strArray;
	}

	
	// **************************
	// INT [] TO ARRAYLIST
	// **************************
	public static void convertIntArrayToList() {
		int[] inputArray = { 0, 3, 7, 1, 7, 9, 11, 6, 3, 5, 2, 13, 14 };

		// ********** 1 *************
		List<Integer> list = Arrays.stream(inputArray) // IntStream
				.boxed() // Stream<Integer>
				.collect(Collectors.toList());
		System.out.println(list);

		// ********** 2 *************
		List<Integer> list_2 = IntStream.of(inputArray) // returns IntStream
				.boxed().collect(Collectors.toList());
		System.out.println(list_2);
	}

	public static void convertStringToListAndViceVersa() {
		String input = "Iamlittleteapotshortandstout";

		// **************************
		// Chars array (any object array) TO LIST
		// **************************
		char[] inputCharArr = input.toCharArray();
		List<Character> cList = new ArrayList<Character>();
		for (char ch : inputCharArr) {
			cList.add(ch);
		}
		System.out.println(cList);

		// **************************
		// LIST TO STRING
		// **************************
		String listString = cList.stream().map(Object::toString).collect(Collectors.joining(""));

		System.out.println(listString);

		// **************************
		// Char Array to String
		// **************************
		String string = new String(inputCharArr);

	}

	public static void parseHashmap() {
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		scores.put("alice", 2);
		scores.put("aditi", 100);
		scores.put("baboo", 5000);
		for (Map.Entry mapElement : scores.entrySet()) {
			System.out.println(mapElement.getKey() + ". Value : " + mapElement.getValue());
		}
	}

}
