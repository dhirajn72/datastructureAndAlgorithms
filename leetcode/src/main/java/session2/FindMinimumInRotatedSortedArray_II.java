package session2;

/**
 * @author Dhiraj
 * @date 27/08/19
 */
public class FindMinimumInRotatedSortedArray_II {
    public int findMin(int[] nums) {
        int res=Integer.MAX_VALUE;
        for (int i:nums)
            res=Math.min(res,i);
        return res;
    }
}
