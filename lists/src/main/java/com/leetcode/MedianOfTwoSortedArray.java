package com.leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 07/07/19
 */
public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1};
        int[] arr2 = {2};
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] largeArray = new int[nums1.length + nums2.length];
        int index = 0;
        for (int i : nums1)
            largeArray[index++] = i;
        for (int i : nums2)
            largeArray[index++] = i;
        Arrays.sort(largeArray);
        int mid;
        double median;
        if (largeArray.length % 2 == 0) {
            mid = largeArray.length / 2;
            --mid;
            median=(double)(largeArray[mid]+largeArray[mid+1])/2;
        } else {
            mid = (largeArray.length) / 2 ;
            median=largeArray[mid];
        }
        return median;
    }
}