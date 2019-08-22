package com.java.search;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 14/07/19
 */
public class SumCloseToZero {
    public static void main(String[] args) {
        System.out.println(_sumCloseToZero(new int[]{9,2,1,7,3,4,6,5}));
    }

    private static String _sumCloseToZero(int[] arr) {
        int min=Integer.MAX_VALUE;
        String pair="";
        Map<Integer,String>  map=  new HashMap<>();
        for (int i=0;i<arr.length-1;i++){
            for (int j=1;j<arr.length;j++){
                if (i==j)continue;
                if (!map.containsKey(arr[i]+arr[j]))
                        map.put(arr[i]+arr[j],arr[i]+":"+arr[j]);
            }
        }

        for (Integer keys:map.keySet())
            min=Math.min(min,keys);

        System.out.println(min);
        return map.get(min);
    }
}
