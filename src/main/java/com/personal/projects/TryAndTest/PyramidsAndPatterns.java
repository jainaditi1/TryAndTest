package com.personal.projects.TryAndTest;

public class PyramidsAndPatterns {
	public static void main(String[] args) {
//		makeAsterisksTriangle();
//		makeAsterisksTriangle_2(6);
//		numberMatrix();
//		multiplyOddAndAddEvens(20, 100);
		countNumberOfDigits(342342);
		
		
		
		
		//NOOOOO
//		makePyramid();
	}
	
	
	
	private static void countNumberOfDigits(int input) {
		
		// *** WAY #1 ****
		//convert int to string
		//convert string to char array str.toCharArr() = char[];
		//get length of char arr

		
		// *** WAY #2 ****
		int counter = 0;
		int temp = input;
		while(temp > 0) {
			counter ++;
			temp /= 10;
		}
		System.out.println(counter);
		
	}
	

	/*
	 * 
	 * @
	 * @ @
	 * @   @
	 * @     @
	 * @       @
	 * @ @ @ @ @ @
	 */
	private static void makeAsterisksTriangle_2(int max) {
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max; j++) {

				if (i == max - 1) {
					System.out.print(" @");
				} else if (j == 0 || j == i) {
					System.out.print(" @");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();

		}
	}

//	 * $ $ $ $
//	 * * $ $ $
//	 * * * $ $
//	 * * * * $
//	 * * * * *
	private static void makeAsterisksTriangle() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j <= i) {
					System.out.print(" *");
				} else {
					System.out.print(" $");
				}

			}
			System.out.println("");
		}
	}

//	1   10   11   20   21   30   
//	2   9   12   19   22   29   
//	3   8   13   18   23   28   
//	4   7   14   17   24   27   
//	5   6   15   16   25   26   
//	6   5   16   15   26   25   
//	7   4   17   14   27   24   
//	8   3   18   13   28   23   
//	9   2   19   12   29   22   
//	10   1   20   11   30   21   
	private static void numberMatrix() {
		for (int i = 1, j = 10, k = 11, l = 20, m = 21, n = 30; i <= 10;) {
			System.out.print(i + "   " + j + "   " + k + "   " + l + "   " + m + "   " + n + "   ");
			i++;
			j--;
			k++;
			l--;
			m++;
			n--;
			System.out.println();
		}
	}
	
	private static void multiplyOddAndAddEvens(int oddMax, int evenMax) {
		
		long oddResult = 1;
		long evenResult = 0;
		
		for(int i=1; i<oddMax; i++) {
			if(i % 2 != 0) {
				oddResult *= i;
			}
		}
		for(int i=1; i<evenMax; i++) {
			if(i % 2 == 0) {
				evenResult += i;
			}
		}
		
		System.out.println(oddResult);
		System.out.println(evenResult);
	}
	
	
	
	
//	 * 
//	 * * 
//	 * * * 
//	 * * * * 
//	 * * * * *
	private static void makePyramid() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == i) {
					System.out.print(" *");
				} 
			}
			for (int j = 4; j > 0; j--) {
				if (j == i) {
					System.out.print(" *");
				} 
			}
			System.out.println("");
		}
	}
	
}
