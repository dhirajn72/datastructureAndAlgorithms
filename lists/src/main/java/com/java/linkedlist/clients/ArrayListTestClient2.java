package com.java.linkedlist.clients;

import com.java.linkedlist.ArrayList1;

/**
 * @author Dhiraj
 * @date 27/09/18
 */
public class ArrayListTestClient2 {
    public static void main(String[] args) {
        ArrayList1 list= new ArrayList1();
        list.add(12);
        list.add(13);
        list.add(14);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.remove(0));
        System.out.println(list);

    }
}
