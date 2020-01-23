package com.personal.projects.TryAndTest.Sort;

import java.util.Arrays;
import java.util.TreeSet;

public class Sorting {

	public static void main(String[] args) {
		sort_INSERTION_SORT();
//		sortStrings_TREESET();
//		sortStrings_ARRAYS_SORT();
	}

//	O(n^2)
	private static void sort_INSERTION_SORT() {
		int[] array = { 4, 53, 2, 55, 44, 23, 2 };

		// i=1 : start with second element
		for (int i = 1; i < array.length; i++) {

			// temp store the first element from start
			int tempStore = array[i];

			// APPROACH: Whereever my pointer is, the left side should be sorted from the
			// pointer

			// Index of previous element from counter/pointer
			int j = i - 1;

			// tempStore = (first element from start) is less than its previous element
			// as soon as it enters in while loop meeting below condition, it will again
			// loop through LEFT side to place the elements in the sorted position
			// so we know our left side from pointer is always sorted
			while (j >= 0 && tempStore < array[j]) {
				array[j + 1] = array[j];
				j--;
			}
			// at this point we've exited, so j is either -1
			// or it's at the first element where tempStore >= array[j]
			array[j + 1] = tempStore;
		}

		for (int i : array) {
			System.out.println(i);
		}
	}


	private static void sortStrings_TREESET() {
		String[] strArr = { "adam", "sakina", "adam", "lucy", "jake", "bob" };
		TreeSet<String> stringSet = new TreeSet<String>();

		for (String s : strArr) {
			stringSet.add(s);
		}
		System.out.println(stringSet);

	}

	private static void sortStrings_ARRAYS_SORT() {
		String[] strArr = { "adam", "sakina", "adam", "lucy", "jake", "bob" };
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		for (String s : strArr) {
			System.out.println(s);
		}
	}

}
