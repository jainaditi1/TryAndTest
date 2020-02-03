package com.personal.projects.TryAndTest.BinarySearchTree;

//	// A binary tree node 
	class BSTNode { 
	      
	    int data; 
	    BSTNode left, right; 
	      
	    BSTNode(int d) { 
	        data = d; 
	        left = right = null; 
	    } 
	} 
	  
	public class Create_BST_SORTEDARRAY { 
	      
	    static BSTNode root; 
	  
	    /* A function that constructs Balanced Binary Search Tree  
	     from a sorted array */
	    BSTNode sortedArrayToBST(int arr[], int start, int end) { 
	  
	        /* Base Case */
	        if (start > end) { 
	            return null; 
	        } 
	  
	        /* Get the middle element and make it root */
	        int mid = (start + end) / 2; 
	        BSTNode node = new BSTNode(arr[mid]); 
	  
	        /* Recursively construct the left subtree and make it 
	         left child of root */
	        node.left = sortedArrayToBST(arr, start, mid - 1); 
	  
	        /* Recursively construct the right subtree and make it 
	         right child of root */
	        node.right = sortedArrayToBST(arr, mid + 1, end); 
	          
	        return node; 
	    } 
	  
	    
	    /* A utility function to print preorder traversal of BST */
	    void preOrder(BSTNode node) { 
	        if (node == null) { 
	            return; 
	        } 
	        System.out.print(node.data + " "); 
	        preOrder(node.left); 
	        preOrder(node.right); 
	    } 
	    
	    public static void main(String[] args) { 
	    	Create_BST_SORTEDARRAY tree = new Create_BST_SORTEDARRAY(); 
	        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7}; 
	        int n = arr.length; 
	        root = tree.sortedArrayToBST(arr, 0, n - 1); 
	        
	        
	        //TRAVERSE - PREORDER BST
	        
	        System.out.println("Preorder traversal of constructed BST"); 
	        tree.preOrder(root); 
	    } 
	}
