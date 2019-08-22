package com.leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 27/07/19
 */
public class ShitZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        System.out.println(Arrays.toString(arr));
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void duplicateZeros(int[] arr) {
        String s = "";
        for (int i : arr)
            s += i;
        s = s.replaceAll("0", "00");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(s.charAt(i) + "");
        }
    }
}
