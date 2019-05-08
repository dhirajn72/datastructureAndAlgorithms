package com.java.core;

/**
 * @author Dhiraj
 * @date 08/05/19
 */
public class TestClass2 {
    public static void main(String[] args) {

        Integer a= 10;
        Integer b=incrementAndGet(a);
        System.out.println(a);
        System.out.println(b);
    }

    private static Integer incrementAndGet(Integer a) {
       // a=a+10;
        return ++a;
    }
}
