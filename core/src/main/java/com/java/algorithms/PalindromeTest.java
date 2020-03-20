package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 19/08/19
 */
public class PalindromeTest {
    public static void main(String[] args) {
        System.out.println(_isPalindrome("bceb"));
    }

    private static boolean _isPalindrome(String str) {
        int i=0;
        int j=str.length()-1;
        int isEven=str.length()%2;
        if (isEven==0){
            while (i<=j && str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            return true;
        }
        while (i<j && str.charAt(i)==str.charAt(j)){
            i++;
            j--;
        }
        return i == j;
    }
}
