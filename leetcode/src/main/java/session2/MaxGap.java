package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 03/09/19
 */
public class MaxGap {

    /**
     *
     Success
     Details
     Runtime: 5 ms, faster than 33.95% of Java online submissions for Maximum Gap.
     Memory Usage: 37.9 MB, less than 68.97% of Java online submissions for Maximum Gap.
     * @param nums
     * @return
     */
    public int maximumGap(int[] nums) {
        if (nums==null||nums.length==0)return 0;
        int max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-1 ; i++) {
            max=Math.max(max,nums[i+1]-nums[i]);
        }
        return max;
    }
}
