package com.java.core.questions;

import java.util.*;

/**
 * @author Dhiraj
 * @date 12/04/18
 */

/*
 * Longest Repeated Subsequence
 * Given a string, print the longest repeating subsequence such that the two subsequence don’t have same string character at same position,
 * i.e., any i’th character in the two subsequences shouldn’t have the same index in the original string.
 *
 */

public class RepeatedStrings {
    public static void main(String[] args) {
        String str="aabbacccda";
        System.out.println(getRepititiveChars(str));
    }

    public static String getRepititiveChars(String str){
        Set<String> stringsSet= new HashSet<String>();
        List<String> stringsList=  new ArrayList<String>();
        for (int i=0;i<str.length();i++){
            stringsSet.add(str.charAt(i)+"");
            stringsList.add(str.charAt(i)+"");
        }
        String result="";
        for (String chars:stringsSet){
            if (Collections.frequency(stringsList,chars)>1){
                result=result+chars+",";
            }
        }
        return result.substring(0,result.length()-1);
    }
}