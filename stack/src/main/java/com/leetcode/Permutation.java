package com.leetcode;

/**
 * @author Dhiraj
 * @date 19/07/19
 */
public class Permutation {
    public static void main(String[] args) {

        String s="ABCD";
        _permutation(s);

    }

    private static void _permutation(String s) {
        _permutation("",s);
    }

    private static void _permutation(String prefix, String str) {
        if (str.length()==0)
            System.out.println(prefix);
        else
            for (int i=0;i<str.length();i++)
                _permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,str.length()));

    }
}
