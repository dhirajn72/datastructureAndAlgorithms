package com.leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 27/07/19
 */
public class DailyTemperature {

    public static void main(String[] args) {
        int[] arr={55,38,53,81,61,93,97,32,43,78};
        System.out.println(Arrays.toString(dailyTemperatures(arr)));
    }
    public static int[] dailyTemperatures(int[] arr) {
        int[] res=new int[arr.length];
        int index=0;
        Stack<Integer> indexes=new Stack<>();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i==j)continue;
                if (arr[j]>arr[i]) {
                    indexes.push(j);break;
                }
            }
            if (!indexes.isEmpty())
                res[index++]=indexes.pop()-i;
            else {
                res[index++]=0;
            }

        }
        return res;
    }
}
