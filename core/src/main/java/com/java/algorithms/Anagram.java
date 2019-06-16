package com.java.algorithms;

import java.util.Scanner;

/**
 * @author Dhiraj
 * @date 13/06/19
 */
public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        char[] s1 = a.toCharArray();
        char[] s2 = b.toCharArray();
        java.util.Arrays.sort(s1);
        java.util.Arrays.sort(s2);
        return java.util.Arrays.equals(s1, s2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
