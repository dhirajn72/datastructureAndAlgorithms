package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 01/09/19
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println( climbStairs(2));
    }


    public static int climbStairs(int n) {

        if (n==0)return 0;
        if (n==1)return 1;
        int[] dp=new int[n];
        for (int i = 2; i < n; i++) {
            dp[i]=Math.max(dp[i]-1,dp[i]-2);
        }
        System.out.println(Arrays.toString(dp));
        return 0;
    }
}
