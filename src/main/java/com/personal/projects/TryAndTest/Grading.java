package com.personal.projects.TryAndTest;

import java.util.ArrayList;
import java.util.List;

public class Grading {
	public static void main(String[] args) {
		int[] studentsMarks = { 73,67,38,33 };
		

		studentsGrading(studentsMarks);
	}
	
	
	private static List<Integer> studentsGrading(int[] studentsMarks ){
		
		List<Integer> studentsGradingList = new ArrayList<Integer>();
		
		for(int studentMarks : studentsMarks) {
			int nextMultipleOf5 = studentMarks - (studentMarks % 5) + 5;
			System.out.println(nextMultipleOf5);
			
			
			if(nextMultipleOf5 >= 40) {
				if((nextMultipleOf5 - studentMarks) < 3) {
					studentsGradingList.add(nextMultipleOf5);
				} else {
					studentsGradingList.add(studentMarks);
				} 
			} else {
				studentsGradingList.add(studentMarks);
			}
			
		}
		System.out.println(studentsGradingList);
		return studentsGradingList;
	} 
}
