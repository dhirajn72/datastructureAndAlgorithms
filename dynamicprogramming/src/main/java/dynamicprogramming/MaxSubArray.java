package dynamicprogramming;

/**
 * @author Dhiraj
 * @date 31/07/19
 */
public class MaxSubArray {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maximumSubArraySum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int windowSum = 0;
                for (int k = i; k <= j; k++) {
                    windowSum += nums[k];
                }
                maximumSubArraySum = Math.max(maximumSubArraySum, windowSum);
            }
        }
        return maximumSubArraySum;
    }
}
