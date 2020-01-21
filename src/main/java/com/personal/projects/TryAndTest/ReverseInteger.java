package com.personal.projects.TryAndTest;

public class ReverseInteger {

	public static void main(String[] args) {
		int inputInt = 45327;
		reverseInteger(inputInt);
	}
	
	private static int reverseInteger(int x) {
		
		  int result = 0;

		    while (x != 0)
		    {
		        int tail = x % 10;
		        int newResult = result * 10 + tail;
		        if ((newResult - tail) / 10 != result)
		        { return 0; }
		        result = newResult;
		        x = x / 10;
		    }

		    return result;
	}
	
}
