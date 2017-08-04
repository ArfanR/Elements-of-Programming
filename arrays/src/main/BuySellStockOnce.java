import java.util.List;

public class BuySellStockOnce {

    /*
       5.6
    */

    public static int buySellStockOnce(List<Integer> prices) {
    	int minPrice = Integer.MAX_VALUE, maxProfit = 0;
        for (Integer price : prices) {
          maxProfit = Math.max(maxProfit, price - minPrice);
          minPrice = Math.min(minPrice, price);
        }
        return maxProfit;
    }
    
    // Variant: length of longest subarray of equal entries
    public static int longestSubarray(List<Integer> entries) {
    	int minPos = 0, maxLength = 1;
    	for (int i = 1; i < entries.size(); i++) {
    		if (entries.get(i) == entries.get(minPos)) {
    			maxLength++;
    		}
    		else {
    			maxLength = 1;
    			minPos = i;
    		}
    	}
    	return maxLength;
    }
   
}