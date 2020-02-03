package com.personal.projects.TryAndTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BalanceBrackets {
	public static void main(String[] args) {
		areBracketsBalanced("}([[{)[]))]{){}[");
	}
	
	private static void areBracketsBalanced(String inputPattern) {
		char[] inputCharArr = inputPattern.toCharArray();
		List<Character> unbalanced = new ArrayList<Character>();
		//if char is ( { [ add to stack
		Stack<Character> stackOfBrackets = new Stack<Character>();
		for(int i=0; i<inputCharArr.length; i++) {
			if(inputCharArr[i] == '(' || inputCharArr[i] == '{' || inputCharArr[i] == '[' ) {
				stackOfBrackets.add(inputCharArr[i]);
			} 
			
			if(stackOfBrackets.size()>0 && inputCharArr[i] == ')') {
				if(stackOfBrackets.peek() == '(') {
					stackOfBrackets.pop();
				}else {
					unbalanced.add(inputCharArr[i]);	
				}
			}
			
			if(stackOfBrackets.size()>0 && inputCharArr[i] == '}') {
				if(stackOfBrackets.peek() == '{') {
					stackOfBrackets.pop();
				} else {
					unbalanced.add(inputCharArr[i]);	
				}
			}
			
			if(inputCharArr[i] == ']') {
				if(stackOfBrackets.peek() == '[') {
					stackOfBrackets.pop();
				} else {
					unbalanced.add(inputCharArr[i]);	
				}
				
			}
		}
		
		if(stackOfBrackets.size() > 0 || unbalanced.size() > 0) {
			System.out.println("Not balanced");
		} else {
			System.out.println("Balanced");
		}
		
		
		
		//if char is )}] peek respective and pop 
	}
}
