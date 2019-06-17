package com.java.stack;


import java.util.Stack;

/**
 * @author Dhiraj
 * @date 16/06/19
 */
public class LargestRectangleInHistogram {


    public static int largestRectangleInHistogram(int[] arr) {
        Stack<Integer> s = new Stack();
        int i = 0;
        int max = 0;
        while (i < arr.length) {
            if (s.isEmpty() || arr[s.peek()] <= arr[i])
                s.push(i++);
            else {
                int top = s.pop();
                max = Math.max(max, arr[top] * (s.isEmpty() ? i : i - s.peek() - 1));
            }
        }
        while (!s.isEmpty()) {
            int top = s.pop();
            max = Math.max(max, arr[top] * (s.isEmpty() ? i : i - s.peek() - 1));
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 2, 1, 5, 6}; // 10
        System.out.println(largestRectangleInHistogram(arr1));
        int[] arr2 = {2, 3, 4, 2, 1, 5, 6}; // 10
        System.out.println(largestRectangleInHistogram(arr2));
        int[] arr3 = {6, 2, 5, 4, 5, 1, 6}; // 12
        System.out.println(largestRectangleInHistogram(arr3));


    }

}
