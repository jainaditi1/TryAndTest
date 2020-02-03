package com.personal.projects.TryAndTest;

import java.util.ArrayList;
import java.util.List;

public class FindLeader {

	public static void main(String[] args) {
		int input[] = { 15, 18, 5, 3, 6, 2 };
		findLeader_preferred(input);

	}

	
	//iterate from the right most element:
	//right most element will always be a leader
	//now pick and update the max element : tempMax
	//and compare each number with that
	//if left element is greater than tempmax then thats the leader and also update tempmax
	private static void findLeader_preferred(int[] input) {
		List<Integer> leaders = new ArrayList<Integer>();
		leaders.add(input[input.length-1]);
		
		int tempMax = input[input.length-1];
		for (int i = input.length-2; i >= 0; i--) {
			if(input[i] > tempMax) {
				leaders.add(input[i]);
				tempMax = input[i];
			}
		}
		for(int i : leaders) {
			System.out.println(i);
		}

	}
	
	private static void findLeader(int[] input) {

		for (int i = 0; i < input.length; i++) {

			for (int j = i+1; j < input.length; j++) {
				if(input[j] > input[i]) {
					System.out.println(input[i] + " is NOT a leader");
					break;
				}
			}
			
		}

	}

}
