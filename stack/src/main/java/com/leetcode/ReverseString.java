package com.leetcode;

/**
 * @author Dhiraj
 * @date 16/07/19
 */
public class ReverseString {

    public static void main(String[] args) {
        /*
Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
         */

        reverseString(new char[]{'h','e','l','l','o'});
        reverseString(new char[]{'H','a','n','n','a','h'});
        //reverseString(null);
        reverseString(new char[]{'H'});
    }
    public static void reverseString(char[] s) {
        if (s==null || s.length==0)return;
        int i=0,j=s.length-1;
        while (i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}
