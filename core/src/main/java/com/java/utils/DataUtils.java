package com.java.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 29/09/18
 */
public class DataUtils {

    public static Map<String,Integer> getMapObject(){
        Map<String,Integer> map= new HashMap<>();
        map.put("zeplin",1);
        map.put("apple",7);
        map.put("violin",2);
        map.put("box",21);
        map.put("yack",6);
        return map;
    }
    public static int[] getArray(){
        return new int[]{9,8,7,6,5};
    }

}
class Test{
    String name;

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                '}';
    }
}