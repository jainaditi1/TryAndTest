package com.personal.projects.TryAndTest.BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class LevelOrderTraversal_BFS_BinaryTree {

	private static BinaryTreeNode head;

	public static void main(String[] args) {

		
		
		
	}

	//PRINT  PRINT PRINT
	// EACH LEVEL 
	private static void levelTraversal_BFS(BinaryTreeNode root) {
		// List of each level > list of first level (1 node), second level (2 nodes) ,
		// third (upto 4 nodes)
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (root == null) {
			return;
		}

		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(root);

		while (!queue.isEmpty()) {

			//outside FOR loop so we can initialize list before each level
			List<Integer> currentLevel = new ArrayList<Integer>();

			for (int i = 0; i < queue.size(); i++) {
				
				//add all nodes in one level to list of current level
				BinaryTreeNode node = queue.remove();
				currentLevel.add(node.value);

				if (node.leftChild != null) {
					queue.add(node.leftChild);
				}
				if (node.rightChild != null) {
					queue.add(node.rightChild);
				}
			}
			
			result.add(currentLevel);

		}
		
		for(List<Integer> list : result) {
			for(Integer i : list) {
				System.out.print( i );
			}
			System.out.println();
		}

	}

}

class BinaryTreeNode {
	int value;
	BinaryTreeNode leftChild;
	BinaryTreeNode rightChild;

	public BinaryTreeNode(int value) {
		super();
		this.value = value;
	}

}