package session3;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 18/02/20
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] arr={0,1,2,2,3,0,4,2}; //{3,2,2,3};

        System.out.println(removeElement(arr,2));
        System.out.println(Arrays.toString(arr));

    }

    public static int removeElement(int[] nums, int val) {
        if (nums==null)
            return 0;
        int i=0,j=0;
        int length=0;
        int n=nums.length-1;
        while (i<n){
            if (nums[i]==val){
                j=i+1;
                while (j<n){
                    nums[j-1]=nums[j];
                    j++;
                }
                if (nums[i]==val){}
                else {
                    i++;
                    length++;
                    n--;
                }
            }
            else {
                i++;
                length++;

            }
        }
        return length;
    }
}
