package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 08/07/19
 */
public class RemoveDuplicatesK {
    public static void main(String[] args) {

        //Given nums = [0,1,2,2,3,0,4,2], val = 2,
        //int[] arr = {0, 1, 2, 2, 3, 0, 4, 2}; // 0,1,3,0,4
        int[] arr= {3,2,2,3};
       // 3
        //System.out.println(arr.length);
        System.out.println(removeElement(arr, 3));

    }

    public static int removeElement(int[] arr, int val) {
        List<Integer> integers = new ArrayList<>();
        for (int i : arr) {
            if (i!=val)
                integers.add(i);
        }
        int index=0;
        arr=new int[integers.size()];
        for (int i:integers)
            arr[index++]=i;
        System.out.println(Arrays.toString(arr));
        return integers.size();
    }
}
