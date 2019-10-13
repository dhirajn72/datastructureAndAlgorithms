package session2;

/**
 * @author Dhiraj
 * @date 02/09/19
 */
public class BestTimeToBuySellStocks {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }

    public static int maxProfit(int[] prices) {
        if (prices==null||prices.length==0)return 0;
        int max=Integer.MIN_VALUE;
        /*for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                max=Math.max(max,prices[j]-prices[i]);
            }
        }
        return max>0?max:0;*/

        int maxProfit=0;
        int minPrice=Integer.MAX_VALUE;
        for (int i = 0; i <prices.length ; i++) {
            minPrice=Math.min(minPrice,prices[i]);
            maxProfit=Math.max(maxProfit,prices[i]-minPrice);
        }
        return maxProfit;
    }
}
