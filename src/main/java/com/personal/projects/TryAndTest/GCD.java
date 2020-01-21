package com.personal.projects.TryAndTest;

import java.util.ArrayList;
import java.util.List;

public class GCD {
	public static void main(String[] args) {
		findGCD(64, 72);
	}
	
	private static void findGCD(int input_1, int input_2) {
		
		
		List<Integer> denominators = new ArrayList<Integer>();
		
		int tempGCD = 1;
		for(int i = 2; i<input_1/2; i++) {
			if(input_1 % i == 0) {
				denominators.add(i);
			}
		}
		
		for(int i = denominators.size()-1; i > 0; i--) {
			if(input_2 % denominators.get(i) == 0) {
				tempGCD = denominators.get(i);
				System.out.println(tempGCD);
				break;
			}
		}
		
		
	}
	
}
