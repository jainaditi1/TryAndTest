package com.personal.projects.TryAndTest.DFS;

public class DFS_CountIsland {

	public static void main(String[] args) {
		
		
		
		
		
		
		int[][] islandWaterMatrix = { 
				{ 1, 1, 0, 0, 0 }, 
				{ 0, 1, 0, 0, 1 }, 
				{ 1, 0, 0, 1, 1 }, 
				{ 0, 0, 0, 0, 0 },
				{ 1, 0, 1, 0, 1 } };


		numberOfIslands(islandWaterMatrix);
		
		
		
//		countIslands(islandWaterMatrix);

	}

	
	
	//******************************************
	//****************** DFS ********************
	//******************************************
	
	public static int numberOfIslands(int[][] islandWaterMatrix) {
		
		if(islandWaterMatrix == null || islandWaterMatrix.length == 0) {
			return 0;
		}
		int numberOfIslands = 0;
		
		//i = row, j = col
		for(int i = 0; i<islandWaterMatrix.length; i++) {
			for(int j = 0; j<islandWaterMatrix[i].length; j++) {
				if(islandWaterMatrix[i][j] == 0) {
					numberOfIslands+=dfs(islandWaterMatrix, i, j);
				}
			}
		}
		
		return numberOfIslands;
	}
	
	private static int dfs(int[][] islandWaterMatrix, int i, int j) {

		if(i < 0 || j < 0 || i >= islandWaterMatrix.length || j >= islandWaterMatrix[i].length || islandWaterMatrix[i][j] == 0) {
			return 0;
		}
		islandWaterMatrix[i][j] = 0;
		dfs(islandWaterMatrix, i+1, j);
		dfs(islandWaterMatrix, i-1, j);
		dfs(islandWaterMatrix, i, j+1);
		dfs(islandWaterMatrix, i, j-1);
		
		return 1;
	}
	
	
	//******************************************
	//****************** end ********************
	//******************************************
	

	
	
	
	//************** TRY 1
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
