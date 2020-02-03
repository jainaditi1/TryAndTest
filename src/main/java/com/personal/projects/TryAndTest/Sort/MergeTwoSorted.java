package com.personal.projects.TryAndTest.Sort;


public class MergeTwoSorted {
	// Merge arr1[0..n1-1] and arr2[0..n2-1]
	// into arr3[0..n1+n2-1]
	public static void mergeArrays(int[] firstArray, int[] secondArray, int[] resultArray, int firstArrayLength, int secondArrayLength) {
		int i = 0, j = 0, k = 0;

		// Traverse both array
		while (i < firstArrayLength && j < secondArrayLength) {
			// Check if current element of first
			// array is smaller than current element
			// of second array. If yes, store first
			// array element and increment first array
			// index. Otherwise do same with second array
			if (firstArray[i] < secondArray[j])
				resultArray[k++] = firstArray[i++];
			else
				resultArray[k++] = secondArray[j++];
		}

		// Store remaining elements of first array
		while (i < firstArrayLength)
			resultArray[k++] = firstArray[i++];

		// Store remaining elements of second array
		while (j < secondArrayLength)
			resultArray[k++] = secondArray[j++];
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int n1 = arr1.length;

		int[] arr2 = { 2, 4, 6, 8 };
		int n2 = arr2.length;

		int[] arr3 = new int[n1 + n2];

		mergeArrays(arr1, arr2, arr3, n1, n2);

		System.out.println("Array after merging");
		for (int i = 0; i < n1 + n2; i++)
			System.out.print(arr3[i] + " ");
	}
}

