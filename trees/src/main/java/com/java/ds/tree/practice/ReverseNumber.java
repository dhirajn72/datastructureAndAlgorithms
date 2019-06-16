package com.java.ds.tree.practice;

/**
 * @author Dhiraj
 * @date 12/06/19
 */
public class ReverseNumber {
    public static void main(String[] args) {
        reverseRecursive(12345);
        System.out.println();
        reverseIterative(12345);
        reverseAsString("12345");


    }

    private static void reverseAsString(String s) {
        String res="";
        for (int i=s.length()-1;i>=0;i--)
            res+=s.charAt(i);
        System.out.println(res);
    }

    private static void reverseRecursive(int number) {
        if (number < 10) {
            System.out.print(number);
            return;
        }
        else {
            System.out.print(number%10);
            reverseRecursive(number/10);
        }
    }
    private static void reverseIterative(int number) {
        String result="";
        while (number>10){
            int mod=number%10;
            result+=mod;
            number=number/10;
        }
        result+=number;
        System.out.println(result);
    }
}
