package com.karumanchi;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 05/07/19
 */
public class FindingOfSpans {
    public static void main(String[] args) {
        int[] arr = {6, 3, 4, 5, 2,1,5,7,9,2,3};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(findingSpans(arr)));
    }
    public static int[] findingSpans(int[] arr){
        int[] spans=new int[arr.length];
        Stack<Integer> s= new Stack<>();
        int p=0;
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[i]>arr[s.peek()])
                s.pop();
            if (s.isEmpty())
                p = -1;
            else
                p = s.peek();
            spans[i]=i-p;
            s.push(i);
        }
        return spans;
    }


}
