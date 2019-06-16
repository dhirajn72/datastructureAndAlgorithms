package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 12/05/19
 */
public class Fibbonacci {
    public static void main(String[] args) {
        fibonacci(10);
    }

    private static void fibonacci(int n) {
        int firstNumber=0,secondNumber=1;
        int i=1;
        System.out.print(0+",");
        while (i<=n){
            int sum=firstNumber+secondNumber;
            System.out.print(sum+",");
            firstNumber=secondNumber;
            secondNumber=sum;
            i++;
        }
    }
}
