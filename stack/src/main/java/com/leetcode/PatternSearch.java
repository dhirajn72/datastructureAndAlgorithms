package com.leetcode;

/**
 * @author Dhiraj
 * @date 19/07/19
 */
public class PatternSearch {
    public static void main(String[] args) {
        System.out.println(indexOf("Hello","ll"));

    }

    private static int indexOf(String str, String pattern) {
        String s="";
        boolean flag=false;
        for (int i=0;i<str.length();i++){
            for (int j=i;j<str.length();j++){
                s+=str.charAt(j);
                if (s.equalsIgnoreCase(pattern)){
                    System.out.println("found the index::"+i);
                    return i;
                }
            }
            s="";
        }
        return -1;
    }
}
