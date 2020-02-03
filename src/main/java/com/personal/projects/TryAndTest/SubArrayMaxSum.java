package com.personal.projects.TryAndTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.TreeSet;

public class SubArrayMaxSum {

	public static void main(String args[]) {

//		subArrayWithMaxSum();
//		subArrayWithGivenSum();
//		subArrayWithLargestProduct();

		longestConsecutiveSequence();
	}

	private static void longestConsecutiveSequence() {
		int[] input = { 1, 3, 6, 2, 7, 9, 10, 11, 12 };

		Arrays.sort(input);
		int currentSequenceLength = 0;
		int tempSequenceLength = 0;
		
//		{ 1, 2, 3, 6, 7, 9, 10, 11, 12 };

		for (int i = 0, j = i + 1; i < input.length && j < input.length; i++, j++) {
			if (input[j] - input[i] == 1) {
				tempSequenceLength++;
				if(tempSequenceLength > currentSequenceLength) {
					currentSequenceLength = tempSequenceLength;
				}
				
			} else {
				tempSequenceLength = 0;
			}

		}
		System.out.println(currentSequenceLength+1);
	}

	private static void subArrayWithLargestProduct() {
		int[] input = { 1, -3, 6, -2, 1, 3, 10, -11, 15 };
		int result = Integer.MIN_VALUE;

		for (int i = 0; i < input.length; i++) {
			int temp = input[i];
			if (result < temp) {
				result = temp;
			}
			for (int j = i + 1; j < input.length; j++) {
				temp *= input[j];
				if (result < temp) {
					System.out.println("Product found at i= " + i + " and j= " + j);
					result = temp;
				}
			}
		}
		System.out.println(result);
	}

	private static void subArrayWithGivenSum() {
		int[] input = { -11, -3, 6, 2, -11, -15 };
		int sum = -24;

		for (int i = 0; i < input.length; i++) {
			int temp = input[i];
			if (temp == sum) {
				System.out.println("Match found at i= " + i);
				return;
			}
			for (int j = i + 1; j < input.length; j++) {
				temp += input[j];
				if (temp == sum) {
					System.out.println("Match found at i= " + i + " and j= " + j);
					return;
				}
			}
		}
		System.out.println("Match not found");

	}

	private static void subArrayWithMaxSum() {
		int[] input = { 1, -3, 6, -2, 1, 3, 10, -11, 15 };

		int result = Integer.MIN_VALUE;

		for (int i = 0; i < input.length; i++) {

			int tempResult = input[i];
			if (tempResult > result) {
				result = tempResult;
			}

			for (int j = i + 1; j < input.length; j++) {
				tempResult += input[j];
				if (result < tempResult) {
					result = tempResult;
				}
			}
		}
		System.out.println(result);
	}
}
