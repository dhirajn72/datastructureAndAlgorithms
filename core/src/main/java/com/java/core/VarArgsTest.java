package com.java.core;

/**
 * @author Dhiraj
 * @date 15/04/18
 */
public class VarArgsTest {
    public static void main(String[] args) {
        A a= new A();
        a.show("dk",100);
    }
}


class A{
    void show(String a,int... b){
        System.out.println(a+" "+b);

    }
}