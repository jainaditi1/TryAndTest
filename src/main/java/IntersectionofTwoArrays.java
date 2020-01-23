import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionofTwoArrays {
	public static void main(String args[]) {
		int[] input_1 = { 1, 4, 2, 3, 3 };
		int[] input_2 = { 3, 4, 3, 11 };
		intersectionOfTwoArrays(input_1, input_2);
	}

	public static int[] intersectionOfTwoArrays(int[] input_1, int[] input_2) {
		int[] resultArray = {};
		if(input_1 == null || input_2 == null || input_1.length ==0 || input_2.length ==0 ) {
			return resultArray;
		}
		
		ArrayList<Integer> result = new ArrayList<Integer>();

		HashSet<Integer> firstInputSet = new HashSet<Integer>();
		for(int i : input_1) {
			firstInputSet.add(i);
		}
		
		for(int i : input_2) {
			if(firstInputSet.contains(i)) {
				result.add(i);
			}
		}
		resultArray = new int[result.size()];
        int start = 0;
		for(int i : result) {
			resultArray[start] = i;
            start++;
		}
		
		return resultArray;
		
	}

}
