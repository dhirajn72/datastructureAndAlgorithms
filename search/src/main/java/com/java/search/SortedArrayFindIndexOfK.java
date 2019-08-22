package com.java.search;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 14/07/19
 */
public class SortedArrayFindIndexOfK {
    public static void main(String[] args) {
        System.out.println(_findIndexOfKInSortedRotatedArray(new int[]{9,11,12,13,14,15,16,17,1,2,3,4,5,6,7,8,},15));
    }

    private static int _findIndexOfKInSortedRotatedArray(int[] arr, int target) {
        Map<Integer,Integer> map= new HashMap<>();
        for (int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        if (map.get(target)!=null)
            return map.get(target);
        return -1;
    }

}
