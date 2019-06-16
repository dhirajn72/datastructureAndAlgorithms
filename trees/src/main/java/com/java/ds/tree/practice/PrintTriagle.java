package com.java.ds.tree.practice;

/**
 * @author Dhiraj
 * @date 12/06/19
 */
public class PrintTriagle {
    public static void main(String[] args) {
        printTriagle(10);
    }

    private static void printTriagle(int n) {
        for (int i=0;i<n;i++){
            for (int k=n-i;k>=0;k--){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
