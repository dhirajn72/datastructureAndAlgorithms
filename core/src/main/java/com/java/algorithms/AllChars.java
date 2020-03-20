package com.java.algorithms;

import java.util.stream.IntStream;

/**
 * @author Dhiraj
 * @date 29/06/19
 */
public class AllChars {
    public static void main(String[] args) {
        IntStream.rangeClosed(0,255)
                .forEach(i->{char c=(char)i;
                    System.out.println(c+"  ");
                    System.out.println((int)c);
                });
    }
}
