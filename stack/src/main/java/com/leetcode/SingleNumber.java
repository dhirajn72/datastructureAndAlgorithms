package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Dhiraj
 * @date 16/07/19
 */
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,1,2,3,2,3,4,5,4,5,6}));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        int count=0;
        for (int i:nums){
            if (!map.containsKey(i))
                map.put(i,count);
            else {
                int c=map.get(i);
                map.put(i,++c);
            }
        }
        for (Integer keys:map.keySet())
            if (map.get(keys)==0)
                return keys;
        return 0;
    }
}
