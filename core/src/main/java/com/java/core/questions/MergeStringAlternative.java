package com.java.core.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Dhiraj
 * @date 12/04/18
 */

/**
 * Tremendous example of:
 * Given two strings S1 and S2 as input, the task is to merge them alternatively.
 *
 */
public class MergeStringAlternative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String a = in.next();
            String b = in.next();
            String result = mergeStringsAlternateChars(a, b);
            System.out.println(result);
        }
        in.close();
    }
    public static String mergeStringsAlternateChars(String str1,String str2){
        List<String> stringList1= new ArrayList<String>();
        List<String> stringList2= new ArrayList<String>();
        for (int i=0;i<str1.length();i++){
            stringList1.add(str1.charAt(i)+"");
        }
        for (int i=0;i<str2.length();i++){
            stringList2.add(str2.charAt(i)+"");
        }
        String result="";
        if (stringList1.size()>stringList2.size()){
            int sizeGap=stringList1.size()-stringList2.size();
            for (int i=0;i<stringList2.size();i++){
                result=result+stringList1.get(i)+stringList2.get(i);
            }
            for(int i=stringList1.size()-sizeGap;i<stringList1.size();i++){
                result=result+stringList1.get(i);
            }
        }
        else{
            int sizeGap=stringList2.size()-stringList1.size();
            for (int i=0;i<stringList1.size();i++){
                result=result+stringList1.get(i)+stringList2.get(i);
            }
            for(int i=stringList2.size()-sizeGap;i<stringList2.size();i++){
                result=result+stringList2.get(i);
            }
        }
        return result;
    }
}
