import java.util.*;

public class BuySellStockTwice {

    /*
    5.7
    */

    public static int buySellStockTwice(List<Integer> prices) {
    	int maxTotalProfit = 0;
        List<Integer> firstBuySellProfits = new ArrayList<>();
        int minPriceSoFar = Integer.MAX_VALUE;
        // Forward phase. For each day, we record maximum profit if we
        // sell on that day.
        for (int i = 0; i < prices.size(); ++i) {
        	minPriceSoFar = Math.min(minPriceSoFar, prices.get(i));
        	maxTotalProfit = Math.max(maxTotalProfit, prices.get(i) - minPriceSoFar);
        	firstBuySellProfits.add(maxTotalProfit);
        }
        // Backward phase. For each day, find the maximum profit if we make
        // the second buy on that day.
        int maxPriceSoFar = Integer.MIN_VALUE;
        for (int i = prices.size() - 1; i > 0; --i) {
        	maxPriceSoFar = Math.max(maxPriceSoFar, prices.get(i));
        	maxTotalProfit = Math.max(maxTotalProfit, maxPriceSoFar - prices.get(i) + firstBuySellProfits.get(i - 1));
        }
        return maxTotalProfit;
    }

}