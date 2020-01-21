package com.personal.projects.TryAndTest;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("I should find prime number until which number?");
		
		int benchmark = scanner.nextInt();
		
		
		
		
		listAllPrimesUntil(benchmark);
//		findIfANumberIsPrime();
	}

	
	
	private static void listAllPrimesUntil(int input) {
		
		if(input <= 0) {
			System.out.println("please enter valid input");
		}
		
		
		for(int i = 1; i<input; i++) {
			int maxDivisbleBy = i/2;
			boolean isPrime = true;
			for(int j=2; j<=maxDivisbleBy; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i + " is prime number");
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void findIfANumberIsPrime() {
		int input = 26;
		boolean isPrime = true;
		for (int i = 0; i < input / 2; i++) {
			if (i > 1 && (input % i == 0)) {
				System.out.println("Not a prime number.");
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println(input + " is a prime number.");
		}
	}
	
//	private static void listAllPrimesUntil(int input) {
//		for(int j=0; j<input; j++) {
//			boolean isPrime = true;
//			if(j > 3) {
//				for (int i = 0; i <= j / 2; i++) {
//					if (i > 1 && (j % i == 0)) {
//						isPrime = false;
//						break;
//					}
//				}	
//			} else if (j > 0 && j<=3){
//				isPrime = true;
//			}
//			
//			if (isPrime) {
//				System.out.println(j + " is a prime number.");
//			}
//		}
//	}
}
