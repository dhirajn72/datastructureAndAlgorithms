package com.java.core.questions;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 20/01/19
 */
public class Test1 {
    public static void main(String[] args) {
        UnsafeArray unsafeArray= new UnsafeArray();
        System.out.println(Arrays.toString(unsafeArray.getCountry()));
        new UnsafeArray().getCountry()[0]=null;
        System.out.println(Arrays.toString(new UnsafeArray().getCountry()));

    }
}
