package com.leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 16/07/19
 */
public class IntersectionOfArray {
    public static void main(String[] args) {
        /*System.out.println(Arrays.toString(intersect(new int[]{1,2,3,4,5,6,7},new int[]{3,4,9})));
        System.out.println(Arrays.toString(intersect(new int[]{3,4,9},new int[]{1,2,3,4,5,6,7})));*/
        //System.out.println(Arrays.toString(intersect(new int[]{1,2},new int[]{1,1})));
        System.out.println(Arrays.toString(intersect(new int[]{2, 1}, new int[]{1, 2, 3})));


     /*   [3,1,2]
        [1,3]
*/

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] results = new int[Math.min(nums1.length, nums2.length)];
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0, writeIdx = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                results[writeIdx++] = nums1[i];
                ++i;
                ++j;
            } else if (nums1[i] < nums2[j])
                ++i;
            else
                ++j;
        }
        return Arrays.copyOf(results, writeIdx);
    }


/*
    public static int[] intersect(int[] nums1, int[] nums2) {
        Stack<Integer> s1= new Stack<>();
        Stack<Integer> s2=new Stack<>();
        for (int i=nums1.length-1;i>=0;i--)
            s1.push(nums1[i]);
        for (int i=nums2.length-1;i>=0;i--)
            s2.push(nums2[i]);
        Queue<Integer> integers= new LinkedList<>();
        if (nums1.length>nums2.length){
            _findIntersectingPoint(s1, s2, integers);
        }
        else if (nums1.length<nums2.length){
            _findIntersectingPoint(s2, s1, integers);
        }
        else {
            if (nums1.length==nums2.length) {
                Arrays.sort(nums1);
                Arrays.sort(nums2);
            }
            s1.clear();
            s2.clear();
            for (int i=nums1.length-1;i>=0;i--)
                s1.push(nums1[i]);
            for (int i=nums2.length-1;i>=0;i--)
                s2.push(nums2[i]);
            _equalsStack(s1, s2, integers);
            _equalsStack(s2, s1, integers);

        }
        int[] arr= new int[integers.size()];
        int index=0;
        for (int i:integers)
            arr[index++]=i;
        return arr;
    }

    public static void _equalsStack(Stack<Integer> s1, Stack<Integer> s2, Queue<Integer> integers) {
        while (!s1.isEmpty() && !s2.isEmpty() && s1.peek()!=s2.peek()){
            s1.pop();
        }
        while (!s1.isEmpty() && !s2.isEmpty() && s1.peek()==s2.peek()){
            integers.add(s1.pop());
            s2.pop();
        }
    }

    public static void _findIntersectingPoint(Stack<Integer> s1, Stack<Integer> s2, Queue<Integer> integers) {
        while (!s2.isEmpty()) {
            if (!s1.isEmpty() && s2.peek()!=s1.peek())
                    s1.pop();
            else {
                if (!s1.isEmpty() && !s2.isEmpty()) {
                    integers.add(s2.pop());
                    s1.pop();
                }
                if (s1.size()==0 || s2.size()==0)
                    break;
            }
        }
    }*/
}

