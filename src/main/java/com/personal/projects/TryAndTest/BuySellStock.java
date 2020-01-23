package com.personal.projects.TryAndTest;

public class BuySellStock {
	public static void main(String[] args) {
		int[] input = {3,6,2,4,6,9};
		buySellStockMaxProfit(input);
	}
	
	private static int buySellStockMaxProfit(int[] stockPrices) {
		int lowestPrice = Integer.MAX_VALUE;
		int sellingPrice = 0;
		
		for(int i = 0; i<stockPrices.length; i++) {
			if(stockPrices[i] < lowestPrice) {
				lowestPrice = stockPrices[i];
			} else {
				sellingPrice = Math.max(sellingPrice, stockPrices[i] - lowestPrice);
			}
		}
		
		
		return sellingPrice;
	}
}
