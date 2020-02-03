package com.personal.projects.TryAndTest;

import java.util.HashSet;

public class SudokuValidator {

	public static void main(String args[]) {

		char[][] sudokuMatrix = {
		                         {'5','3','.','.','7','.','.','.','.'},
		                         {'6','.','.','1','9','5','.','.','.'},
		                         {'.','9','8','.','.','.','.','6','.'},
		                         {'8','.','.','.','6','.','.','.','3'},
		                         {'4','.','.','8','.','3','.','.','1'},
		                         {'7','.','.','.','2','.','.','.','6'},
		                         {'.','6','.','.','.','.','2','8','.'},
		                         {'.','.','.','4','1','9','.','.','5'},
		                         {'.','.','.','.','8','.','.','7','9'}
	};
		
		isValidSudoku(sudokuMatrix);
		
	}

	private static boolean isValidSudoku(char matrix[][]) {

		HashSet<String> seenElements = new HashSet<String>();

		for (int row = 0; row < 9; row++) {
			for (int column = 0; column < 9; column++) {

				if (matrix[row][column] != '.') {

					//make sure while iterating any element does NOT already exists in hashset
					if (!seenElements.add("Element " + matrix[row][column] + " found in " + row + " row")
							|| !seenElements.add("Element " + matrix[row][column] + " found in " + column + " column")
							|| !seenElements.add("Element " + matrix[row][column] + " found in " + row / 3 + " - "
									+ column / 3 + " square")) {
						return false;
					}

				}
			}
		}

		return true;
	}

}
