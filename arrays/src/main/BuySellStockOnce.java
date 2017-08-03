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
}