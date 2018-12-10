package com.java.core.LTI.questions;

/**
 * @author Dhiraj
 * @date 15/04/18
 */
public class Test4 {
    public static void main(String[] args) {
        new A2();

        String e="ecommerce";
        /*for(int i=0;i<e.length()-1;i++){
            char ch=e.charAt(i);
            for (int j=1;j<e.length();j++){
                boolean flag= e.contains(String.valueOf(ch));
                System.out.println(ch);
                break;
            }
            break;
        }*/

        for(int i=0;i<e.length()-1;i++){
            char ch=e.charAt(i);
            for (int j=1;j<e.length();j++){
                boolean flag= e.contains(String.valueOf(ch));
                if (flag) {
                    System.out.println(ch + " " + e.indexOf(ch));
                }
                break;
            }
            break;
        }
    }
}


class A2{
    static {
       // System.out.println(a);// Error:(16, 28) java: illegal forward reference

    }
    static int a;
}