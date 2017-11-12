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
    	return 0;
    }
}