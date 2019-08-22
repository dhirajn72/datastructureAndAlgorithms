package com.leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 28/07/19
 */
public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {
        //int[] arr = {2, 6, 4, 8, 10, 9, 15};
       // int[] arr = {2, 4, 8, 7, 10, 9, 15}; // 2,6
        //    arr = {2, 4, 7, 8, 9, 10, 15}; // 2,6

        int[] arr = {1,2,3,3,3};




        System.out.println(findUnsortedSubarray(arr));
    }
    public static int findUnsortedSubarray(int[] arr) {
        if (arr==null||arr.length==0)return 0;
        if (arr.length==1)return 1;
        int i=0,j=arr.length-1;
        int[] arr2=arr.clone();
        Arrays.sort(arr2);
        if (Arrays.equals(arr,arr2))return 0;
        while (i<j){
            if (arr[i]==arr2[i] && arr[j]==arr2[j]){
                i++;
                j--;
            }
            else if (arr[i]==arr2[i])i++;
            else if (arr[j]==arr2[j])j--;
            else {
                break;
            }
        }
        int count=1;
        while (i!=j){
            count++;
            i++;
        }
        return count;
    }


}