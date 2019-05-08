package com.java.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 02/04/19
 */
public class Test {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list=null;
        /*list.add("test");
        list.add(null);
        list.add("abc");
        list.add("def");*/

        for (String s:list){
            System.out.println(s);
        }


    }
}
