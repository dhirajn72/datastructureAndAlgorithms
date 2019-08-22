package com.java.algorithms;

import java.math.BigInteger;

/**
 * @author Dhiraj
 * @date 29/06/19
 */
public class Permutaions {
    public static void main(String[] args) {
        String s="ABCDEFGH";
        //permutaions(s);
       // printPermutations(s);
        //fibonacciIterative(800);


    }

    private static void fibonacciIterative(int n) {
        BigInteger firstNumber=new BigInteger("0");
        BigInteger secondNumber=new BigInteger("1");

        BigInteger sum=new BigInteger("0");
        System.out.print(firstNumber+","+secondNumber+",");
        while (n>0){
            sum=firstNumber.add(secondNumber);
            System.out.println(sum+",");
            firstNumber=secondNumber;
            secondNumber=sum;
            n--;
        }
    }
    private static String printPermutations(String s) {
        return "";
    }

    private static void permutaions(String s) {
        String s1=s.replace("ABC","X");
        System.out.println(s1);
        int length=s1.length();
        int possibilities=factorial(length);
        System.out.println(possibilities);
    }

    private static int factorial(int n) {
        if (n==0)return 1;
        else return n * factorial(n-1);
    }
}
