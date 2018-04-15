package com.java.core;

/**
 * @author Dhiraj
 * @date 15/04/18
 */
public class Test5 {
    static int count=0;

    public static void main(String[] args) {
        count++;
        System.out.println("main starts :"+count);
        if (count<5)
            main(null);
        System.out.println("main ends :"+count);



    }
}
