package com.leetcode;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author Dhiraj
 * @date 27/07/19
 */
public class NumberOfEquivalentDominos {
    public static void main(String[] args) {
        int[][] arr={{1,2},{2,1},{3,4},{2,1},{5,6}};
        System.out.println(numEquivDominoPairs(arr));
    }

    public static int numEquivDominoPairs(int[][] arr) {
        //System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i <arr.length ; i++) {
            Arrays.sort(arr[i]);
        }

        boolean flag=false;

        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (Objects.deepEquals(arr[i],arr[j])){
                    count++;
                }
            }
        }

       /* System.out.println(Arrays.deepToString(arr));
        System.out.println(count);*/
        return count;
    }
}
