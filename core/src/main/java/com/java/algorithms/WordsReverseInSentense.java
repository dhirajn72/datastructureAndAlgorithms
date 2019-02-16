package com.java.algorithms;

import java.util.*;

/**
 * @author Dhiraj
 * @date 26/11/18
 */
public class WordsReverseInSentense {
    public static void main(String[] args) {
        String str="Teza is a big huchhi";
        StringTokenizer tokenizer= new StringTokenizer(str," ");
        String finalString="";
        while (tokenizer.hasMoreTokens()){
            String word=tokenizer.nextToken();
            String s="";
            for (int i=word.length()-1;i>=0;i--){
                s=s.concat(String.valueOf(word.charAt(i)));
            }
            s+=" ";
            finalString+=s;
        }
        System.out.println(finalString);
    }
}
