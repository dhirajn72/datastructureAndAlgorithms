package com.java.linkedlist.clients;

import com.java.linkedlist.ArrayList;

/**
 * @author Dhiraj
 * @date 26/09/18
 */
public class ArrayListTestClient {
    public static void main(String[] args) {
        ArrayList list= new ArrayList();
        list.add(12);
        list.add(42);
        list.add(22);



        list.display();
        System.out.println();
        System.out.println("data :"+list.get(2));
        //System.out.println(list.remove(2));

        System.out.println("******");
        list.display();
        /*List list1= new java.util.ArrayList();
        list1.add(23);
        System.out.println();
        System.out.println("***\n");

        System.out.println(list1.get(0));
        System.out.println(list1.remove(1));*/


    }
}
