package com.personal.projects.TryAndTest;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] input = { 0, 1, 0, 3, 12 };
		moveZeroesTwoPointer(input);
//		moveZeroes(input);
	}

	private static int moveZeroes(int[] input) {

		int i = 0;
		int numberOfZeroes = 0;
		while (i < input.length && input[i] == 0) {
			while (++i < input.length && input[i] != 0) {
				input[numberOfZeroes] = input[i];
				numberOfZeroes++;
			}
		}
		while (numberOfZeroes < input.length) {
			input[numberOfZeroes] = 0;
			numberOfZeroes++;
		}

		return numberOfZeroes;

	}

	private static int moveZeroesTwoPointer(int[] input) {
		int placeAt = 0;

		if(input == null || input.length == 0) {
			return 0;
		}
		
		for (int i = 0, j = i + 1; i < input.length - 1; i++, j++) {

			if (input[i] == 0 && j < input.length) {
				while ( input[j] == 0 ) {
					j++;
				}
				input[placeAt] = input[j];
				input[j] = 0;
				placeAt++;
			}

		}
		while(placeAt < input.length) {
			input[placeAt] = 0;
			placeAt++;
		}

		return placeAt;

	}
}
