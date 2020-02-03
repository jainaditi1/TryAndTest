package com.personal.projects.TryAndTest.BinarySearchTree;

public class BSTSymmetry {

    public boolean isSymmetric(TreeNode_SYmmetry root) {
		// if root is null, then tree will definitely be symmetric
        if (root == null) return true;        
		
		// use helper function to visit left and right node
        return helper(root.leftChild, root.rightChild);
    }
    
    private boolean helper(TreeNode_SYmmetry left, TreeNode_SYmmetry right){
		// using false as you traverse, if it's not false, it continues traversing
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.value != right.value) return false;
		
		// as we're told to verify its symmetry, we compare left node with right node
        return helper(left.leftChild, right.rightChild) && helper(left.rightChild, right.leftChild);
    }
	
}

class TreeNode_SYmmetry {
	int value;
	TreeNode_SYmmetry leftChild;
	TreeNode_SYmmetry rightChild;

	public TreeNode_SYmmetry(int value) {
		super();
		this.value = value;
	}

}
