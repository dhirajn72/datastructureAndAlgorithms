package com.java.core;

import com.java.utils.DataUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 10/05/18
 */
public class MapSortByValue {
    public static void main(String[] args) {
        Map<String,Integer> map= DataUtils.getMapObject();

        Set<Map.Entry<String,Integer>> set=map.entrySet();
        List<Map.Entry<String,Integer>> list= new ArrayList<>(set);

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for (Map.Entry<String,Integer> ob:list){
           // System.out.println(ob.getKey()+":"+ob.getValue());

        }

        System.out.println(map);
        map=map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(key,value)->{ System.out.println(key+" "+value);return key; },LinkedHashMap::new));
        System.out.println(map);

    }
}
