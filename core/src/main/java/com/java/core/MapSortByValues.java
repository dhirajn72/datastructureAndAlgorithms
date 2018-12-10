package com.java.core;

import com.java.utils.DataUtils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 06/12/18
 */
public class MapSortByValues {
    public static void main(String[] args) {
        Map<String,Integer> map= DataUtils.getMapObject();
        System.out.println(map);
        Map<String,Integer> map1=map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(x,y)->x, LinkedHashMap::new));
        System.out.println(map1);
        System.out.println(factorial(5));
        System.out.println(10*4+5-2%3/2);
        System.out.println(-2%1);

    }

    public static int factorial(int x){
        if(x==1)
            return x;
        else return x*factorial(x-1);
    }
}
