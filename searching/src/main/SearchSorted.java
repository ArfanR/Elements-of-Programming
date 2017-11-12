import java.util.List;

public class SearchSorted {

    /*
    11.1
    */

    public static int search(List<Integer> list, int k) {
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
    
    // Variant: find first element greater than key
    public static int search2(List<Integer> list, int k) {
    	int left = 0, right = list.size() - 1, result = -1;
    	while (left <= right) {
    		int mid = left + ( (right - left) / 2);
    		if (list.get(mid) == k) {
    			result = mid;
    			left = mid + 1;
    		}
    		else if (list.get(mid) > k) {
    			right = mid - 1;
    		}
    		else {
    			left = mid + 1;
    		}
    	}
    	return result+1 > list.size()-1 ? -1 : result+1;
    }
    
    
}