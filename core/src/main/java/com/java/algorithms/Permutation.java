package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 18/01/19
 */
public class Permutation {
    public static void main(String[] args) {
        permutation("AB");
       // System.out.println("ABD".substring(0,0));
    }

    private static void permutation(String str) {
        permutation("",str);
    }
    public static void permutation(String prefix,String str){
        if (str.length()==0)
            System.out.println(prefix);
        else
            for (int i=0;i<str.length();i++)
                permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,str.length()));
    }
}
