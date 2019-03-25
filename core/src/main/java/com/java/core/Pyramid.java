package com.java.core;

/**
 * @author Dhiraj
 * @date 18/03/19
 */
public class Pyramid {
    public static void main(String[] args) {
        pyramid(10);
    }

    private static void pyramid(int n) {

        for (int i=n;i>=0;i--){
            for (int j=0;j<i;j++)
                System.out.print(" ");
            for (int j=i;j<n;j++)
                System.out.print( "*");
            System.out.println();
        }
    }
}
