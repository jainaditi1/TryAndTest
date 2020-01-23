package com.personal.projects.TryAndTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class LeadershipBoard_Alice {
	public static void main(String[] args) {
//		String[] input = {"abcde", "basdn", "sdaklfj", "basdn", "basdn", "ab", "abcde", "basdn", "basdn", "ab", "abcde"};
//		String[] queries = {"basdn", "ab", "xyb"};
//		findOccurrencesFromInput(input, queries);

		int[] input = { 100, 100, 50, 40, 40, 20, 10 };
		int[] scores = { 5, 25, 50, 120};

		findRankOnLeadershipBoard(input, scores);
	}

	private static int[] findRankOnLeadershipBoard(int[] otherLeadersScores, int[] aliceScores) {

		Set<Integer> othersScores = Arrays.stream(otherLeadersScores).boxed().collect(Collectors.toSet());

		TreeSet<Integer> scoring = new TreeSet<Integer>(othersScores);
		TreeSet<Integer> descendingScores = (TreeSet<Integer>) scoring.descendingSet();

		List<Integer> descendingScoresList = new ArrayList<Integer>(descendingScores);
		
		int[] finalRanking = new int[aliceScores.length];
		for (int i = 0; i < aliceScores.length; i++) {

			for (int j = 1; j < descendingScoresList.size(); j++) {

				if ((aliceScores[i] > descendingScoresList.get(0))) {
					finalRanking[i] =  1;
				}
				if ((aliceScores[i] < descendingScoresList.get(descendingScoresList.size()-1))) {
					finalRanking[i] =  descendingScoresList.size() + 1;
				}
				
				if ((aliceScores[i] == descendingScoresList.get(j - 1))) {
					finalRanking[i] = descendingScoresList.indexOf(descendingScoresList.get(j - 1)) + 1;
				}
				if ((aliceScores[i] == descendingScoresList.get(j))) {
					finalRanking[i] = descendingScoresList.indexOf(descendingScoresList.get(j)) + 1;
				}

				
				
				if ((aliceScores[i] < descendingScoresList.get(j - 1))
						&& (aliceScores[i] > descendingScoresList.get(j))) {
					finalRanking[i] = descendingScoresList.indexOf(descendingScoresList.get(j)) + 1;
				}
			}

		}
		
		for(int i : finalRanking) {
			System.out.println(i);
		}
		return finalRanking;

	}

	private static void findOccurrencesFromInput(String[] input, String[] queries) {

		HashMap<String, Integer> counter = new HashMap<String, Integer>();

		for (int i = 0; i < queries.length; i++) {
			int tempCounter = 0;
			for (int j = 0; j < input.length; j++) {
				if (input[j].equals(queries[i])) {
					tempCounter++;
				}
			}
			counter.put(queries[i], tempCounter);
		}

		for (Map.Entry mapElement : counter.entrySet()) {
			System.out.println(mapElement.getKey() + "  occurred " + mapElement.getValue() + " times.");
		}
	}
}
