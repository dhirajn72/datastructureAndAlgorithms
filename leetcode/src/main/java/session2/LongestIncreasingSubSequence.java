package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 26/08/19
 */
public class LongestIncreasingSubSequence {
    public static void main(String[] args) {
        int[] arr = {1,3,6,7,9,4,10,5,6};//{2,9,8,4,6,7,11,10};// {10, 5, 3,11, 4,12,15};//{10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(arr));
    }

    public static int lengthOfLIS(int[] nums) {
        if (nums==null||nums.length==0)return 0;
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for (int i:dp)
            max=Math.max(max,i);
        return max;
    }
}
