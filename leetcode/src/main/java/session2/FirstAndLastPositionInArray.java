package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 27/08/19
 */
public class FirstAndLastPositionInArray {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,8,10},6)));
        System.out.println(Arrays.toString(searchRange(new int[]{2,2},2)));

    }

    /**
     *  @TODO Not compelete!
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] searchRange(int[] nums, int target) {
        if (nums==null||nums.length==0)return null;
        if (nums.length==1 && target==1)return new int[]{0,0};
        int[] arr=new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                arr[0]=i;
                for (int j = i; j < nums.length; j++) {
                    if (nums[j]==target) {
                        int k = j;
                        arr[1] = k-1;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
