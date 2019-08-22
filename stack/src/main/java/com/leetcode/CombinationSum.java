package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 20/07/19
 */
public class CombinationSum {
    public static void main(String[] args) {

        /*
Input: candidates = [2,3,6,7], target = 7,
A solution set is:
[
  [7],
  [2,2,3]
]
         */
        int[] ints= {2,3,6,7};
        System.out.println(combinationSum(ints,7));



    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> integers= new ArrayList<>();
        for (int i:candidates)
            integers.add(i);
        List<List<Integer>> list= new ArrayList<>();
        _combinationSum(integers,target,new ArrayList<>(),list);
        return list;
    }

    private static void _combinationSum(List<Integer> numbers, int target, ArrayList<Integer> partial,List<List<Integer>> list) {
        int sum=0;
        for (int x:partial)
            sum+=x;
        if (sum==target) {
            System.out.println(partial);
            list.add(new ArrayList<>(partial));
            return;
        }
        if (sum>target)
            return;
        for (int i=0;i<numbers.size();i++){
            ArrayList<Integer> remainings= new ArrayList<>();
            int n=numbers.get(i);
            for (int j = i; j < numbers.size(); j++) {
                remainings.add(numbers.get(j));
            }
            ArrayList<Integer> partial_res= new ArrayList<>(partial);
            partial_res.add(n);
            _combinationSum(remainings,target,partial_res,list);
        }
    }
}
