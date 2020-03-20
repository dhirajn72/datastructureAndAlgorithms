package com.java.core.LTI.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 27/04/18
 */
public class DateEnum {
    public static void main(String[] args) {

        Map<String,String> datesMapped=new HashMap<>();
        datesMapped.put("1st","01");
        datesMapped.put("2nd","02");
        datesMapped.put("3rd","03");
        datesMapped.put("4th","04");
        datesMapped.put("5th","05");
        datesMapped.put("6th","06");
        datesMapped.put("7th","07");
        datesMapped.put("8th","08");
        datesMapped.put("9th","09");
        datesMapped.put("10th","10");
        datesMapped.put("11th","11");
        datesMapped.put("12th","12");
        datesMapped.put("13th","13");
        datesMapped.put("14th","14");
        datesMapped.put("15th","15");
        datesMapped.put("16th","16");
        datesMapped.put("17th","17");
        datesMapped.put("18th","18");
        datesMapped.put("19th","19");
        datesMapped.put("20th","20");
        datesMapped.put("21th","21");
        datesMapped.put("22th","22");
        datesMapped.put("23th","23");
        datesMapped.put("24th","24");
        datesMapped.put("25th","25");
        datesMapped.put("26th","26");
        datesMapped.put("27th","27");
        datesMapped.put("28th","28");
        datesMapped.put("29th","29");
        datesMapped.put("30th","30");
        datesMapped.put("31th","31");

        Map<String,String> monthsMapped=new HashMap<>();
        monthsMapped.put("Jan","01");
        monthsMapped.put("Feb","02");
        monthsMapped.put("Mar","03");
        monthsMapped.put("Apr","04");
        monthsMapped.put("May","05");
        monthsMapped.put("Jun","06");
        monthsMapped.put("Jul","07");
        monthsMapped.put("Aug","08");
        monthsMapped.put("Sep","09");
        monthsMapped.put("Oct","10");
        monthsMapped.put("Nov","11");
        monthsMapped.put("Dec","12");


        String[] dateArr=new String[]{"20th Oct 2052",
                "6th Jun 1933",
                "26th May 1960",
                "20th Sep 1958",
                "16th Mar 2068",
                "25th May 1912",
                "16th Dec 2018"};

        for (String s:dateArr){
            /*StringTokenizer tok= new StringTokenizer(s," ");
            while (tok.hasMoreTokens()){
                System.out.println( datesMapped.get(tok.nextToken()));
            }*/
            String[] s1=s.split(" ");
            System.out.println(s1[2]+"-"+monthsMapped.get(s1[1])+"-"+datesMapped.get(s1[0]));

        }






    }
}
