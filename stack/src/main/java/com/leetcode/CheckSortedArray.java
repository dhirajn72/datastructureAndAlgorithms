package com.leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 20/07/19
 */
public class CheckSortedArray {
    public static void main(String[] args) {

        int[] ints= {1,1,2,2,3,4,5,6,7,6,8,9};
        System.out.println(_checkSortedArray(ints));
    }

    private static int _checkSortedArray(int[] arr) {
        int[] arr2= arr.clone();
        Arrays.sort(arr2);
        int i=0;
        int j=arr.length-1;
        boolean flag=true;
        while (i<j){
            if (arr[i]!=arr2[i]){
                System.out.println("Not equals");
                flag=false;
                break;
            }
            i++;
        }
        if (flag)return 1;
        return -1;
    }
}
