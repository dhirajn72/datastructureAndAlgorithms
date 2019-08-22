package com.leetcode;

import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * @author Dhiraj
 * @date 12/07/19
 */
public class FilterSubset {

    private static HashSet<String> allSubsets = new HashSet<>();
    private static final String token = " ";

    public static void findTargetSumSubsets(int[] input, int target, String ramp, int index) {

        if(index > (input.length - 1)) {
            if(getSum(ramp) == target) {
                allSubsets.add(ramp);
            }
            return;
        }
        findTargetSumSubsets(input, target, ramp + input[index] + token, index + 1);
        findTargetSumSubsets(input, target, ramp, index + 1);
    }
    private static int getSum(String intString) {
        int sum = 0;
        StringTokenizer sTokens = new StringTokenizer(intString, token);
        while (sTokens.hasMoreElements()) {
            sum += Integer.parseInt((String) sTokens.nextElement());
        }
        return sum;
    }

    /**
     * Cracking it down here : )
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        int [] n ={3, 1, 2, 3,4}; // {24, 1, 15, 3, 4, 15, 3};
        int counter = 1;
        FilterSubset.findTargetSumSubsets(n, 8, "", 0);
        for (String str: allSubsets) {
            System.out.println(counter + ") " + str);
            counter++;
        }
    }
}
