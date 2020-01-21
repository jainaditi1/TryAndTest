
package com.personal.projects.TryAndTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Misc {
	public static void main(String[] args) {
//		String inputString = "the   sky is blue";
//		reverseWordsInString(inputString);
//		mixSameSizedArraysAlternatively();
//		mixDifferentSizedArraysAlternatively();
//		mergeTwoSortedArrays();
//		nthUglyNumber(3, 2, 3, 5);

//		divideTwoIntegers(-2147483648, -1);

//		int[] hurdleArray = {1,6,3,5,2};
//		int maxJump = 4;
//		countExtraDoses(hurdleArray, maxJump);

//		designPDFViewer("zaba");

//		huntNumbersInString("    -46");

//		decodeWays("10");

//		int[] inputArray = new int[9];
//		fibbonacci(2, inputArray);

//		int[] inputArray = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

//		int[] inputArray = { 0, 0, 1, 4, 4 };
//
//		findDuplicate(inputArray);
//		findDuplicateOneLoop(inputArray, 0, inputArray.length, 0);

//		int[] inputArray = { 0, 3, 7, 9, 11, 12, 12, 13, 13, 14 };
//		rotateArray(inputArray, 4);

//		int[] inputArray = { 0, 3, 7, 1, 7, 9, 11, 6, 3, 5, 2, 13, 14 };
//		findPairsOfSum(inputArray, 11);

//		int[] inputArray = { 0, 3, 7, 1, 7, 9, 11, 6, 3, 5, 2, 13, 14 };
//		findArraySubsetOfSum(inputArray, 24);

//		int[] inputArray = { 4, 10, 2, 2, 1, 4,3,1 };
////		int[] inputArray = { 5, 4, 1, 2, 2, 1, 5 };
////		int[] inputArray = { 2, 2, 1 };
//		findUniqueNumbersInArray(inputArray);

//		int[] inputArray = { 4, 10, 23, 32, 1 };
//		makeLargestNumber(inputArray);

//		int[] inputArray = { 0, 3, 7, 1, 7, 9, 11, 6, 304, 5, 2, 13, 14 };
//		findNthDigit();
//	

//		char[] inputArray = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
//		reverseString(inputArray);

//		int i = 1534236469;
//		reverseInteger(i);

//		String input = "loveleetcode";
//		findUniqueCharIndex(input);

//		String input_1 = "anagr2am";
//		String input_2 = "nagaram";
//		checkIfAnagram(input_1, input_2);

//		String s = "A man, a plan, a canal: Panama";
////		String s = "";
//		isPalindrome(s);

//		
//		String atoiString = "42";
//		getAtoi(atoiString);

//		String haystack = "hello", needle = "ll";
//		strStr(haystack , needle );

		
		
		//UN DONE
//		int[] sortedArray_1 = { 2, 4, 8, 19};
//		int[] sortedArray_2 = { 1, 4, 7, 20 };
//		mergeSortedArrays(sortedArray_1, sortedArray_2);

		
		
		int picture[][] = {
					{ 5, 1, 9,11},
					{2, 4, 8,10},
					{13, 3, 6, 7},
					{15,14,12,16}	
							};
 		rotatePicture(picture);
		
	}
	
	
	private static void rotatePicture(int picture[][]) {
		
		for(int row = 0, col = 0; row<picture.length; row++, col++) {
			
			int temp = picture[row][col];
			
			picture[row][col] = picture[col][row];
			
			picture[col][row] = temp;
		}
		
		
		for(int row = 0, col1 = 0, col2 = picture.length-1; col1<picture.length/2; row++, col1++, col2--) {
			
			int temp = picture[row][col1];
			
			picture[row][col1] = picture[row][col2];
			
			picture[row][col2] = temp;
			
		}
		
		
		for(int row = 0, col = 0; row<picture.length; row++, col++) {
			System.out.println(picture[row][col] + " , ");
		}
		
		
	}
	

	private static void mergeSortedArrays(int[] sortedArray_1, int[] sortedArray_2) {

		int[] resultArray = new int[sortedArray_1.length + sortedArray_2.length];
		int counter = 0;
		for (int i = 0; i<sortedArray_2.length; i++) {
			if(sortedArray_1[counter] > sortedArray_2[i]) {
				
			}
		}
			
			
			
			
//			while (sortedArray_1[i] > sortedArray_2[j]) {
//				int temp = sortedArray_1[i];
//				resultArray[i] = sortedArray_2[j];
//				sortedArray_2[j] = temp;
//				j++;
//			}
		}

	

	// { 2, 4, 8, 19, 1, 4, 7, 20 }

//	private static void mergeSortedArrays(int[] sortedArray_1, int[] sortedArray_2) {
//		
//		for(int i=0, j=0; i<sortedArray_1.length; i++, j++) {
//			if(sortedArray_1[i] == 0) {
//				sortedArray_1[i] = sortedArray_2[j];
//			}
//		}
//		
//	}

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

	private static int reverseInteger(int input) {
		Long result = new Long(0);

		if (input > Integer.MAX_VALUE) {
			return 0;
		}
		while (input != 0) {
			result = result * 10 + input % 10;
			input /= 10;
		}

		if (result > Integer.MAX_VALUE) {
			return 0;
		} else {
			return result.intValue();
		}

	}

	private static void reverseInteger_2(String result, int input) {
		while (input > 0) {
			result += input % 10;
			reverseInteger_2(result, input / 10);
		}
		System.out.println(Integer.parseInt(result));
	}

	private static void reverseInteger_1(int input) {
		String s = String.valueOf(input);
		char[] charArray = s.toCharArray();
		String resultString = "";
		for (int i = charArray.length - 1; i >= 0; i--) {
			resultString += charArray[i];
		}
		System.out.println(Integer.parseInt(resultString));

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

	private static void makeLargestNumber(int[] inputArray) {
		String[] strArray = Utility.intArrayToStringArray(inputArray);
		Arrays.sort(strArray);
		String result = "";
		for (int i = strArray.length - 1; i > 0; i--) {
			result += strArray[i];
		}
		System.out.println(result);
	}

	private static void findUniqueNumbersInArray(int[] inputArray) {
		List<Integer> uniqueNUmbers = new ArrayList<Integer>();
		for (int i = 0; i < inputArray.length; i++) {
			boolean matchFound = false;
			for (int j = inputArray.length - 1; j >= 0; j--) {
				if (i != j && inputArray[i] == inputArray[j]) {
					matchFound = true;
					break;
				}
			}
			if (!matchFound) {
				uniqueNUmbers.add(inputArray[i]);
			}
		}
		System.out.println(uniqueNUmbers);
	}

	private static void findArraySubsetOfSum(int[] inputArray, int total) {

		int currentSum = 0;
		int start = 0;
		int end = 0;
		for (int i = 0, j = 0; i < inputArray.length; i++) {
			currentSum += inputArray[i];
			while (currentSum > total) {
				currentSum -= inputArray[j];
				j++;
			}
			if (currentSum == total) {
				start = i - j - 1;
				end = i;
				break;
			}
		}
		for (int i = start; i <= end; i++) {
			System.out.print(inputArray[i] + ", ");
		}
	}

	private static void findPairsOfSum(int[] inputArray, int total) {

		List<Integer> list = Arrays.stream(inputArray).boxed().collect(Collectors.toList());
		for (int value : list) {
			int temp = total - value;
			if (list.contains(temp)) {
				System.out.println("Pair : (" + temp + ", " + value + ")");
			}
		}
	}

	private static void rotateArray(int[] inputArray, int rotateFrom) {
		int[] resultArray = new int[inputArray.length];

		for (int i = rotateFrom, j = 0; i < inputArray.length; i++, j++) {
			resultArray[j] = inputArray[i];
		}

		int rotation = inputArray.length - rotateFrom;

		for (int i = rotation, j = 0; j < rotateFrom; i++, j++) {
			resultArray[i] = inputArray[j];
		}

		for (int i : resultArray) {
			System.out.println(i);
		}

	}

	private static void findDuplicate(int[] inputArray) {
		int resultArraySize = 0;

		for (int i = inputArray.length - 1; i > 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (inputArray[i] == inputArray[j]) {
					resultArraySize += 1;
					break;
				}
			}
		}

		System.out.println(inputArray.length - resultArraySize);
	}

	private static void findDuplicateOneLoop(int[] inputArray, int start, int end, int resultArraySize) {

		int mid = 0;
		if ((start + end) % 2 == 0) {
			mid = (start + end) / 2;
		} else {
			mid = (start + end) / 2 + 1;
		}

		while (mid > start) {
			if (inputArray[start] != inputArray[mid]) {
				if (mid - 1 == start) {
					findDuplicateOneLoop(inputArray, mid, inputArray.length - 1, resultArraySize);
				} else {
					findDuplicateOneLoop(inputArray, start, mid, resultArraySize);
				}

			} else {
				resultArraySize += 1;
				start = mid;
				findDuplicateOneLoop(inputArray, start, inputArray.length - 1, resultArraySize);
			}
		}

		System.out.println(inputArray.length - 1 - resultArraySize);
		return;
	}

	private static void fibbonacci(int counter, int[] sequence) {
		int first = 1, second = 1;
		sequence[0] = first;
		sequence[1] = second;

		while (counter < 9) {
			sequence[counter] = sequence[counter - 1] + sequence[counter - 2];
			counter++;
			fibbonacci(counter, sequence);
		}

		for (int i : sequence) {
			System.out.println(i);
		}

	}

	public static int decodeWays(String inputString) {

		char[] characters = inputString.toCharArray();

		int maxPossibleCodes = 0;

		if (characters.length == 1) {
			if (characters[0] == '0') {
				return 0;
			}
			return 1;
		} else if (characters.length > 1) {
			maxPossibleCodes = 1;

			for (int i = 1; i < characters.length; i++) {
				String temp = "" + characters[i - 1] + characters[i];
				if (Integer.parseInt(inputString) > 0 && Integer.parseInt(temp) <= 26) {
					maxPossibleCodes += 1;
				}
			}
			System.out.println(maxPossibleCodes);
			return maxPossibleCodes;
		} else {
			return 0;
		}

	}

//	public static int huntNumbersInString(String word) {
//		char[] characters = word.trim().toCharArray();
//		boolean isNegative = false;
//
//		String resultString = "";
//
//		if (word.trim().startsWith("-")) {
//			isNegative = true;
//			word = word.trim().substring(1).trim();
//			System.out.println(word);
//		}
//
//		for (int i = 0; i < characters.length; i++) {
//			if (!(characters[0] >= 0 && characters[0] <= 9)) {
//				return 0;
//			} else if (characters[i] >= 0 && characters[i] <= 9) {
//				resultString += characters[i];
//			}
//		}
//		return 0;
//	}

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

	public static int countExtraDoses(int[] hurdleArray, int maxJump) {
		int requiredDose = 0;
		for (int i = 0; i < hurdleArray.length; i++) {
			if (hurdleArray[i] > 0 && (hurdleArray[i] - maxJump > requiredDose)) {
				requiredDose = hurdleArray[i] - maxJump;
			}
		}
		System.out.println(requiredDose);
		return requiredDose;

	}

	public static int divideTwoIntegers(int dividend, int divisor) {

		int counter = 0;
		int totalSum = 0;
		boolean isNegative = false;
		if (dividend == 0 || divisor == 0) {
			return 0;
		}

		if (divisor < 0 && dividend < 0) {
			divisor *= -1;
			dividend *= -1;
		} else if (dividend < 0) {
			dividend *= -1;
			isNegative = true;
		} else if (divisor < 0) {
			divisor *= -1;
			isNegative = true;
		}

		while ((dividend - totalSum >= divisor) && totalSum <= dividend) {
			if (dividend == divisor) {
				counter = 1;
				break;
			}
			if (divisor == 1) {
				counter = dividend;
				break;
			}
			totalSum += divisor;
			counter++;
		}
		if (isNegative) {
			counter *= -1;
		}
		System.out.println(counter);
		return counter;
	}

	public static int nthUglyNumber(int n, int a, int b, int c) {
		List<Integer> result = new ArrayList<Integer>();

		if (n >= 1) {
			for (int i = 1; result.size() <= n; i++) {
				if ((i % a == 0) || (i % b == 0) || (i % c == 0)) {
					result.add(i);
				}
			}
		} else {
			return 0;
		}
		System.out.println(result + "   >>  " + result.get(n - 1));

		return result.get(n - 1);
	}

	private static void mergeTwoSortedArrays() {

		int[] arr_1 = { 1, 4, 8, 10 };
		int[] arr_2 = { 5, 7, 9, 10, 11, 13 };

		int[] resultArray = new int[arr_1.length + arr_2.length];

		for (int i = 0, j = 0; i < resultArray.length; i++) {
			if (i < arr_1.length) {
				resultArray[i] = arr_1[i];
			} else {
				resultArray[i] = arr_2[j];
				j++;
			}

		}
		for (int i = 0; i < resultArray.length; i++) {
			for (int j = i + 1; j < resultArray.length; j++) {
				if (resultArray[i] > resultArray[j]) {
					int temp = resultArray[i];
					resultArray[i] = resultArray[j];
					resultArray[j] = temp;
				}
			}
		}
		System.out.println(" ********* ");
		for (int k : resultArray) {
			System.out.println(" " + k);
		}

	}

	private static void mixDifferentSizedArraysAlternatively() {
		int[] array_1 = { 1, 2, 3, 4, 5 };
		int[] array_2 = { 6, 7, 8, 9, 10, 11, 13 };
		int[] resultArray = new int[array_1.length + array_2.length];

		int counter = 0;

		for (int i = 1; i <= resultArray.length; i++) {
			if (counter == 5) {
				System.out.println("here");
			}
			if (i % 2 == 0) {

				if (counter < array_2.length) {
					resultArray[i - 1] = array_2[counter];
				} else {
					resultArray[i - 1] = array_1[counter];
				}
				counter++;
			} else {
				if (counter < array_1.length) {
					resultArray[i - 1] = array_1[counter];
				} else {
					resultArray[i - 1] = array_2[counter];
					counter++;
				}
			}
		}
		for (int i : resultArray) {
			System.out.print(i + ", ");
		}
	}

	private static void mixSameSizedArraysAlternatively() {
		int[] array_1 = { 1, 2, 3, 4, 5 };
		int[] array_2 = { 6, 7, 8, 9, 10 };
		int[] resultArray = new int[array_1.length + array_2.length];

		int counter = 0;

		for (int i = 1; i <= resultArray.length; i++) {
			if (i % 2 == 0) {
				resultArray[i - 1] = array_2[counter];
				counter++;
			} else {
				resultArray[i - 1] = array_1[counter];
			}
		}
		for (int i : resultArray) {
			System.out.print(i + ", ");
		}
	}

	private static String reverseWordsInString(String inputString) {
		String[] splittedString = inputString.split("\\s+");
		String resultString = "";

		for (int i = splittedString.length - 1; i >= 0; i--) {
			resultString += splittedString[i] + " ";
		}
		System.out.println(resultString);
		return resultString.trim();
	}

}
