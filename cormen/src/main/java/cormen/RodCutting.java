package cormen;

/**
 * @author Dhiraj
 * @date 09/07/19
 */
public class RodCutting {
    public static int rodCut(int[] price, int n) {
        if (n == 0) {
            return 0;
        }
        int maxValue = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int a = rodCut(price, n - i);
            int cost = price[i - 1] + a;
            if (cost == n)
                System.out.println(a);
            if (cost > maxValue) {
                maxValue = cost;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        // length[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};

        int n = 4;
        System.out.println("Profit is " + rodCut(price, n));
    }
}