package com.java.search;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 14/07/19
 */
public class ThreeElementWithSumK {
    public static void main(String[] args) {
        System.out.println(_threeSumWithK(new int[]{9,2,1,7,2,4,6,5},5));
    }

    private static int _threeSumWithK(int[] arr, int target) {


        Map<Integer,String> map= new HashMap<>();
        for (int i=0;i<arr.length-2;i++){
            for (int j=1;j<arr.length-1;j++){
                for (int k=2;k<arr.length;k++) {
                    if (i==j || i==k || j==k) continue;
                    map.put(arr[i]+arr[j]+arr[k],arr[i]+" index>"+i +":"+ arr[j]+" index>"+j+":"+arr[k]+" index>"+k);
                }
            }
        }
        if (map.get(target)!=null)
            System.out.println(target+"::"+map.get(target));
        else System.out.println("No sum exists for :"+target);
        return 0;
    }
}
