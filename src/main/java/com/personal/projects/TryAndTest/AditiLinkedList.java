package com.personal.projects.TryAndTest;

import java.util.ArrayList;
//import java.util.LinkedList;

public class AditiLinkedList {

	private static ListNode head;

	public static void main(String args[]) {
		add(4);
		add(5);
		add(6);
		add(6);
		add(5);
		add(4);
		add(9);

//		reverseLinkedList();

		isPalindrome();

//		hasCycle(head, 2);

//		mergeSortedLinkedList();
//		com.personal.projects.TryAndTest.LinkedList list = new com.personal.projects.TryAndTest.LinkedList();
//		list.addNode(4);
//		list.addNode(7);
//		list.addNode(9);
//
//		com.personal.projects.TryAndTest.LinkedList list2 = new com.personal.projects.TryAndTest.LinkedList();
//		list2.addNode(3);
//		list2.addNode(7);
//		list2.addNode(10);
	}

	public static boolean hasCycle(ListNode head) {
		boolean hasCycle = false;
		ListNode hare = head;
		ListNode tortoise = head;

		while (tortoise.next != null && hare.next.next != null) {

			hare = hare.next.next;
			tortoise = tortoise.next;

			if (hare == tortoise) {
				hasCycle = true;
			}
		}
		return hasCycle;
	}

	public static void mergeSortedLinkedList(LinkedList list, LinkedList list2) {

	}

	public static boolean isPalindrome() {
		boolean isPalindrome = true;
		ListNode temp = head;
		ArrayList<Integer> listValues = new ArrayList<Integer>();
		while (temp.next != null) {
			listValues.add(temp.value);
			temp = temp.next;
		}
		listValues.add(temp.value);

		for (int i = 0, j = listValues.size() - 1; i < listValues.size(); i++, j--) {
			if (listValues.get(i) != listValues.get(j)) {
				isPalindrome = false;
			}
		}
		System.out.println(isPalindrome);
		return isPalindrome;
	}

	private static void reverseLinkedList() {

		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;

		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}

		ListNode tempNode = previous;

		while (tempNode.next != null) {
			System.out.println(tempNode.value);
			tempNode = tempNode.next;
		}
		System.out.println(tempNode.value);

	}

	private static void add(int value) {

		if (head == null) {
			head = new ListNode(4, null);
		} else {

			ListNode tempNode = head;

			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}

			ListNode toAdd = new ListNode(value, null);
			tempNode.next = toAdd;
		}
	}

	private static void deleteAt(int index) {
		if (head == null) {
			System.out.println("No element in list!");
			return;
		}
		int start = 0;
		ListNode tempNode = head;
		ListNode previous = head;
		while (start <= index && tempNode.next != null) {
			if (start == index - 1) {
				previous = tempNode;
			}
			tempNode = tempNode.next;
			start++;
		}

		previous.next = tempNode;

	}

	private static void deleteAditiNode(ListNode node) {
		if (head == null) {
			System.out.println("No element in list!");
			return;
		}
		ListNode tempNode = head;
		while (tempNode.value == node.value) {
			tempNode = tempNode.next;
		}

		ListNode nextLink = tempNode.next.next;

		tempNode.next = nextLink;

	}

}

class ListNode {
	int value;
	ListNode next;

	public ListNode(int value, ListNode next) {
		this.value = value;
		this.next = next;
	}

}
