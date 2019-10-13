package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 22/09/19
 */
public class LengthOfLIS {

    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
    public static int lengthOfLIS(int[] nums) {
        if (nums==null||nums.length==0)return 0;
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <i ; j++) {
                if (nums[i]>nums[j]){
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
