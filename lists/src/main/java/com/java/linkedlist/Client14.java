package com.java.linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 27/09/18
 */
public class Client14 {
    public static void main(String[] args) {
        ArrayList2 list=new ArrayList2();
        list.add(12);
        list.add("abc");
        list.add(34);
        list.add(15);

        list.remove(1);


        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println("******");






    }
}
