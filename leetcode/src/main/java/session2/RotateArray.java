package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 07/09/19
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        rotate(arr,8);
        System.out.println(Arrays.toString(arr));

    }

    public static void rotate(int[] nums, int k) {
        if (nums==null)return;
        k=k%nums.length;
        while (k-->0){
            int last=nums[nums.length-1];
            for (int i = nums.length-1; i >0 ; i--)
                nums[i]=nums[i-1];
            nums[0]=last;
        }
    }
}
