package com.personal.projects.TryAndTest;

public class IsAmstrong {
	public static void main(String[] args) {
//		System.out.println(isArmstrong(153));
//		System.out.println(squareRoot(100));
//		System.out.println(gcd(105, 10));

		int[] input = new int[] { -1, -4, 2, 3, 5, 6, 8, 9, 10, 11, 14, 16,17 };
		System.out.println(binarySearch(input, 11, 0, input.length));
	}

	private static int binarySearch(int[] input, int searchFor, int start, int end) {
 		int mid = start + (end- start) /2;
		if(input[mid] == searchFor) {
			return mid;
		} else if (searchFor < input[mid]) {
			return binarySearch(input, searchFor, start, mid);
		} else {
			return binarySearch(input, searchFor, mid+1, end);
		}
		
		
	}

	private static boolean isArmstrong(int input) {
		int result = 0;
		int temp = input;
		while (input > 0) {
			int lastDigit = input % 10;

			int cube = lastDigit * lastDigit * lastDigit;
			System.out.println(cube);
			result += cube;
			input = input / 10;
		}

		if (result == temp) {
			return true;
		}

		return false;
	}

	private static int squareRoot(int input) {
		int start = 2;

		for (int i = start; i < input / 2; i++) {
			if (input / i == i) {
				return i;
			}
		}

		return 0;
	}

	private static int gcd(int input1, int input2) {
		int bigger = 0;
		int smaller = 0;
		if (input1 < input2) {
			if (input2 % input1 == 0) {
				return input1;
			}
			smaller = input1;
			bigger = input2;
		} else {
			if (input1 % input2 == 0) {
				return input2;
			}
			smaller = input2;
			bigger = input1;
		}

		int result = 1;

		for (int i = 2; i <= smaller / 2; i++) {
			if (bigger % i == 0 && smaller % i == 0) {
				if (result < i) {
					result = i;
				}
			}
		}

		return result;
	}
}
