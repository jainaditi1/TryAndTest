package com.personal.projects.TryAndTest.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFSImplementation {

	public static void main(String[] args) {
		BFSNode node2 = new BFSNode(2);
		BFSNode node3 = new BFSNode(3);
		BFSNode node4 = new BFSNode(4);
		BFSNode node5 = new BFSNode(5);
		BFSNode node6 = new BFSNode(6);
		BFSNode node7 = new BFSNode(7);
		BFSNode node8 = new BFSNode(8);
		BFSNode node1 = new BFSNode(1, node2, node3);
		node2 = new BFSNode(2, node3, node4);
		node3 = new BFSNode(3, node5, node6);
		node4 = new BFSNode(4, node6, node7);
		node7 = new BFSNode(7, node4, node8);
		

		BFS.breadthFirstSearch(node1);
		
	}

}

class BFS{
	
	private static Queue<BFSNode> queue;
	
	public static void breadthFirstSearch(BFSNode head) {
		queue = new LinkedList<BFSNode>();
		queue.add(head);
		
		while(!queue.isEmpty()) {
			BFSNode current = queue.remove();
			
			System.out.println(current.value);
			
			if(current.leftChild != null) {
				queue.add(current.leftChild);
			}
			if(current.rightChild != null) {
				queue.add(current.leftChild);
			}
		}
		
	}
	
}

class BFSNode {
	int value;
	BFSNode leftChild;
	BFSNode rightChild;

	public BFSNode(int value) {
		this.value = value;
	}

	public BFSNode(int value, BFSNode leftChild, BFSNode rightChild) {
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
}
