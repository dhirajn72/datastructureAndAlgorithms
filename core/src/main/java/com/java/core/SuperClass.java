package com.java.core;

/**
 * @author Dhiraj
 * @date 29/02/20
 */
public class SuperClass {
    public static void main(String[] args) {
        Super_1 s=new Super_1();
        s.m1(null);

        System.out.println(System.getProperty("java.version"));

    }
}


class Super_1{
    void m1(Integer i){
        System.out.println("m1");
    }
    void m1(Object i){
        System.out.println("ob");
    }
}
/*class Sub_1 extends Super_1{
    void m1(int i){
        System.out.println("m2");
    }
}*/


