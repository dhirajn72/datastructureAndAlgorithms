package session2;

/**
 * @author Dhiraj
 * @date 27/08/19
 */
public class FindMinimuminRotatedSortedArray {

    public int findMin(int[] nums) {
        if (nums==null||nums.length==0)return 0;
        int min=Integer.MIN_VALUE;
        for (int i:nums)
            min=Math.min(min,i);
        return min;
    }
}
