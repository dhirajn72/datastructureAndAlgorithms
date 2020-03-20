package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 19/04/19
 */
public class PalindromeOneMistake {
    public static void main(String[] args) {
        String s="abcdba";
        checkPalindrome(s);
    }

    private static void checkPalindrome(String str) {
        for (int i=0;i<str.length();i++){
            StringBuilder builder=new StringBuilder(str);
            StringBuilder deleted = builder.deleteCharAt(i);
            if (isPalindrome(deleted)){
                System.out.println("Palindrome");
                System.out.println("Deleted index is::"+i);
                break;
            }
        }
    }

    private static boolean isPalindrome(StringBuilder deleted) {
        StringBuilder reversed=new StringBuilder();
        for (int i=deleted.length()-1;i>=0;i--){
            reversed.append(deleted.charAt(i));
        }
        return reversed.toString().equalsIgnoreCase(deleted.toString());
    }
}
