package com.personal.projects.TryAndTest;

public class FirstBadVersion {

	   public int firstBadVersion(int n) {
	        // find the lower bound...
	        int low = 1;
	        
	        //length of array or maximum number since array is incrementing by 1
	        int high = n;

	        while(low < high) {
	            int mid = low + (high - low) / 2;
	            // we know it could be the first bad version, or could be in the middle
	            if(isBadVersion(mid)) {
	                high = mid;
	            } else {
	                low = mid + 1;
	            }
	        }

	        return low;
	    }
	
	   
	   private boolean isBadVersion(int i) {
		   
		   return true;
		   
	   }
}
