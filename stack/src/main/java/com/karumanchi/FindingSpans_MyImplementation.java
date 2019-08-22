package com.karumanchi;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 05/07/19
 */
public class FindingSpans_MyImplementation {
    public static void main(String[] args) {
        int[] arr = {6, 3, 4, 5, 2};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(_findingSpans(arr)));
    }

    private static int[] _findingSpans(int[] arr) {
        int[] spans = new int[arr.length];
        int span=1;
        for (int i=0;i<arr.length;i++){
            if (i==0)
                spans[i]=span;
            else {
                span=0;
                for (int j=i;j>=0;j--){
                    if (arr[i]>=arr[j]){
                        span++;
                    }
                    else {
                        spans[i]=span;
                        span=0;
                        break;
                    }
                }
            }
        }
        return spans;
    }
}
