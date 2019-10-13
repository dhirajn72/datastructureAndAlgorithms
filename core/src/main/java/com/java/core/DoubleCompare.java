package com.java.core;

/**
 * @author Dhiraj
 * @date 28/09/19
 */
public class DoubleCompare {
    public static void main(String[] args) {
        double myMetric=99.9990;
        double d1=99.9999;
        double d2=100.0;

        System.out.println(myMetric>=d1 && myMetric<=d2);

    }
}
