package com.personal.projects.TryAndTest;

public class CountIsland {

	public static void main(String[] args) {
		int[][] islandWaterMatrix = { 
				{ 1, 1, 0, 0, 0 }, 
				{ 0, 1, 0, 0, 1 }, 
				{ 1, 0, 0, 1, 1 }, 
				{ 0, 0, 0, 0, 0 },
				{ 1, 0, 1, 0, 1 } };

		countIslands(islandWaterMatrix);

	}

	private static int countIslands(int[][] islandWaterMatrix) {
		int totalIslands = 0;

		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {

				int i = row;
				int j = col;

				while (islandWaterMatrix[i][j] == 1) {
					totalIslands++;
					while (j < 4 && islandWaterMatrix[i][j + 1] == 1) {
						islandWaterMatrix[i][j + 1] = 0;
						
					}
					while (i < 4 && islandWaterMatrix[i + 1][j] == 1) {
						islandWaterMatrix[i + 1][j] = 0;

					}
					while (j < 4 && i < 4 && islandWaterMatrix[i + 1][j + 1] == 1) {
						islandWaterMatrix[i + 1][j + 1] = 0;
						
					}

					while (j > 0 && i < 4 && islandWaterMatrix[i + 1][j - 1] == 1) {
						islandWaterMatrix[i + 1][j - 1] = 0;
						
					}

					while (j < 4 && i > 0 && islandWaterMatrix[i - 1][j + 1] == 1) {
						islandWaterMatrix[i - 1][j + 1] = 0;
						
					}

					while (j > 0 && i > 0 && islandWaterMatrix[i - 1][j - 1] == 1) {
						islandWaterMatrix[i - 1][j - 1] = 0;
						
					}
					while (i > 0 && islandWaterMatrix[i - 1][j] == 1) {
						islandWaterMatrix[i - 1][j] = 0;
						
					}
					while (j > 0  && islandWaterMatrix[i][j - 1] == 1) {
						islandWaterMatrix[i][j - 1] = 0;
						
					}
					break;

				}

			}
		}

		return totalIslands;
	}

}
