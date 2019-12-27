package session3;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 10/11/19
 */
public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] num1={1,2};
        int[] num2={3,4};
        System.out.println(findMedianSortedArrays(num1,num2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int i=0;
        for (int j = 0; j < nums1.length; j++) {
            arr[i++]=nums1[j];
        }
        for (int j = 0; j < nums2.length; j++) {
            arr[i++]=nums2[j];
        }
        Arrays.sort(arr);
        int mid=arr.length/2;
        if (arr.length%2==0){
            double res=(((double) arr[mid])+((double) arr[mid-1]))/2;
            return res;
        }
        else {
            return arr[mid];
        }
    }
}
