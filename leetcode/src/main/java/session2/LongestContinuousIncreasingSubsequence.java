package session2;

/**
 * @author Dhiraj
 * @date 31/08/19
 */
public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
        //System.out.println(findLengthOfLCIS(new int[]{1,3,5,4,7,1,2,3,4,5}));
        System.out.println(findLengthOfLCIS(new int[]{2,1,3}));
    }

    public static int findLengthOfLCIS(int[] nums) {
        int max=Integer.MIN_VALUE;
        int index=0;
        int count=1;
        for (int i = index; i < nums.length-1; ) {
            if (nums[i]<nums[i+1]) {
                count++;
            }
            else{
                max=Math.max(max,count);
                count=1;
            }
            i=++index;
        }
        return Math.max(max,count);
    }
}
