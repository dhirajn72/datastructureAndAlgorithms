package com.java.core;

import java.util.*;

/**
 * @author Dhiraj
 * @date 10/05/18
 */
public class MapSortByValue {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put("zeplin",1);
        map.put("apple",7);
        map.put("violin",2);
        map.put("box",21);
        map.put("yack",6);

        Set<Map.Entry<String,Integer>> set=map.entrySet();
        List<Map.Entry<String,Integer>> list= new ArrayList<>(set);

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for (Map.Entry<String,Integer> ob:list){
            System.out.println(ob.getKey()+":"+ob.getValue());

        }

    }




}
