package com.karumanchi;

/**
 * @author Dhiraj
 * @date 08/07/19
 */
public class FactorialDP {

    static final int size=5;
    public static void main(String[] args) {
        System.out.println(fact(size));

    }


    static  int[] facto=new int[size+1];
    public static int fact(int n){

        if (n==1)return 1;
        else if (n==0) return 1;
        else if (facto[n]!=0)return facto[n];
        else return facto[n]=n*fact(n-1);

    }
}
