
package com.personal.projects.TryAndTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerAlgorithmes {
	public static void main(String[] args) {

		mixSameSizedArraysAlternatively();
		
		
		mixDifferentSizedArraysAlternatively();
		
		
		mergeTwoSortedArrays();
		
		
		
		nthUglyNumber(3, 2, 3, 5);

		
		
		divideTwoIntegers(-2147483648, -1);

		
		
		
		int[] hurdleArray = {1,6,3,5,2};
		int maxJump = 4;
		countExtraDoses(hurdleArray, maxJump);

		

//		huntNumbersInString("    -46");


		
		decodeWays("10");

		
		int[] inputArray = new int[10];
		fibbonacci(2, inputArray);

		
		
		
		inputArray = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		findDuplicate(inputArray);
		findDuplicateOneLoop(inputArray, 0, inputArray.length, 0);

		
		
		inputArray = new int[] { 0, 3, 7, 9, 11, 12, 12, 13, 13, 14 };
		rotateArray(inputArray, 4);

		
		
		inputArray = new int[] { 0, 3, 7, 1, 7, 9, 11, 6, 3, 5, 2, 13, 14 };
		findPairsOfSum(inputArray, 11);

		
		
		
		inputArray =new int[]  { 0, 3, 7, 1, 7, 9, 11, 6, 3, 5, 2, 13, 14 };
		findArraySubsetOfSum(inputArray, 24);

		
		
		inputArray = new int[] { 4, 10, 2, 2, 1, 4,3,1 };
		findUniqueNumbersInArray(inputArray);

		
		
		inputArray = new int[] { 4, 10, 23, 32, 1 };
		makeLargestNumber(inputArray);

		
		
//		int[] inputArray = new int[10];
//		inputArray = new int[]  { 0, 3, 7, 1, 7, 9, 11, 6, 304, 5, 2, 13, 14 };
//		findNthDigit();
		



		int i = 1534236469;
		reverseInteger(i);

		
		
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

//		int[] inputArray = new int[] { -21, -31, 7, 1, 7, 9, -11, 6, 34, 5, 2, 13, 14 };
//		largestMultiplicationOf3Digits(inputArray);
		
		


	}
	
	
	

	private static int largestMultiplicationOf3Digits(int[] input) {
		int result = 0;

		Arrays.sort(input);

		int i = 0;
		int j = input.length - 1;

		int leftProduct = input[i] * input[i + 1];
		int rightProduct = input[j] * input[j - 1];

		if (leftProduct > rightProduct) {
			result = leftProduct * input[j];
		} else {
			result = rightProduct * input[j-2];
		}

		System.out.println(result);

		return result;
	}

	private static void rotatePicture(int picture[][]) {

		for (int row = 0, col = 0; row < picture.length; row++, col++) {

			int temp = picture[row][col];

			picture[row][col] = picture[col][row];

			picture[col][row] = temp;
		}

		for (int row = 0, col1 = 0, col2 = picture.length - 1; col1 < picture.length / 2; row++, col1++, col2--) {

			int temp = picture[row][col1];

			picture[row][col1] = picture[row][col2];

			picture[row][col2] = temp;

		}

		for (int row = 0, col = 0; row < picture.length; row++, col++) {
			System.out.println(picture[row][col] + " , ");
		}

	}

	private static void mergeSortedArrays(int[] sortedArray_1, int[] sortedArray_2) {

		int[] resultArray = new int[sortedArray_1.length + sortedArray_2.length];
		int counter = 0;
		for (int i = 0; i < sortedArray_2.length; i++) {
			if (sortedArray_1[counter] > sortedArray_2[i]) {

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

}
