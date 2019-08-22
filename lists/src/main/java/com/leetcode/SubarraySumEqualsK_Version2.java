package com.leetcode;

import java.util.HashMap;

/**
 * @author Dhiraj
 * @date 28/07/19
 */
public class SubarraySumEqualsK_Version2 {
    public static void main(String[] args) {
        // int[] arr= {1,2,3,5,4,3};
        int[] arr = {1, 1, 1};

        System.out.println(subarraySum(arr, 2));


    }

    public static int subarraySum(int[] arr, int target) {
        int sum = 0,count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if (map.containsKey(sum-target)){
                count+=map.get(sum-target);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(map);
        return count;
    }
}