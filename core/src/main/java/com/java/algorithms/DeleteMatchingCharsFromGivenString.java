package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 28/06/19
 */
public class DeleteMatchingCharsFromGivenString {
    public static void main(String[] args) {
        String s1="dhiraj";
        String s2="kumar";
        deleteMatchingChars(s1,s2);
    }

    private static void deleteMatchingChars(String s1, String s2) {
        int[] ints=new  int[128];
        for (char c:s2.toCharArray())
            ints[c]=c;
        for (char c:s1.toCharArray())
            if (ints[c]!=0)
                ints[c]=0;
        StringBuilder builder= new StringBuilder();
        for (int i:ints){
            if (i!=0){
                builder.append((char)i);
            }
        }
        System.out.println("After removing matching characters:");
        System.out.println(builder);
    }
}
