package com.leetcode;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 16/07/19
 */
public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1,2,3})));
        // [7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6]


        System.out.println(Arrays.toString(plusOne(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6})));

    }

    public static int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) return new int[]{};
        if (digits.length==1 && digits[0]==0)return new int[]{1};

        StringBuilder s = new StringBuilder();
        for (int i : digits) {
            s.append(i);
        }
        s = new StringBuilder(String.valueOf(new BigInteger(s.toString()).add(new BigInteger("1"))));
        int[] res = new int[s.length() ];
        for (int i = 0; i < s.length(); i++) {
            res[i] = Integer.valueOf(s.charAt(i) + "");
        }
        return res;
    }
}
