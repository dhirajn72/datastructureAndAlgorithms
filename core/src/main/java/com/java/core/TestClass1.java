package com.java.core;

/**
 * @author Dhiraj
 * @date 01/12/18
 */
public class TestClass1 {
    public static void main(String[] args) {

        //Integer i=new Integer(null);
       // String s= new String(null);
        System.out.println(methodOne(5));

    }

    private static int methodOne(int i) {
        return i *=5;
    }


}
