package com.java.algorithms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 24/04/19
 */
public class TestClass2 {
    public static void main(String[] args) {
        /*Map<String, Integer> map = DataUtils.getMapObject();
        System.out.println(map);

        map=map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(key,value)->{
                    System.out.println(key+">"+value);
                    return key;
                }, LinkedHashMap::new));
        System.out.println(map);

        */

        Stream<String[]>
                Ss1 = Stream
                .of(new String[][] { { "GFG", "GeeksForGeeks" },
                        { "g", "geeks" },
                        { "GFG", "Geeks" } });

        // Get Map from String
        // using toMap() method
        Map<String, String>
                map2 = Ss1
                .collect(Collectors
                        .toMap(p -> p[0], p -> p[1],(key,value)->{
                            System.out.println(key+">"+value);
                            return key+","+value;
                        },LinkedHashMap::new));

        // Print the Map
        System.out.println("Map:" + map2);
    }
}
