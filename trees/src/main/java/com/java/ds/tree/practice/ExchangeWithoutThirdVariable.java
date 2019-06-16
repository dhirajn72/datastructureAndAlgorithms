package com.java.ds.tree.practice;

/**
 * @author Dhiraj
 * @date 12/06/19
 */
public class ExchangeWithoutThirdVariable {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a+" "+b);
        a=a+b; //30
        b=a-b; //10
        a=a-b; //20
        System.out.println(a+" "+b);
    }
}
