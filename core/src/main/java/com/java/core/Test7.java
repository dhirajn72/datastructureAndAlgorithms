package com.java.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Dhiraj
 * @date 15/04/18
 */
public class Test7 {

    public static void main(String[] args) {

        //System.out.println(findCounts(2,10,15));
        System.out.println(findCounts(6,25,26));
       // System.out.println(findCounts(2,10,15));


    }

    /**
     *
     * TODO! Refactor me
     * @return
     */
    public static int findCounts(int x,int y, int z){
        if (y>z ){
            return 0;// In Real time we can throw valid exception
        }
        if (y<0 || z <0){
            return 0;
        }
        if(x==0){
            return 0;
        }
        List<Integer> integers= new ArrayList<>();
        for(int i=y ;i<=z;i++){
            integers.add(i);
        }
        System.out.println(integers);
        Set<Integer> integers1= new HashSet<>();
        for (Integer x1:integers){
            int n=x1*x;
            String tempStr=String.valueOf(n);
            for (int i=0,j=i+1;i<tempStr.length() && j<tempStr.length();i++){
                    if (String.valueOf(x1).contains(String.valueOf(tempStr.charAt(i))) || String.valueOf(x1).contains(String.valueOf(tempStr.charAt(j))) ){
                        break;
                    }
                    else {
                        integers1.add(x1);
                    }
            }
        }
        return integers1.size();
    }
}
