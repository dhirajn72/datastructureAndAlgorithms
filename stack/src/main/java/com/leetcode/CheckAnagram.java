package com.leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 16/07/19
 */
public class CheckAnagram {

    public static void main(String[] args) {
        /*

Input: s = "anagram", t = "nagaram"
Output: true

Input: s = "rat", t = "car"
Output: false
         */

        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("rat","tar"));

        double x= -91283472332.00;
        System.out.println((int)x);
    }

    public static boolean isAnagram(String s, String t) {
        if (s==null||t==null||s.length()==0||t.length()==0)return true;
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1,s2);

    }
}
