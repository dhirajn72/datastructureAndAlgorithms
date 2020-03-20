package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 28/06/19
 */
public class LongestNonRepeatingSubString {
    public static void main(String[] args) {
        //String str="aabcabcbb";
        //String str="abc";
        //String str="bbbbb";
        String str="jschniwubhcuhhhwbbkjwqhuwbchnckjsncjcdbbb";
        //String str="mynameistechleadandiamthetechlead";
        //String str="mynameistechleadandiamthetechlead";
        //String str="iamthetopcoder";
        //String str="pwwkew";
        System.out.println(findMaxNonRepeatingSubStringLength(str));
    }

    private static int findMaxNonRepeatingSubStringLength(String str) {
        if (null==str||"".equals(str))return 0;
        int[] ints= new int[128];
        String max="";
        int index=0;
        for (int i=index;i<str.length();i++){
            if (ints[str.charAt(i)]!=0){
                String s="";
                for (int j=0;j<ints.length;j++){
                    if (ints[j]>0) {
                        char c = (char) ints[j];
                        s += c;
                    }
                }
                if (s.length()>max.length())max=s;
                for (int j=0;j<ints.length;j++)ints[j]=0; // reseting the array
                i=index++; // incerenting from the next element of string
            }else {
                ints[str.charAt(i)]=str.charAt(i);
            }
        }
        String s="";
        for (int j=0;j<ints.length;j++){
            if (ints[j]>0) {
                char c = (char) ints[j];
                s += c;
            }
            if (s.length()>max.length())max=s;
        }
        return max.length();
    }
}
