package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 23/08/19
 */
public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        /*
nums1 = [1, 3]
nums2 = [2]
-----------
nums1 = [1, 2]
nums2 = [3, 4]

         */

        int[] num1={1,2};
        int[] num2={3,4,5};
        System.out.println(findMedianSortedArrays(num1,num2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] memo=new int[nums1.length+nums2.length];
        int index=0;
        for (int i = 0; i < nums1.length; i++)
            memo[index++]=nums1[i];
        for (int i = 0; i < nums2.length; i++)
            memo[index++]=nums2[i];
        Arrays.sort(memo);
        int len=memo.length;
        double res=0.0;
        if (len%2==0){
            int mid=len/2;
            --mid;
            res=(double) (memo[mid]+memo[mid+1])/2;
            return res;
        }
        else
            res=memo[(memo.length)/2];
        return res;
    }
}
