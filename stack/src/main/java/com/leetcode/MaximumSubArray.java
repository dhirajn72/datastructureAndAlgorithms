package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 19/07/19
 */
public class MaximumSubArray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        //System.out.println(maxSubArray(new int[]{3, 1,4,5,1,2}));

    }
    public static int maxSubArray(int[] nums) {
        List<Integer> integers=new ArrayList<>();
        for (int e:nums)
            integers.add(new Integer(e));
        _maxSubArray(integers,Integer.MIN_VALUE,new ArrayList<Integer>());
        return 0;
    }
    private static void _maxSubArray(List<Integer> numbers, int max, ArrayList<Integer> partial) {
        int sum=0;
        for (int x:partial)
            sum+=x;
       /* if (sum==max)
            System.out.println(partial);*/
        if (sum>max) {
            System.out.println(partial);
            max=sum;
        }
        for (int i=0;i<numbers.size();i++){
            ArrayList<Integer> remaining= new ArrayList<>();
            int n=numbers.get(i);
            for (int j=i+1;j<numbers.size();j++){
                remaining.add(numbers.get(j));
            }
            ArrayList<Integer> partial_rec= new ArrayList<>(partial);
            partial_rec.add(n);
            _maxSubArray(remaining,max,partial_rec);
        }
    }
}
