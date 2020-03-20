package com.leetcode;

/**
 * @author Dhiraj
 * @date 28/07/19
 */
public class PalindromicSubstrings {

    public static void main(String[] args) {

        System.out.println(countSubstrings("aaa"));

    }
    public static int countSubstrings(String str) {
        if (str==null|| str.length()==0)return 0;
        String s = "";
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
        return count;
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
        return i == j || i > j;
    }
}
