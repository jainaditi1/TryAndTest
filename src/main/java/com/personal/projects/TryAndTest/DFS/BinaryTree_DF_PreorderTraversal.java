package com.personal.projects.TryAndTest.DFS;

public class BinaryTree_DF_PreorderTraversal {

	public static void main(String args[]) {

//      BinaryTree tree = new BinaryTree(); 
//		tree.root = new Node(4); 
//      tree.root.left = new Node(2); 
//      tree.root.right = new Node(5); 
//      tree.root.left.left = new Node(1); 
//      tree.root.left.right = new Node(3);
		
		/**
		 * 
		 * Steps on PreOrder traversal algorithm v
		 * 1- visit the node 
		 * 2- visit the left subtree
		 * 3- visit the right subtree
		 */
		// head/root node
		Node node = new Node(4);
		preorderTraversal_DF(node);

		

	}

	private static void preorderTraversal_DF(Node node) {
		if (node == null) {
			return;
		}
		System.out.printf("%s ", node.data);
		preorderTraversal_DF(node.left);
		preorderTraversal_DF(node.right);
	}

}

class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
}


 class BinaryTree 
{ 
    // Root of the Binary Tree 
    Node root; 
  
    // To keep tract of previous node in Inorder Traversal 
    Node prev; 
  
    boolean isBST()  { 
        prev = null; 
        return isBST(root); 
    } 
  
    /* Returns true if given search tree is binary 
       search tree (efficient version) */
    boolean isBST(Node node) 
    { 
        // traverse the tree in inorder fashion and 
        // keep a track of previous node 
        if (node != null) 
        { 
            if (!isBST(node.left)) 
                return false; 
  
            // allows only distinct values node 
            if (prev != null && node.data <= prev.data ) 
                return false; 
            prev = node; 
            return isBST(node.right); 
        } 
        return true; 
    } 
}