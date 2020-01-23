package com.personal.projects.TryAndTest.BST;

public class BST_BinaryTree {

	private static TreeNode head;
	
	
	public  static void main(String[] args) {
		addTreeNode(4);
	}
	
	private static void addTreeNode(int value){
		if(value < 0) {
			return;
		}
		if(head == null) {
			head = new TreeNode(value);
			return;
		} else {
			
			TreeNode currentNode = head;
			TreeNode parent;
			
			while(true) {
				
				parent = currentNode;
				if(value < parent.value) {
					
					currentNode = currentNode.leftChild;
					
					if(currentNode == null) {
						parent.leftChild = new TreeNode(value);
						return;
					}
				}
				
				if(value > parent.value) {
					currentNode = currentNode.rightChild;
					if(currentNode == null) {
						parent.rightChild = new TreeNode(value);
						return;
					}
				}
				
			}
			
		}
		
		
	}
	
	
}



class TreeNode{
	int value;
	TreeNode leftChild;
	TreeNode rightChild;
	
	public TreeNode(int value) {
		super();
		this.value = value;
	}
	
	
}
