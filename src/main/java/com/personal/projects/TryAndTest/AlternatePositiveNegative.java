package com.personal.projects.TryAndTest;

import java.util.Arrays;

public class AlternatePositiveNegative {

	public static void main(String args[]) {

		int[] input = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };

		Arrays.sort(input);
		

		if (input[0] >= 0 || input[input.length - 1] <= 0) {
			return;
		}

		for (int i = 1; i < input.length; i++) {
			if (i%2 == 1 && input[i] < 0) {
				int temp = input[i];
				input[i] = input[input.length - 1];
				input[input.length - 1] = temp;
			}
		}

		for (int number : input) {
			System.out.println(number);
		}

	}

}
