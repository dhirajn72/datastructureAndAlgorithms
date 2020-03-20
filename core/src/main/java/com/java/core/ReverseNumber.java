package com.java.core;

/**
 * @author Dhiraj
 * @date 12/09/19
 */
public class ReverseNumber {
    public static void main(String[] args) {

        int n=123;
        int remainder=0;
        while (n>0){
            remainder=remainder*10;
            remainder=n%10+remainder;
            n=n/10;
        }
        System.out.println(remainder);
        n=123;
        reverseRecursive(n);

    }

    private static int reverseRecursive(int n) {
        if (n==0)
            return 0;
        else {
            if (n!=0)
                System.out.print(n%10);
            return reverseRecursive(n/10);
        }
    }
}
