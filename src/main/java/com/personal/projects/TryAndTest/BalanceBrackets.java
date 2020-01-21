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
		Stack<Character> brackets = new Stack<Character>();
		for(int i=0; i<inputCharArr.length; i++) {
			if(inputCharArr[i] == '(' || inputCharArr[i] == '{' || inputCharArr[i] == '[' ) {
				brackets.add(inputCharArr[i]);
			} 
			
			if(brackets.size()>0 && inputCharArr[i] == ')') {
				if(brackets.peek() == '(') {
					brackets.pop();
				}else {
					unbalanced.add(inputCharArr[i]);	
				}
			}
			
			if(brackets.size()>0 && inputCharArr[i] == '}') {
				if(brackets.peek() == '{') {
					brackets.pop();
				} else {
					unbalanced.add(inputCharArr[i]);	
				}
			}
			
			if(inputCharArr[i] == ']') {
				if(brackets.peek() == '[') {
					brackets.pop();
				} else {
					unbalanced.add(inputCharArr[i]);	
				}
				
			}
		}
		
		if(brackets.size() > 0 || unbalanced.size() > 0) {
			System.out.println("Not balanced");
		} else {
			System.out.println("Balanced");
		}
		
		
		
		//if char is )}] peek respective and pop 
	}
}
