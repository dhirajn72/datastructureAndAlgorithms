package dynamicprogramming;

/**
 * @author Dhiraj
 * @date 31/07/19
 */
public class MaxArraySum_DP {
    public static void main(String[] args) {
        System.out.println(_maxArraysSum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    private static int _maxArraysSum(int[] arr) {
        int maxSum=arr[0],sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum=Math.max(sum+arr[i],arr[i]);
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;

    }
}
