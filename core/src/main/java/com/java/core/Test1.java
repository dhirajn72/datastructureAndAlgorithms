package com.java.core;

/**
 * @author Dhiraj
 * @date 11/04/18
 */
public class Test1 {
    public static void main(String[] args) {
        String s1= "test";
        String s2= "test";
        String s3= new String("test");
        String s4= new String("test");

        System.out.println(s1==s2);
        System.out.println(s3==s2);
        System.out.println(s3==s4);
    }
}
