package com.personal.projects.TryAndTest.BinarySearchTree;


public class BST_ISValid_Tree {

	 public boolean isValidBST(TreeNode_valid root) {
	        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
	    }
	    
	    public boolean isValidBST(TreeNode_valid root, long minVal, long maxVal) {
	        if (root == null) return true;
	        if (root.value >= maxVal || root.value <= minVal) return false;
	        
	        
	        // left child can be any thing until LONG MIN VALUE except it has to be less than root value
	        // right child can be any thing until LONG MAX VALUE except it has to be more than root value
	        return isValidBST(root.leftChild, minVal, root.value) 
	        		&& isValidBST(root.rightChild, root.value, maxVal);
	    }

}

class TreeNode_valid {
	int value;
	TreeNode_valid leftChild;
	TreeNode_valid rightChild;

	public TreeNode_valid(int value) {
		super();
		this.value = value;
	}

}