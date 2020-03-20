package com.leetcode;

/**
 * @author Dhiraj
 * @date 20/07/19
 */
public class PermutationsOfNumbers {

    public static void main(String[] args) {
        _permutation("ABC");
    }

    private static void _permutation(String str) {
        _permutation("",str);
    }

    private static void _permutation(String prefix, String str) {
        if (str.length()==0)
            System.out.println(prefix);
        else
            for (int i = 0; i < str.length(); i++)
                _permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,str.length()));
    }
   /* public List<List<Integer>> permute(int[] nums) {

        return null;
    }*/

}
