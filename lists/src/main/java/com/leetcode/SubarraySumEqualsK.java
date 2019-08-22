package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 28/07/19
 */
public class SubarraySumEqualsK {
    public static void main(String[] args) {
       // int[] arr= {1,2,3,5,4,3};
        int[] arr={1,1,1};

        subarraySum(arr,2);

    }

    public static int subarraySum(int[] nums, int k) {
        List<Integer> integers=new ArrayList<>();
        for (int i:nums)
            integers.add(i);
        _findSum(integers,k,new ArrayList<Integer>());

        return 0;
    }

    private static void _findSum(List<Integer> numbers, int target, ArrayList<Integer> partial) {
        int sum=0;
        for (int i:partial)
            sum+=i;
        if (target==sum)
            System.out.println(partial);
        if (sum>target)return;
        for (int i = 0; i <numbers.size() ; i++) {
            ArrayList<Integer> remaining= new ArrayList<>();
            int n=numbers.get(i);
            for (int j = i+1; j < numbers.size(); j++) {
                if (n==numbers.get(j))
                    remaining.add(numbers.get(j));
            }
            ArrayList<Integer> partial_res=new ArrayList<>(partial);
            partial_res.add(n);
            _findSum(remaining,target,partial_res);
        }
    }
}
