package com.java.core.LTI.questions;

/**
 * @author Dhiraj
 * @date 15/04/18
 */
public class Test {
    public static void main(String[] args) {
        new B1();
    }
}


class  A1{
    int i=0;
    public A1(){
        i +=5;
        System.out.println(i);
    }
}
class B1 extends  A1{
    public B1(){
        i *=4;
        System.out.println(i);
    }
}