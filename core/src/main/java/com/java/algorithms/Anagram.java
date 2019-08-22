package com.java.algorithms;

import java.util.Scanner;

/**
 * @author Dhiraj
 * @date 13/06/19
 */
public class Anagram {
    static boolean isAnagram(String a, String b) {
        char[] s1 = a.toCharArray();
        char[] s2 = b.toCharArray();
        java.util.Arrays.sort(s1);
        java.util.Arrays.sort(s2);
        return java.util.Arrays.equals(s1, s2);
    }

    static boolean isAnagramAnotherWay(String a,String b){
        if (a.length()!=b.length())return false;
        char[] aChars= a.toCharArray();
        char[] bChars= b.toCharArray();

        int[] ints=new int[128];
        for (int i=0;i<aChars.length;i++) {
                ints[aChars[i]]++;
        }
        for (int i=0;i<bChars.length;i++) {
            ints[bChars[i]]--;
        }
        for (int i:ints) {
            if (i<0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();*/
        String a="abdwdnc";
        String b="mdwdcab";
        boolean ret = isAnagram(a, b);
        boolean anotherWay=isAnagramAnotherWay(a,b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
        System.out.println((anotherWay) ? "Anagrams" : "Not Anagrams");

    }
}
