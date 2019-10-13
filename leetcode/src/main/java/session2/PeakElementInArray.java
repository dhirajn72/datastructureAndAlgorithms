package session2;

/**
 * @author Dhiraj
 * @date 27/08/19
 */
public class PeakElementInArray {
    public int findPeakElement(int[] nums) {
        int res=Integer.MIN_VALUE;
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>res){
                res=nums[i];
                index=i;
            }
        }
        return index;
    }
}
