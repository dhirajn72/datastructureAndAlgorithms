package com.leetcode;

import java.util.*;

/**
 * @author Dhiraj
 * @date 16/07/19
 */
public class ContainsDupicates {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4,5,6,3,4,7}));
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        System.out.println();
        _printZigZag(arr);
    }

    private static void  _printZigZag(int[][] arr) {
        Stack<Integer> s= new Stack<>();
        Queue<Integer> q= new LinkedList<>();
        boolean flag=true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                if (flag){
                    q.offer(arr[i][j]);
                }
                else {
                    s.push(arr[i][j]);
                }
            }
            if (flag){
                while (!q.isEmpty())
                    System.out.print(q.poll()+", ");
                System.out.println();
                q.clear();
                flag=false;
            }
            else {
                while (!s.isEmpty())
                    System.out.print(s.pop()+", ");
                System.out.println();
                s.clear();
                flag=true;
            }
        }
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> integerSet= new HashSet<>();
        for (int i:nums)
            if (!integerSet.contains(i))
                integerSet.add(i);
            else
                return true;
        return false;
    }
}
