package dynamicprogramming;

/**
 * @author Dhiraj
 * @date 26/07/19
 */
public class BuyAndSellStocks {

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        //int[] arr={7, 6, 4, 3, 1};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1)
            return 0;
        int minPrice = prices[0];
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            int nextPrice = prices[i];
            int difference = nextPrice - minPrice;
            result = Math.max(result, difference);
            minPrice = Math.min(minPrice, nextPrice);
        }
        return result;
    }
}
