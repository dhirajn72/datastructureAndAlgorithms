package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 27/07/19
 */
public class OccurrencesAfterBigram {

    public static void main(String[] args) {

        /*


        Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
Output: ["girl","student"]
         */
        String text = "alice is a good girl she is a good student";
        String f = "a";
        String s = "good";
        text="ypkk lnlqhmaohv lnlqhmaohv lnlqhmaohv ypkk ypkk ypkk ypkk ypkk ypkk lnlqhmaohv lnlqhmaohv lnlqhmaohv lnlqhmaohv ypkk ypkk ypkk lnlqhmaohv lnlqhmaohv ypkk";
        f="lnlqhmaohv";
        s="ypkk";


        System.out.println(Arrays.toString(findOcurrences(text, f, s))); // expected::  ["kcyxdfnoa","kcyxdfnoa","kcyxdfnoa"]
//[kcyxdfnoa, kcyxdfnoa]

    }


    public static String[] findOcurrences(String text, String first, String second) {
        String[] strings = text.split(" ");
        Stack<String> strStack = new Stack<>();
        List<String> list= new ArrayList<>();
        for (int i = strings.length - 1; i >= 0; i--)
            strStack.push(strings[i]);
        while (!strStack.isEmpty() && !strStack.peek().equals(first)) {
            strStack.pop();
        }
        int count = 1;
        while (!strStack.isEmpty()) {
            if (count == 3)
                break;
            count++;
            strStack.pop();
        }
        if ((!strStack.isEmpty()))
            list.add(strStack.pop());

        while (!strStack.isEmpty() && !strStack.peek().equals(second)) {
            strStack.pop();
        }
        while (!strStack.isEmpty()) {
            strStack.pop();
            if (!strStack.isEmpty()) {
                list.add(strStack.pop());
            }
            while (!strStack.isEmpty() && !strStack.peek().equals(second)) {
                strStack.pop();
            }
        }
        strings= new String[list.size()];
        int index=0;
        for (index=0;index<list.size();index++)
            strings[index]=list.get(index);
        return strings;
    }
}
