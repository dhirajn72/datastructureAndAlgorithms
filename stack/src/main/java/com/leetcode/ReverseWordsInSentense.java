package com.leetcode;

/**
 * @author Dhiraj
 * @date 19/07/19
 */
public class ReverseWordsInSentense {
    public static void main(String[] args) {
        String s="This is carrer monk string";
        _reverseWordsInString(s);

    }

    private static void _reverseWordsInString(String str) {
        int len=str.length()-1;
        String s="";
        for (int i=len;i>=0;i--){
            if (str.charAt(i) == ' '){
                _printChars(s);
                System.out.print(" ");
                s="";
            }
            else {
                s+=str.charAt(i);
            }
        }
        _printChars(s);
    }

    private static void _printChars(String s) {
        for (int j=s.length()-1;j>=0;j--){
            System.out.print(s.charAt(j));
        }
    }
}
