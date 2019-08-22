package com.java.search;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 14/07/19
 */
public class FindDups {
    public static void main(String[] args) {

        System.out.println(_findDupsInArray(new int[]{/*9,8,7,6,5,4,3,*/2,9,8,7,6,5,4,3,2,1}));

    }

    private static boolean _findDupsInArray(int[] arr) {
        Map<Integer,Integer> map= new HashMap<>();
        boolean flag=false;
        for (int i:arr){
            if (!map.containsKey(i))
                map.put(i,i);
            else {
                System.out.println("Found duplicates: "+i);
                flag=true;
            }
        }
        if (flag)
            return flag;
        return flag;
    }
}
