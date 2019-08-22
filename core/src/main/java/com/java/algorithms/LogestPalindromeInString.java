package com.java.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 28/06/19
 */
public class LogestPalindromeInString {
    public static void main(String[] args) {
        String s = "abcbcaddabcdcb";
        isPalindrom(s);

    }

    private static String isPalindrom(String str) {
        if (str==null|| str.length()==0)return "";
        String s = "";
        int max=Integer.MIN_VALUE;
        Map<Integer,String> map= new HashMap<>();
        char[] strArray=str.toCharArray();
        int count=0;
        for (int i = 0; i < strArray.length; i++) {
            for (int j = i; j < strArray.length; j++) {
                s += strArray[j];
                if (_isPalindrome(s)) {
                    count++;
                }
            }
            s="";
        }
        System.out.println(count);
        return map.get(max);
    }
    private static boolean _isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        char[] strArray= str.toCharArray();
        while (i < j) {
            if (strArray[i] == strArray[j]) {
                i++;
                j--;
            } else {
                break;
            }
        }
        if (i == j || i>j) {
            System.out.println("Palindrome>>>"+str);
            return true;
        } else {
            return false;
        }
    }
}
