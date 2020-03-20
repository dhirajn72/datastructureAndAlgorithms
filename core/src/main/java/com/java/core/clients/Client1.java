package com.java.core.clients;

import com.java.utils.MyArrayList;

/**
 * @author Dhiraj
 * @date 11/04/18
 */
public class Client1 {
    public static void main(String[] args) {
        /*ArrayList arrayList= new ArrayList();
        arrayList.add("dhiraj");
        arrayList.add("kumar");
        arrayList.display();
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.remove(1));
        System.out.println("************");
        arrayList.display();*/

        MyArrayList myArrayList= new MyArrayList();
        myArrayList.add("dhiraj");
        myArrayList.add("kr");
        myArrayList.add("kumar");
        myArrayList.add("singh");
        myArrayList.display();
        System.out.println(myArrayList.size());


        System.out.println("Removed: "+myArrayList.remove(4));
        myArrayList.display();

        MyArrayList integerMyArrayList= new MyArrayList<>();

        System.out.println(new java.util.ArrayList<>().get(50));













    }
}
