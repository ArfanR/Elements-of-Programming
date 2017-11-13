import java.util.List;

public class SearchSortedCyclic {

    /*
    11.3
    */

    public static int search(List<Integer> A) {
    	int left = 0, right = A.size() - 1;
        while (left < right) {
        	int mid = left + ((right - left) / 2);
        	if (A.get(mid) > A.get(right)) {
        		// Minimum must be in A.subList(mid + 1, right + 1).
        		left = mid + 1;
        	} 
        	else { // A.get(mid) < A.get(right).
        		// Minimum cannot be in A.subList(mid + 1, right + 1) so it must be in
        		// A.sublist(left, mid + 1).
        		right = mid;
        	}
        }
        // Loop ends when left == right.
        return left;
    }
    
    // Variant: search for element in cyclically sorted array
    public static int search2(List<Integer> A, int k) {
    	int left = 0, right = A.size() - 1;
    	while (left <= right) {
    		int mid = left + ((right - left) / 2);
    		if (A.get(mid) == k) {
    			return mid;
    		}
    		// left to mid is sorted
    		else if (A.get(mid) >= A.get(left)) {
    			// search in left to mid
    			if (k >= A.get(left) && k <= A.get(mid)) {
    				right = mid - 1;
    			}
    			// search in right half
    			else {
    				left = mid + 1;
    			}
    		}
    		// mid to right is sorted
    		else {
    			// search in mid to right
    			if (k >= A.get(mid) && k <= A.get(right)) {
    				left = mid + 1;
    			}
    			// search in left half
    			else {
    				right = mid - 1;
    			}
    		}
    	}
    	return -1;
    }
}