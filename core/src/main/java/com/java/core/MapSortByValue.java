package com.java.core;

import com.java.utils.DataUtils;

import java.util.*;

/**
 * @author Dhiraj
 * @date 10/05/18
 */
public class MapSortByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = DataUtils.getMapObject();

        System.out.println(map);
        Set<Map.Entry<String,Integer>> entries=map.entrySet();
        List<Map.Entry<String,Integer>> entries1= new ArrayList<>(entries);
        //Collections.sort(entries1, Comparator.comparing(Map.Entry::getValue));
        Collections.sort(entries1, Comparator.comparing(e->e.getValue()));


        map= new LinkedHashMap();
        for (Map.Entry<String,Integer> entry:entries1){
            map.put(entry.getKey(),entry.getValue());
        }
        System.out.println(map);


        /*System.out.println(map);
        map = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (key, value) -> {
                    System.out.println(key + " " + value);
                    return key;
                }, LinkedHashMap::new));
        System.out.println(map);
*/
    }
}
