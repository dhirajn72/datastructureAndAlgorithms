package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 08/09/19
 */

/*

Success
Details
Runtime: 4 ms, faster than 94.55% of Java online submissions for Longest Consecutive Sequence.
Memory Usage: 36.5 MB, less than 100.00% of Java online submissions for Longest Consecutive Sequence.*/
public class LongestConsecutiveSequense {
    public static void main(String[] args) {
        //System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2,300,400,500,600}));
        System.out.println(longestConsecutive(new int[]{-2,-3,-3,7,-3,0,5,0,-8,-4,-1,2}));
        //System.out.println(longestConsecutive(new int[]{9,1,4,7,3,-1,0,5,8,-1,6}));

    }
    public static int longestConsecutive(int[] nums) {
        if (nums==null||nums.length==0)return 0;
        int[] arrCopy= Arrays.copyOf(nums,nums.length);
        Arrays.sort(arrCopy);
        int max=Integer.MIN_VALUE;
        int count=1;
        for (int i = 1; i < arrCopy.length; i++) {
            if (arrCopy[i]!=arrCopy[i-1]){
                if (arrCopy[i]==arrCopy[i-1]+1){
                    count++;
                }
                else {
                    max=Math.max(max,count);
                    count=1;
                }
            }
        }
        return Math.max(max,count);
    }
}
