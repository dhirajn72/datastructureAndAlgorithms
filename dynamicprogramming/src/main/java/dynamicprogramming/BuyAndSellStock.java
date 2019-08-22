package dynamicprogramming;

/**
 * @author Dhiraj
 * @date 26/07/19
 */
public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxStock(arr));
    }

    public static int maxStock(int[] prices){
        if (prices==null|| prices.length==0)
            return 0;
         int minPrice=prices[0];
         int result=0;

        for (int i = 1; i < prices.length; i++) {
            int nextPrice = prices[i];
            int difference = nextPrice - minPrice;
            result = Math.max(result, difference);
            minPrice = Math.min(minPrice, nextPrice);
        }
        return result;
    }
}
