package com.java.core.questions;

/**
 * @author Dhiraj
 * @date 29/11/18
 */
public class StringPermutation {
    public static void main(String[] args) {
        _permutation("","ABC");
    }

    private static void _permutation(String prefix, String str) {
        if (str.length()==0)
            System.out.println(prefix);
        else {
            for (int i=0;i<str.length();i++)
                _permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,str.length()));
        }

    }
}
