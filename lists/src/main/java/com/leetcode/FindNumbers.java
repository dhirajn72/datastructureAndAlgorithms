package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 07/07/19
 */
public class FindNumbers {
    public static void main(String[] args) {
        int[] arr={3,5,4,1,6,5,2,7,6,8,4,5,2,3,};
        System.out.println(Arrays.toString(_findNumbers(arr,17)));
    }
    private static int[] _findNumbers(int[] arr, int target) {
        int sum=0;
        int[] result=new int[arr.length];
        List<Integer> integers= new ArrayList<>();
        boolean flag=false;
        for (int i = 0; i < arr.length-1; i++) {
            sum=arr[i];
            integers.add(Integer.valueOf(sum));
            if (sum==target){
                break;
            }
            for (int j = i+1; j <arr.length ; j++) {
                sum+=arr[j];
                integers.add(Integer.valueOf(arr[j]));
                if (sum==target){
                    flag=true;
                    System.out.println(integers);
                    break;
                }
                if (sum>target){
                    sum-=arr[j];
                    integers.remove(Integer.valueOf(arr[j]));
                }
            }
            if (flag)break;
            sum=0;
            integers.clear();
        }
        int index=0;
        for (int i:integers)
            result[index++]=i;
        return result;
    }
}
