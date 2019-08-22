package com.leetcode;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Dhiraj
 * @date 16/07/19
 */
public class StringToInteger {
    public static void main(String[] args) {
        /*System.out.println(myAtoi("4193 with 32 words"));
        System.out.println(myAtoi("-040193 with  words -040193"));
        */
        //System.out.println(myAtoi("-91283472332"));


    }

    public static int myAtoi(String str) {
        str= str.trim();
        boolean isNegative= str.startsWith("-");
        StringTokenizer tokenizer=new StringTokenizer(str," ");
        String first=null;
        while (tokenizer.hasMoreTokens()){
              first=tokenizer.nextToken();
             if (first!=null)
                 break;
        }
        if (isNegative)return -Math.abs(Integer.parseInt(first));
        return Math.abs(Integer.valueOf(first));
    }
}
