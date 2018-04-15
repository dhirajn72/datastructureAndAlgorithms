package com.java.core.eight.features;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 13/04/18
 */
public class ForEach {
    public static void main(String[] args) {
        List<String> strings= new ArrayList<>();
        strings=getValues();
        List<Integer> integers= new ArrayList<>();
        strings.forEach(string ->{
            if (string.equalsIgnoreCase("rajput")){
                for (int i=0;i<100;i++){
                    integers.add(i);
                }
            }
        }
        );

        integers.forEach(integer -> {
            System.out.println("Integers : "+integer);
        });
    }

    private static List<String> getValues() {
        List<String> strings = new ArrayList<String>();
        strings.add("singh");
        strings.add("dhiraj");
        strings.add("kumar");
        strings.add("rajput");
        return  strings;
    }
}
