package com.personal.projects.TryAndTest.Sort;

public class Sorting_Algorithms {
	public static void main(String[] args) {
		int[] inputArray = { 73, 67, 38, 33, 55, 65 };
		bubbleSort(inputArray);
		insertionSort(inputArray);
//		selectionSort(inputArray);
	}

	private static void bubbleSort(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[j] < inputArray[i]) {
					int temp = 0;
					temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
		for (int i : inputArray) {
			System.out.println(i);
		}
	}

	private static void insertionSort(int[] inputArray) {

		for (int i = 0; i < inputArray.length - 1; i++) {

			if (inputArray[i] > inputArray[i + 1]) {
				int temp = 0;
				temp = inputArray[i];
				inputArray[i] = inputArray[i + 1];
				inputArray[i + 1] = temp;

				// Another FOR loop for the left of current pointer
				// Make sure the left of pointer is always sorted
				for (int j = i - 1; j > 0; j--) {
					if (inputArray[j] < inputArray[j - 1]) {
						temp = inputArray[j - 1];
						inputArray[j - 1] = inputArray[j];
						inputArray[j] = temp;
					}
				}
			}
		}
		for (int i : inputArray) {
			System.out.println(i);
		}

	}

	private static void selectionSort(int[] inputArray) {

		for (int j = 1; j < inputArray.length; j++) {
			int minValue = inputArray[j - 1];
			for (int i = j + 1; i < inputArray.length; i++) {
				if (inputArray[i] < minValue) {
					int temp = 0;
					temp = inputArray[i];
					inputArray[i] = minValue;
					minValue = temp;
				}
			}
			inputArray[j - 1] = minValue;
		}
		for (int i : inputArray) {
			System.out.println(i);
		}

	}
}

class Solution {
	
	public static void main(String[] args) {
		System.out.println(isNumber("959440.94f"));
	}
	public static boolean isNumber(String s) {
		boolean isValidNumber = false;
    	try {
    		Float.parseFloat(s);
    		isValidNumber = true;
    	} catch (NumberFormatException e) {
    		e.getMessage();
    	} catch (Exception e) {
    		e.getMessage();
    	}
    	return isValidNumber;
    	
    }
}
