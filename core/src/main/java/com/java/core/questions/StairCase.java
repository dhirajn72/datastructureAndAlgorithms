package com.java.core.questions;

/**
 * @author Dhiraj
 * @date 02/05/18
 */
public class StairCase {

    static void staircase(int n) {

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)

            {
                if((i+j)>n)
                {
                    System.out.print("#");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }






    public static void main(String[] args) {
       // int n = Integer.parseInt(scan.nextLine().trim());

        staircase(5);
    }
}