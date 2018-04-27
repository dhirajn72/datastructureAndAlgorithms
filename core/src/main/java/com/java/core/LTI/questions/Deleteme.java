package com.java.core.LTI.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 27/04/18
 */
public class Deleteme {
    public static void main(String[] args) {
        String s="I am using HackerRank to improve programming";
        String t="am HackerRank to improve";
        String[] tArr=t.split(" ");
        String[] sArr=s.split(" ");
        List<String> tList= Arrays.asList(tArr);
        List<String> sList=Arrays.asList(sArr);
        List<String> result=new ArrayList<>();
        sList.forEach(str ->{
            if (!tList.contains(str)){
                result.add(str);
            }
        });


        String[] res=new String[result.size()];
        for (int i=0;i<res.length;i++){
            res[i]=result.get(i);
        }
        String[] ar=new String[0];
        System.out.println(Arrays.toString(res));

    }
}
