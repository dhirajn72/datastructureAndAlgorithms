package com.java.core.LTI.questions;

/**
 * @author Dhiraj
 * @date 15/04/18
 */
public class Test4 {
    public static void main(String[] args) {
        new A2();
    }
}


class A2{
    static {
       // System.out.println(a);// Error:(16, 28) java: illegal forward reference
    }
    static int a;
}