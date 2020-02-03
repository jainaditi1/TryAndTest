package com.personal.projects.TryAndTest;

import java.util.PriorityQueue;

public class KthLargestElement {
	public static void main(String[] args) {
		// 4th largest
		int[] input = { 3, 6, 2, 7, 12, 9, 4, 10, 45, 23 };

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		for (int element : input) {
			queue.add(element);

			if (queue.size() > 4) {
				queue.remove();
			}
		}
		System.out.println(queue.peek());


	}
}