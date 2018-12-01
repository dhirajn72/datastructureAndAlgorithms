package com.java.core.questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 30/11/18
 */
public class MapSortOnValues {
    public static void main(String[] args) {

        Map<Integer,String> map= new HashMap<>();
        map.put(1,"zebra");
        map.put(3,"cat");
        map.put(4,"ball");
        map.put(2,"apple");

        Map<Integer,String> sortedMap=map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(x,y)->x,LinkedHashMap::new));
        System.out.println(map);
        System.out.println(sortedMap);
    }
}
