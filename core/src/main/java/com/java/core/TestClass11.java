package com.java.core;

import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 04/10/18
 */
public class TestClass11 {
    public static void main(String[] args) {
        System.out.println("main starts !");
        Stream.iterate(1,x->++x).limit(10).forEachOrdered(System.out::println);
        System.out.println("main ends ");
    }
}
