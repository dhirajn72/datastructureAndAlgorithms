package com.java.linkedlist.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 21/07/19
 */
public class CalculateDifference {
    public static void main(String[] args) {
        //int[] arr= {2,3,10,2,4,8,1};
        //int[] arr= {1,2,6,4};
        int[] arr=/*{5,6,7,8,10,5};*/{10,8,7,6,5};
        List<Integer> integers= new ArrayList<>();
        for (int i: arr)
            integers.add(i);
        System.out.println(maxDifference(integers));
    }

    public static int maxDifference(List<Integer> list) {
        // Write your code here

        if (list==null)return 0;
        if (list.size()==0)return 0;
        int[] arr=new  int[list.size()];
        int index=0;
        for (int i:list)
            arr[index++]=i;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            for (int j = 0; j < i; j++) {
                if (i==j)continue;
                if (arr[j]<arr[i]){
                    max=Math.max(max,arr[i]-arr[j]);
                }
            }
        }
        if (max==Integer.MIN_VALUE)return -1;
        return max;
    }
}
