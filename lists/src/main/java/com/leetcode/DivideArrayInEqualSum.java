package com.leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 20/07/19
 */
public class DivideArrayInEqualSum {
    public static void main(String[] args) {
        int[] arr={5,6,7,4,3,2,1}; //
        _divideEqually(arr);

    }

    private static void _divideEqually(int[] arr) {
        ArrayList<Integer> list= new ArrayList();
        int sum=0;
        for (int i:arr) {
            list.add(i);
            sum+=i;
        }
        List<List<Integer>> list1= new ArrayList<>();
        _divideEqually(list,sum/2,new ArrayList<>(),list1);
        System.out.println("*****");
        System.out.println(list1);
    }
    private static  void _divideEqually(ArrayList<Integer> numbers, int target, ArrayList<Integer> partial,List<List<Integer>> list) {
        int sum=0;
        for (int x:partial)
            sum+=x;
        if (sum==target) {
            System.out.println(partial);
            list.add(partial);
            return;
        }
        if (sum>target)
            return;
        for (int i = 0; i <numbers.size() ; i++) {
            ArrayList<Integer> remaining=new ArrayList<>();
            int n=numbers.get(i);
            for (int j = i+1; j < numbers.size(); j++) {
                remaining.add(numbers.get(j));
            }
            ArrayList<Integer> partial_res= new ArrayList<>(partial);
            partial.add(n);
            _divideEqually(remaining,target,partial_res,list);
        }
    }
}
