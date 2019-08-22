package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Dhiraj
 * @date 18/07/19
 */
public class FIndMinimumPair {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(_findMinPair(arr));
    }

    private static String _findMinPair(int[] arr) {
        int min=Integer.MAX_VALUE;
        Map<Integer,String>  map= new HashMap<>();
        _sortDescending(arr);
        for (int i=0;i<arr.length-1;i++)
           _findDifference(arr[i],arr[i+1],map);
        for (Integer key:map.keySet())
            min=Math.min(min,key);
        System.out.println(map);
        return map.get(min);
    }

    private static void _sortDescending(int[] arr) {
        Arrays.sort(arr);
        int i1=0;
        int j=arr.length-1;
        while (i1<j){
            int temp=arr[i1];
            arr[i1]=arr[j];
            arr[j]=temp;
            i1++;
            j--;
        }
    }
    private static void  _findDifference(int i, int i1,Map<Integer,String> map) {
        int min= i-i1;
        map.put(min,i+":"+i1);
    }
}
