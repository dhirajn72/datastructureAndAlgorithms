package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 26/11/18
 */
public class TestClass1 {
    public static void main(String[] args) {
        permutation("ABC");
    }
    private static void permutation(String string) {
        permutation("",string);

    }
    private static void permutation(String prefix,String str) {
        if (str.length()==0)
            System.out.println(prefix);
        else {
            for (int i = 0; i < str.length(); i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()));
        }

    }
}
