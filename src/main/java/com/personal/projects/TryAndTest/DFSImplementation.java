package com.personal.projects.TryAndTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



class DFSNode {

	private int value;
	private DFSNode parent;
	private List<DFSNode> children;
	private boolean isVisited;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public DFSNode getParent() {
		return parent;
	}

	public void setParent(DFSNode parent) {
		this.parent = parent;
	}

	public List<DFSNode> getChildren() {
		return children;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public DFSNode(int value) {
		this.value = value;
		this.children = new ArrayList<DFSNode>();
	}

	public DFSNode(int value, DFSNode parent, List<DFSNode> children) {
		this.value = value;
		this.parent = parent;
		this.children = children;
	}

	public void addChild(DFSNode child) {
		children.add(child);
	}

}

class DFS {

	private Stack<DFSNode> stack;

	public DFS() {
		this.stack = new Stack<DFSNode>();
	}

	public void depthFirstSearch(DFSNode head) {

		stack.add(head);
		head.setVisited(true);
		while (!stack.isEmpty()) {
			DFSNode current = stack.pop();
			System.out.println(current.getValue() + " ");

			for (DFSNode child : current.getChildren()) {
				if (!child.isVisited()) {
					child.setVisited(true);
					child.setParent(current);
					stack.push(child);
				}
			}
		}

	}
}

public class DFSImplementation {

	public static void main(String[] args) {
		DFSNode node1 = new DFSNode(1);
		DFSNode node2 = new DFSNode(2);
		DFSNode node3 = new DFSNode(3);
		DFSNode node4 = new DFSNode(4);
		DFSNode node5 = new DFSNode(5);
		DFSNode node6 = new DFSNode(6);
		DFSNode node7 = new DFSNode(7);

		node1.addChild(node4);
		node1.addChild(node6);
		node2.addChild(node7);
		node3.addChild(node4);
		node2.addChild(node5);
		node5.addChild(node6);
		node6.addChild(node1);
		node7.addChild(node3);

		DFS dfs = new DFS();
		dfs.depthFirstSearch(node2);
	}
}
