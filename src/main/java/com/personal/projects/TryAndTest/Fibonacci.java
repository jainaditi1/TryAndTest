package com.personal.projects.TryAndTest;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {
		generateFibonacciUntil(1000);
	}
	
	private static void generateFibonacciUntil(int benchmark) {
		
		int i = 0, j = 1;
		
		List<Integer> fibs = new ArrayList<Integer>();
		fibs.add(i);
		fibs.add(j);
		
		while(fibs.size()>=2) {
			int next = fibs.get(fibs.size()-1) + fibs.get(fibs.size()-2);
			if(next < benchmark) {
				fibs.add(next);
			} else {
				break;
			}
		}
		System.out.println(fibs);
	}
}
