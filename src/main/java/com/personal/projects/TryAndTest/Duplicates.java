package com.personal.projects.TryAndTest;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class Duplicates {
	public static void main(String[] args) {

		findDuplicates();
	}


	private static void findDuplicates() {
		String[] strArr = { "adam", "jake", "adam", "lucy", "sakina", "bob" };

		for (int i = 0; i < strArr.length; i++) {

			for (int j = i + 1; j < strArr.length; j++) {
				if (strArr[i].equals(strArr[j])) {
					System.out.println("found match : " + strArr[i]);
				}
			}
		}

		// ***** WAY #2************************************
		// using SET : make separate list of whats duplicated
		// ************************************************
		Set<String> tempSet = new HashSet<String>();
		Set<String> resultSet = new HashSet<String>();

		for (String s : strArr) {
			if (!tempSet.add(s)) {
				resultSet.add(s);
			}
		}
		System.out.println(resultSet);

	}

}
