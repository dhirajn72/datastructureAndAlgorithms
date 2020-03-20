package com.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 10/07/19
 */
public class SumSet {
    //private static final Logger LOGGER= Logger.getLogger(SumSet.class);

    static void sum_up_recursive(List<Integer> numbers, int target, ArrayList<Integer> partial) {
        int s = 0;
        for (int x : partial)
            s += x;
        if (s == target)
            System.out.println(Arrays.toString(partial.toArray()) + "=" + target);
        if (s >= target)
            return;
        for (int i = 0; i < numbers.size(); i++) {
            ArrayList<Integer> remaining = new ArrayList<Integer>();
            int n = numbers.get(i);
            for (int j = i + 1; j < numbers.size(); j++) {
                remaining.add(numbers.get(j));
            }
            ArrayList<Integer> partial_rec = new ArrayList<Integer>(partial);
            partial_rec.add(n);
            sum_up_recursive(remaining, target, partial_rec);
        }
    }

    static void sum_up(List<Integer> numbers, int target) {
        sum_up_recursive(numbers, target, new ArrayList<Integer>());
    }

    public static void main(String args[]) {
        //Integer[] numbers = {3, 9, 8, 4, 5, 7, 10};
        Integer[] numbers = {3, 1,4,5,1,2};
        int target = 5;
        List<Integer> list=new ArrayList<Integer>(Arrays.asList(numbers));
        sum_up(list, target);
    }
}
