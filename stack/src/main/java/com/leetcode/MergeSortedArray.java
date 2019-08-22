package com.leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 19/07/19
 */
public class MergeSortedArray {
    public static void main(String[] args) {

        int[] nums1={1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n=3;


        /*int[] nums1={0};
        int m=0;
        int[] nums2= {1};
        int n=1;*/

        merge(nums1,m,nums2,n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ints= new int[m+n];
        int index=0;
        for (int i=0;i<m;i++){
            ints[i]=nums1[i];
            index=i;
            index++;
        }
        for (int i=0;i<n;i++){
            ints[index++]=nums2[i];
        }
        Arrays.sort(ints);
        for (int i=0;i<ints.length;i++)
            nums1[i]=ints[i];
        System.out.println(Arrays.toString(nums1));
    }
}
