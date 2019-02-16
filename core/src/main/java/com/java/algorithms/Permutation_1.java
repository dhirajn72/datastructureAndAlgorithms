package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 15/02/19
 */
public class Permutation_1 {
    public static void main(String[] args) {
        permutation("ABCD");
    }
    private static void permutation(String str) {
        permutation("",str);
    }
    private static void permutation(String prefix, String str) {
        if (str.length()==0)
            System.out.println(prefix);
        else
            for (int i=0;i<str.length();i++)
                permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,str.length()));
    }
}
