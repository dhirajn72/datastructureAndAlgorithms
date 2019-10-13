package com.java.core;

/**
 * @author Dhiraj
 * @date 10/09/19
 */
public class DataTypeCheck {
    public static void main(String[] args) {
        calculate(1,2);


    }
    /*public static void calculate(int a,int b){
        System.out.println("calculate(int a,int b)");
    }
    public static void calculate(double a,double b){
        System.out.println("Fcalculate(double a,double b)");
    }
    public static void calculate(float a,float b){
        System.out.println("calculate(float a,float b)");
    }
    public static void calculate(long a,long b){
        System.out.println("calculate(long a,long b)");
    }
    public static void calculate(Integer a,Integer b){
        System.out.println("calculate(Integer a,Integer b)");
    }*/
    public static void calculate(Double a,Double b){
        System.out.println("calculate(Double a,Double b)");
    }
    public static void calculate(Long a,Long b){
        System.out.println("calculate(Long a,Long b)");
    }
    public static void calculate(Object a,Object b){
        System.out.println("calculate(Object a,Object b)");
    }
    public static void calculate(String a,String b){
        System.out.println("calculate(String a,String b)");
    }
}
