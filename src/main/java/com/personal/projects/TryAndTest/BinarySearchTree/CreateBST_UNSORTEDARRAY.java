package com.personal.projects.TryAndTest.BinarySearchTree;

//class 1

class TreeNode {
	TreeNode left;
	TreeNode right;
	int data;
}

// class 2
class BinarySearchTree {

	public TreeNode insert(TreeNode node, int value) {
		if (node == null) {
			return createNewNode(value);
		}

		// RECURSIVE CALL
		// LEFT RIGHT CHECK
		if (value < node.data) {
			node.left = insert(node.left, value);
		} else if ((value > node.data)) {
			node.right = insert(node.right, value);
		}

		return node;
	}

	public TreeNode createNewNode(int k) {
		TreeNode a = new TreeNode();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}
}

//class 3
public class CreateBST_UNSORTEDARRAY {

	public static void main(String[] args) {
		BinarySearchTree a = new BinarySearchTree();
		TreeNode root = null;

		root = a.insert(root, 8);
		root = a.insert(root, 3);
		root = a.insert(root, 6);
		root = a.insert(root, 10);
		root = a.insert(root, 4);
		root = a.insert(root, 7);
		root = a.insert(root, 1);
		root = a.insert(root, 14);
		root = a.insert(root, 13);

	}

}

////////////////////////////////

//***** GET MAX DEPTH  ***

///////// GET MAX DEPTH ///////////	
// Get the max depth of left subtree  (recursively)
//Get the max depth of RIGHT subtree  (recursively)
//COMPARE BOTH depths
//add 1 to it for the current node
//

////////////////////////////////

//MAIN METHOD:
//BinaryTree tree = new BinaryTree(); 
//
//tree.root = new Node(1); 
//tree.root.left = new Node(2); 
//tree.root.right = new Node(3); 
//tree.root.left.left = new Node(4); 
//tree.root.left.right = new Node(5);
class BinaryTree {
	
	Node root; 

	int maxDepth(Node node) {
		if (node == null)
			return 0;
		else {
			/* compute the depth of each subtree */
			int leftDepth = maxDepth(node.left);
			int rightNode = maxDepth(node.right);

			/* use the larger one */
			if (leftDepth > rightNode)
				return (leftDepth + 1);
			else
				return (rightNode + 1);
		}
	}
}

class Node  
{ 
    int data; 
    Node left, right; 
   
    Node(int item)  
    { 
        data = item; 
        left = right = null; 
    } 
} 


////////////////////////////////
///////// GET MAXIMUM VALUE ///////////	
// bottom right most element will be greatest
////////////////////////////////
class Get_MAX_Element {
	public int getMax(TreeNode node) {
		if (node == null) {
			System.out.println("Tree is EMpty");
			return -1;
		}

		while (node.right != null) {
			node = node.right;
		}

		return node.data;
	}
}

////////////////////////////////
///////// Is Element Present ///////////	
////////////////////////////////

class IsElementPresent {

	public boolean ifNodePresent(TreeNode node, int val) {
		if (node == null) {
			return false;
		}

		boolean isPresent = false;

		while (node != null) {
			if (val < node.data) {
				node = node.left;
			} else if (val > node.data) {
				node = node.right;
			} else {
				isPresent = true;
				break;
			}
		}

		return isPresent;
	}
}

////////////////////////////////
///////// DELETE NODE///////////	
////////////////////////////////

class DELETENODE {

	public TreeNode delete(TreeNode node, int val) {
		if (node == null) {
			return node;
		}

		if (val < node.data) {
// RECURSIVELY call
			node.left = delete(node.left, val);
		} else if (val > node.data) {
// RECURSIVELY call
			node.right = delete(node.right, val);
		} else {

//if EITHER of left or right or both node are null
			if (node.left == null || node.right == null) {

//Ternary operator : assign to temp whichever (left or right) is NOT null
				TreeNode temp = node.left != null ? node.left : node.right;

				if (temp == null) {
//if both are null
					return null;
				} else {
//if any ONE node is NOT NULL
					return temp;
				}
			} else {

//IF both are NOT null
				TreeNode successor = getSuccessor(node);
				node.data = successor.data;

//successor is the left MOST node FROM the right side

//DELTE THE SUCCESSOR NODE
				node.right = delete(node.right, successor.data);
				return node;
			}
		}

		return node;
	}

	public TreeNode getSuccessor(TreeNode node) {
		if (node == null) {
			return null;
		}

		TreeNode temp = node.right;

		while (temp.left != null) {
			temp = temp.left;
		}

		return temp;
	}

/////////////END////////////
///////// DELETE NODE///////////	
////////////////////////////////

}
