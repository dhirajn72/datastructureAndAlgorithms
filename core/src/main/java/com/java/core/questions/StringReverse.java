package com.java.core.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Dhiraj
 * @date 12/04/18
 */
public class StringReverse {
    public static void main(String[] args) {
        String str="I love programming so much";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String string){

        String[] arr=string.split(" ");
        //Below commented code works but, it uses built in utility methods !
        /*List<String> resultList=new ArrayList<String>();
        for(String str:arr){
            resultList.add(str);
        }
        Collections.reverse(resultList);
        String result="";
        for(String str:resultList){
            result=result+" "+str;
        }
        return result;*/
        return null;
    }
}
