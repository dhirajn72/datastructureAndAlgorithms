package session2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 02/09/19
 */
public class SlidingWindowMaximum {

    public static void main(String[] args) {
        /*

        nums = [1,3,-1,-3,5,3,6,7], and k = 3
Output: [3,3,5,5,6,7]
         */
        System.out.println(Arrays.toString( maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3)));;

    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums==null||nums.length==0)return nums;
        List<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <= nums.length-k; i++) {
            int e=nums[i];
            for (int j = 0; j < k; j++) {
                if (nums[i+j]>e)
                    e=nums[i+j];
            }
            list.add(e);
        }
        int[] res=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i]=list.get(i);
        }
        return res;
    }
}
