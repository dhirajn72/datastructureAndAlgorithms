package com.java.core;

import com.java.utils.DataUtils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 29/09/18
 */
public class MapSortByValue_1 {

    public static void main(String[] args) {

        Map<String,Integer> map= DataUtils.getMapObject();
        System.out.println(map);
        Map<String,Integer> mapSorted= map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                                        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(x,y)->y, LinkedHashMap::new));
        System.out.println(mapSorted);


    }


}
