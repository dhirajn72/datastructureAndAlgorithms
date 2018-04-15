package com.java.core.packagetest;

import com.java.core.Test6;

/**
 * @author Dhiraj
 * @date 15/04/18
 */
public class Test7 {
    public static void main(String[] args) {
        Test6_B test6B= new Test6_B();
        test6B.display();
    }
}


class Test6_B extends Test6{
      void display(){
        System.out.println("Test6_B:::::display()");
    }
}