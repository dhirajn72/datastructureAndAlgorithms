package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 09/05/19
 */
public class Fibbonaci {
    public static void main(String[] args) {
        fibbonacci(10);

    }

    private static void fibbonacci(int n) {
        int firstNumber=0,secondNumber=1,i=0;
        System.out.println("Fibonacci of "+n +" are::");
        System.out.print(firstNumber+",");
        while (i<=n){
            int sum=firstNumber+secondNumber;
            System.out.print(sum+",");
            firstNumber=secondNumber;
            secondNumber=sum;
            i++;
        }
    }
}
