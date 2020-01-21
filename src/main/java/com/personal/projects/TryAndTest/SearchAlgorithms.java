package com.personal.projects.TryAndTest;

import java.util.HashSet;
import java.util.Set;

public class SearchAlgorithms {

	public static void main(String[] args) {
		int[] array = { 4, 53, 2, 55, 44, 23, 2 };
		int searchFor = 23;
//		linearSearch(array, searchFor);

		int[] sortedArray = { 4, 7, 16, 23,23,23, 44, 55, 67, 67, 83 };
//		binarySearch(sortedArray, searchFor, 0, sortedArray.length);
		findAllWithBinarySearch(sortedArray, searchFor, 0, sortedArray.length);
	}

	private static void linearSearch(int[] array, int searchFor) {
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (searchFor == array[i]) {
				counter++;
			}
		}
		System.out.println(searchFor + " existed for " + counter + " times.");
	}

	private static void binarySearch(int[] sortedArray, int searchFor, int startIndex, int endIndex) {

		int middle = (startIndex + endIndex) / 2;
		if (sortedArray[0] == searchFor || sortedArray[endIndex-1] == searchFor) {
			System.out.println("found match");
		} else if (middle > 1) {
			System.out.println("Middle element : " + sortedArray[middle]);
			if (searchFor < sortedArray[middle]) {
				binarySearch(sortedArray, searchFor, startIndex, middle);
			} else if (searchFor > sortedArray[middle]) {
				binarySearch(sortedArray, searchFor, middle, endIndex);
			} else if (searchFor == sortedArray[middle]) {
				System.out.println("found match at " + middle);
			}
		} else if (sortedArray[middle] == searchFor) {
			System.out.println("found match at " + middle);
		}
	}
	
	
	private static void findAllWithBinarySearch(int[] sortedArray, int searchFor, int startIndex, int endIndex) {

		Set<Integer> set = new HashSet<Integer>();
		int middle = (startIndex + endIndex) / 2;
		if (sortedArray[0] == searchFor ) {
			set.add(0);
		} else if(sortedArray[endIndex-1] == searchFor) {
			set.add(endIndex);
			if((endIndex-1) >= 1 && sortedArray[endIndex-2] == searchFor) {
				findAllWithBinarySearch(sortedArray, searchFor, startIndex, endIndex-1);
			}
		} else if (middle > 1) {
			if (searchFor < sortedArray[middle]) {
				findAllWithBinarySearch(sortedArray, searchFor, startIndex, middle);
			} else if (searchFor > sortedArray[middle]) {
				findAllWithBinarySearch(sortedArray, searchFor, middle, endIndex);
			} else if (searchFor == sortedArray[middle]) {
				int index = middle+1;
				set.add(index);
				
				if(middle >= 1 && sortedArray[middle-1] == searchFor) {
					findAllWithBinarySearch(sortedArray, searchFor, startIndex, middle);
				}
				if(sortedArray[middle+1] == searchFor) {
					findAllWithBinarySearch(sortedArray, searchFor, middle, endIndex);
				}
			}
		} else if (sortedArray[middle] == searchFor) {
			int index = middle+1;
			set.add(index);
			if(middle >= 1 && sortedArray[middle-1] == searchFor) {
				findAllWithBinarySearch(sortedArray, searchFor, startIndex, middle);
			}
		}
		System.out.println(set);
	}
}
