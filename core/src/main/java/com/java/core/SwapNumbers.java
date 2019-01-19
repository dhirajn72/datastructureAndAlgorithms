package com.java.core;

/**
 * @author Dhiraj
 * @date 12/11/18
 */
public class SwapNumbers {
    public static void main(String[] args) {
        int a=40;
        int b=32;
        System.out.println("a:"+a+" b:"+b);
        /*a=a+b;
        b=a-b;
        a=a-b;*/
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a:"+a+" b:"+b);
        String s=new String("test");
        System.out.println(s.intern());
        System.out.println(s==s.intern());
    }
}
