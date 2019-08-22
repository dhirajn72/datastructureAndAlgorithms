package com.leetcode;

import java.util.*;

/**
 * @author Dhiraj
 * @date 17/07/19
 */
public class SubSetSumProblem {
    public static void main(String[] args) {
        Integer[] arr ={6,2,5,9,2,3,1,4};
        _subSet(arr,9);
    }

    private static void _subSet(Integer[] arr,int target) {
        List<Integer> list=  new ArrayList<Integer>(Arrays.asList(arr));
        _findSubset(list,target,new ArrayList<>());
        System.out.println("********");
    }

    private static void _findSubset(List<Integer>  numbers, int target, List<Integer> partial) {
        int sum=0;
        for (int s:partial)
            sum+=s;
        if (sum==target)System.out.println(partial);
        if (sum>target)return;
        for (int i=0;i<numbers.size();i++){
            ArrayList<Integer> remaining= new ArrayList<>();
            int first=numbers.get(i);
            for (int j = i+1; j < numbers.size(); j++) {
                remaining.add(numbers.get(j));
            }
            ArrayList<Integer> partialElemnt=new ArrayList<>(partial);
            partialElemnt.add(first);
            _findSubset(remaining,target,partialElemnt);
        }
    }


}
