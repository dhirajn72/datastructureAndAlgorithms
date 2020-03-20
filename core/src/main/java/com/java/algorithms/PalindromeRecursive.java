package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 10/07/19
 */
public class PalindromeRecursive {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcdcba"));
    }

    private static boolean isPalindrome(String str) {
       return  _isPalidromeRecursive(str,0,str.length()-1);

    }

    private static boolean _isPalidromeRecursive(String str, int low, int high) {
        while (low<high && str.charAt(low)==str.charAt(high)){
            low++;
            high--;
           return _isPalidromeRecursive(str, low, high);
        }
        return low == high;
    }
}
