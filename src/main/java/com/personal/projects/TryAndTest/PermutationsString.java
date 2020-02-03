package com.personal.projects.TryAndTest;

import java.util.ArrayList;

public class PermutationsString {

	public static void main(String[] args) {
		ArrayList<String> permutedWords = new ArrayList<String>();
		permutation(permutedWords, "", "bug");

	}

	private static void permutation(ArrayList<String> permutedWords, String prefix, String word) {
		if (word.isEmpty()) {
			permutedWords.add(prefix);
//			System.out.println(currentPermutation + word);

		}
		for (int i = 0; i < word.length(); i++) {
			System.out.println(prefix);
			System.out.println(word.charAt(i));
			System.out.println(" word.substring(0, i) :: " + word.substring(0, i));
			System.out.println(word.substring(i + 1, word.length()));

			//each iteration keep calling permutation method until the remaining word become empty, 
			//and than move to the next letter when increases
			
			// e.g flow will be:
			//w
			//
			//oman
			//o
			//
			//man
			//m
			//
			//an
			//Prefix are letters that are already chosen
			//each time word will have remaining letters to choose from
			permutation(permutedWords, prefix + word.charAt(i),
					word.substring(0, i) + word.substring(i + 1, word.length()));
		}
		
		for(String s: permutedWords) {
			System.out.println(s);
		}

	}
}
