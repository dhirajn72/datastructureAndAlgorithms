package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 16/02/19
 */
public class Pyramid {
    public static void main(String[] args) {
        printPyramid(10);
    }

    private static void printPyramid(int n) {
        for (int i=0;i<n;i++){
            for (int j=i;j<n-1;j++)
                System.out.print(" ");
            for (int j=1;j<i;j++)
                System.out.print(" *");
            System.out.println();
        }
    }
}
