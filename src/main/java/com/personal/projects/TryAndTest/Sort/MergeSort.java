package com.personal.projects.TryAndTest.Sort;

public class MergeSort {
	public static void main(String[] args) {

		int[] inputArray = { 5, 1, 6, 2, 3, 4 ,8};
		mergeSort(inputArray, inputArray.length);

		for(int i : inputArray) {
			System.out.println(i);
		}
	}

	public static void mergeSort(int[] inputArray, int arrayLenth) {
		if (inputArray == null || arrayLenth < 2) {
			return;
		}
		int mid = arrayLenth / 2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[arrayLenth - mid];

		for (int i = 0; i < mid; i++) {
			leftArray[i] = inputArray[i];
		}
		
		//i starts from mid and reaches to end of array
		//hence i - mid will be mid-mid or next mid+1 - mid etc
		for (int i = mid; i < arrayLenth; i++) {
			rightArray[i - mid] = inputArray[i];
		}
		mergeSort(leftArray, mid);
		mergeSort(rightArray, arrayLenth - mid);

		merge(inputArray, leftArray, rightArray, mid, arrayLenth - mid);
	}

	
	//input array will be modified as result array so inputarray = result array
	public static void merge(int[] resultArray, int[] leftArray, int[] rightArray, int leftArrayLength,
			int rightArrayLength) {

		int leftArrayPointer = 0, rightArrayPointer = 0, resultArrayPointer = 0;

		while (leftArrayPointer < leftArrayLength && rightArrayPointer < rightArrayLength) {
			if (leftArray[leftArrayPointer] <= rightArray[rightArrayPointer]) {
				resultArray[resultArrayPointer++] = leftArray[leftArrayPointer++];
			} else {
				resultArray[resultArrayPointer++] = rightArray[rightArrayPointer++];
			}
		}
//		while (leftArrayPointer < leftArrayLength) {
//			resultArray[resultArrayPointer++] = leftArray[leftArrayPointer++];
//		}
//		while (rightArrayPointer < rightArrayLength) {
//			resultArray[resultArrayPointer++] = rightArray[rightArrayPointer++];
//		}
		
	}

}
