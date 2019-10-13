package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 31/08/19
 */
public class LongestIncreasingSubSequence_1 {
    public static void main(String[] args) {

    }

    public static int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j]<nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    max=Math.max(max,dp[i]);
                }
            }
        }
        for(int i:dp)
            max=Math.max(max,i);
        return max;
    }
}
