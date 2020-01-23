import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class SingleNumber {

	public static void main(String[] args) {
		
		int[] input = {3,2,4,2,5,4,3};
		findSingleNumber(input);
	}
	
	private static int findSingleNumber(int[] input) {
		
		if(input == null || input.length == 0) {
			return 0;
		}
		HashSet<Integer> set = new HashSet<Integer>();
		HashMap<Integer, Boolean> result = new HashMap<Integer, Boolean>(); 
		for(int i : input) {
			result.put(i, set.add(i));
		}
		
		for(Entry<Integer, Boolean> map : result.entrySet()) {
			if(map.getValue()) {
				return map.getKey();
			}
		}
		return 0;
	}
	
}
