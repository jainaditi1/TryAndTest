package com.personal.projects.TryAndTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackTest {

	private static Stack<String> stack ;
	private static List<String> reversedElements;

	public static void main(String[] args) {
		stack = new Stack<String>();
		reversedElements = new ArrayList<String>();

		pushElement("first");
		peekElement();
		popElement();
		popElement();
		popElement();
		System.out.println(reversedElements);
	}
	
	public static void pushElement(String element) {
		stack.add(element);
		stack.add(0, "addedAtIndex");
		stack.addElement("addElement");
		System.out.println(stack);
	}
	
	public static void popElement() {
		String popped = stack.pop();
		reversedElements.add(popped);
		System.out.println(popped);
	}
	
	public static void peekElement() {
		stack.peek();
		System.out.println(stack);
	}
	
	
	
}
