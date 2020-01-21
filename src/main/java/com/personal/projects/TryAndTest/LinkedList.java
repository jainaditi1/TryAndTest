package com.personal.projects.TryAndTest;

public class LinkedList {

	public static void main(String[] args) {

		addNode(5);
		addNode(10);
		addNode(15);
		addNode(20);
		addNode(25);
		addNode(30);

		getNodes();

		deleteNode(25);

		
		reverseLinkedList();
		
	}

	static Node head;
	static Node lastAdded;

	
	public static void reverseLinkedList() {
		Node current = null;
		Node next = null;
		Node previous = null;
		
		if (head == null) {
			return;
		}  
		current = head;
		
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		head = previous;
		
		getNodes();
		
	}
	
	
	public static void addNode(int value) {
		if (head == null) {
			head = new Node(value, null);
			lastAdded = head;
		} else {
			Node nextNode = head.next;

			if (nextNode == null) {
				head.next = new Node(value, null);
				lastAdded = head.next;
				return;
			}

			while (nextNode.next != null) {
				nextNode = nextNode.next;
			}
			nextNode.next = new Node(value, null);
			lastAdded = nextNode.next;
		}
	}

	public static void getNodes() {

		if (head == null) {
			return;
		} else {
			// get first element
			System.out.println(head.value);
		}
		Node nextNode = head.next;

		while (nextNode.next != null) {
			System.out.println(nextNode.value);
			nextNode = nextNode.next;
		}

		// get last element
		System.out.println(nextNode.value);

	}

	public static void deleteNode(int input) {
		if (head == null) {
			return;
		}

		Node previous = null;
		Node current;
		Node next;
		Node node = head;

		while (node.value != input) {
			previous = node;
			node = node.next;
		}

		current = node;
		next = current.next;

		previous.next = next;

	}

}

class Node {

	int value;
	Node next;

	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}

}