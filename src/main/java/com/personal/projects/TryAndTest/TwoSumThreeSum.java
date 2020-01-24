package com.personal.projects.TryAndTest;

import java.util.Arrays;

public class TwoSumThreeSum {

	public static void main(String[] args) {
		int[] input = { 1, 3, 2, -1, 9, -11, 1 };
//		twoSum(input, 10);

		threeSumEqualsZero_0(input, input.length);
	}

	
	///////////////////
	//TWO SUM
	///////////////////

	private static boolean twoSum(int[] array, int sum) {

		Arrays.sort(array);
		int i = 0, j = array.length - 1;

		while (i < j) {
			if (array[i] + array[j] > sum) {
				j--;
			} else if (array[i] + array[j] < sum) {
				i++;
			} else {
				System.out.println("numbers are : " + array[i] + " and " + array[j]);
				return true;
			}
		}

		return false;
	}

	
	
	
	
	///////////////////
	//THREE SUM
	///////////////////
	private static boolean threeSumEqualsZero_0(int[] array, int arraySize) {
		Arrays.sort(array);
		
		//if we need to find sum = 20 ... then second param will be : (sum - array[i])
		
		for (int i = 0; i < arraySize - 2; i++) {

			if (HELPER_twoSum(array, -array[i], i + 1)) {
				return true;
			}

		}

		return false;
	}

	private static boolean HELPER_twoSum(int[] array, int sum, int i) {

		Arrays.sort(array);
		int j = array.length - 1;

		while (i < j) {
			if (array[i] + array[j] > sum) {
				j--;
			} else if (array[i] + array[j] < sum) {
				i++;
			} else {
				System.out.println("numbers are : " + array[i] + " and " + array[j]);
				return true;
			}
		}

		return false;
	}

}
