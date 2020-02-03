package com.personal.projects.TryAndTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SecondLargest {
	public static void main(String[] args) {
//		int[] input = new int[] { 3, 2, 4, 5, 1, 7, -1, 9, 6, -5 };
//		findSecondLargest(input);

//		int[][] matrix1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		int[][] matrix2 = new int[][] { { 3, 2, 1 }, { 6, 5, 4 }, { 9, 8, 7 } };
//		addMatrixes(matrix1, matrix2);

//		int input = 255;
//		int givenDigit = 2;
//		findLargestWithoutGivenDigit(input, givenDigit);

//		int[] input = new int[] { 3, 2, 4, 5, 1, 7, -1, 9, 6, -5 };
//		int sum = 11;
//		findPairsEqualToSum(input, sum);

//		int[] input = new int[] { 3, 2, 4, 5, 1, 7, -1, 9, 6, -5 };
//		int sum = 16;
//		continuousSubArrayEqualToSum(input, sum);

		
//		System.out.println(isBinary(110010110));
//		//to char array : iterate each char equals to eiter 0 or 1
//		//check via regex if string contain 0 or 1
//		//int[] == 0 or 1
//		// % == number check
 
	}
	


	private static void continuousSubArrayEqualToSum(int[] input, int sum) {
		int temp = 0;
		int j = 0;
		for (int i = 0; i < input.length; i++) {
			temp += input[i];

			while (temp > sum) {
				temp -= input[j];
				j++;
			}
			if (temp == sum) {
				return;
			}
		}

	}

	private static void findPairsEqualToSum(int[] input, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < input.length; i++) {
			set.add(sum - input[i]);
		}

		for (int i = 0; i < input.length; i++) {
			if (set.contains(input[i])) {
				int pair = sum - input[i];
				System.out.println("found pairl : " + input[i] + " and  " + pair);
			}
		}
	}

	private static int findLargestWithoutGivenDigit(int input, int givenDigit) {
		String givenNumber = String.valueOf(input);
		if (!givenNumber.contains(String.valueOf(givenDigit))) {
			return input;
		} else {
			while (true) {
				input -= 1;
				givenNumber = String.valueOf(input);
				if (!givenNumber.contains(String.valueOf(givenDigit))) {
					System.out.println(Integer.parseInt(givenNumber));
					return Integer.parseInt(givenNumber);
				}
			}

		}

	}

	private static void addMatrixes(int[][] matrix1, int[][] matrix2) {
		int[][] result = new int[3][3];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				System.out.println(result[i][j]);
			}
		}

	}

	private static void findSecondLargest(int[] input) {

		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < input.length; i++) {

			for (int j = i + 1; j < input.length; j++) {
				if (input[i] < input[j]) {
					if (input[j] > firstLargest) {
						secondLargest = firstLargest;
						firstLargest = input[j];
					}
				} else {
					if (input[i] > firstLargest) {
						secondLargest = firstLargest;
						firstLargest = input[i];
					}
				}

			}
		}

		System.out.println(firstLargest);
		System.out.println(secondLargest);

	}

}
