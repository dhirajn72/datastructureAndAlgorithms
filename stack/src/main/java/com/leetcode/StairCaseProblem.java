package com.leetcode;

/**
 * @author Dhiraj
 * @date 17/07/19
 */
public class StairCaseProblem {
    public static void main(String[] args) {
        System.out.println(_countWays(3));

    }

    private static int _countWays(int n) {
        System.out.println("Starting from :: "+n);
        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;
        else {
            int a=_countWays(n - 1) ;
            int b=_countWays(n - 2) ;
            int c=_countWays(n - 3) ;
            System.out.println("Adding ::"+a+"::"+b+"::"+c);
            return a+b+c;
        }
    }
}
