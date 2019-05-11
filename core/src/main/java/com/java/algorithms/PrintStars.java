package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 09/05/19
 */
public class PrintStars {
    public static void main(String[] args) {
        printStars(10);


    }
/*
    private static void printStars(int n) {
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++)
                System.out.print(" *");
            System.out.println();
        }
    }*/
private static void printStars(int n) {
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++)
                System.out.print(" ");

            for (int j=i;j>=0;j--)
                System.out.print("*");
            System.out.println();
        }
    }
}

/*

* @ @ @ @
* * @ @ @
* * * @ @
* * * * @
* * * * *




 */