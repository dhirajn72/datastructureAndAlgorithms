package com.java.core;

/**
 * @author Dhiraj
 * @date 15/04/18
 */
public class ClassLoadingTest {
    public static void main(String[] args) {
        new Test3();
    }
}
class Test3{

    {
        System.out.println("IIB");
    }
    static{
        System.out.println("SIB");
    }
    public  Test3(){

        /*{
            System.out.println("IIB-constructor");
        }*/

        System.out.println("Constructor");

    }

}