package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 18/01/19
 */
public class Permutation {
    public static void main(String[] args) {
        permutation("ABC");
    }

    private static void permutation(String str) {
        permutation("", str);
    }


    public static void permutation(String prefix, String str) {
        if (str.length() == 0)
            System.out.println(prefix);
        else
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                String s1 = str.substring(0, i);
                String s2 = str.substring(i + 1, str.length());
                permutation1(prefix + c, s1 + s2);
            }
    }

    public static void permutation1(String prefix, String str) {
        if (str.length() == 0)
            System.out.println(prefix);
        else
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                String s1 = str.substring(0, i);
                String s2 = str.substring(i + 1, str.length());
                permutation2(prefix + c, s1 + s2);
            }
    }

    public static void permutation2(String prefix, String str) {
        if (str.length() == 0)
            System.out.println(prefix);
        else
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                String s1 = str.substring(0, i);
                String s2 = str.substring(i + 1, str.length());
                permutation3(prefix + c, s1 + s2);
            }
    }

    public static void permutation3(String prefix, String str) {
        if (str.length() == 0)
            System.out.println(prefix);
        else
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                String s1 = str.substring(0, i);
                String s2 = str.substring(i + 1, str.length());
                permutation4(prefix + c, s1 + s2);
            }
    }

    public static void permutation4(String prefix, String str) {
        if (str.length() == 0)
            System.out.println(prefix);
        else
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                String s1 = str.substring(0, i);
                String s2 = str.substring(i + 1, str.length());
                permutation5(prefix + c, s1 + s2);
            }
    }

    public static void permutation5(String prefix, String str) {
        if (str.length() == 0)
            System.out.println(prefix);
        else
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                String s1 = str.substring(0, i);
                String s2 = str.substring(i + 1, str.length());
                permutation6(prefix + c, s1 + s2);
            }
    }

    public static void permutation6(String prefix,String str){
        if (str.length()==0)
            System.out.println(prefix);
        else
            for (int i=0;i<str.length();i++) {
                char c=str.charAt(i);
                String s1=str.substring(0, i);
                String s2=str.substring(i + 1, str.length());
                //permutation(prefix + c, s1+ s2);
            }
    }
}
