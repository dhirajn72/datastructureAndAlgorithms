package com.java.algorithms;

import java.util.StringTokenizer;

/**
 * @author Dhiraj
 * @date 16/02/19
 */
public class WordReverse {
    public static void main(String[] args) {
        String string="Teza is a big huchhi";
        StringTokenizer tokenizer=new StringTokenizer(string," ");
        while (tokenizer.hasMoreTokens()){
            String word=tokenizer.nextToken();
            String str="";
            for (int i=word.length()-1;i>=0;i--)
                System.out.print(str+word.charAt(i));
            System.out.print(" ");
        }
    }
}
