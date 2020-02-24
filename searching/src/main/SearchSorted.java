import java.util.List;

public class SearchSorted {

    /*
    11.1
    */

    public static int searchFirstOfK(List<Integer> list, int k) {
    	int left = 0, right = list.size() - 1, result = -1;
    	while (left <= right) {
    		int mid = left + ( (right - left) / 2);
    		if (list.get(mid) == k) {
    			result = mid;
    			right = mid - 1;
    		}
    		else if (list.get(mid) > k) {
    			right = mid - 1;
    		}
    		else {
    			left = mid + 1;
    		}
    	}
    	return result;
    }
    
    // Variant: find index of first element greater than key
    public static int searchFirstOfGreaterK(List<Integer> list, int k) {
    	int left = 0, right = list.size() - 1, result = -1;
    	while (left <= right) {
    		int mid = left + ( (right - left) / 2);
    		if (list.get(mid) <= k) {
    			left = mid + 1;
    		}
    		else if (list.get(mid) > k) {
    			result = mid;
    			right = mid - 1;
    		}
    	}
    	return result;
    }
    
    // Variant: find local minimum
    public static int searchLocalMin(List<Integer> list, int k) {
    	int left = 0, right = list.size()-1;
    	while (left <= right) {
    		int mid = left + ( (right - left) / 2);
    		if (list.get(mid) <= list.get(mid-1) && list.get(mid) <= list.get(mid+1)) {
    			return mid;
    		}
    		else if (list.get(mid) > list.get(mid-1)) {
    			right = mid - 1;
    		}
    		else {
    			left = mid + 1;
    		}
    	}
    	return -1;
    }
    
    
    
}