package com.java.utils;

import interview.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 29/09/18
 */
public class DataUtils {
    public static Map<String, Integer> getMapObject() {
        Map<String, Integer> map = new HashMap<>();
        map.put("zeplin", 1);
        map.put("apple", 7);
        map.put("violin", 2);
        map.put("box", 21);
        map.put("yack", 6);
        return map;
    }

    public static int[] getArray() {
        return new int[]{9, 8, 7, 6, 5};
    }

    public static int[] getSortedIntArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;
        return arr;
    }


    public static List<Person> getPersonList() {
        return Stream.iterate(1, id -> ++id).limit(50).
                map(id -> {
                    Person p = new Person();
                    p.setId(id);
                    p.setFname("fname".concat(String.valueOf(id)));
                    p.setLname("lname".concat(String.valueOf(id)));
                    p.setEmail("email".concat(String.valueOf(id)));
                    p.setPhone(id);
                    return p;
                }).
                collect(Collectors.toList());
    }
}

class Test {
    String name;

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                '}';
    }
}