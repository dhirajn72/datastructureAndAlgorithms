package com.karumanchi;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 21/07/19
 */
public class FIndSpansForStocks {
    public static void main(String[] args) {
        int[] arr = {6, 3, 4, 5, 2}; // 1 1 2 3 1
        System.out.println(Arrays.toString(_findSpans(arr)));
     }

    private static int[] _findSpans(int[] arr) {
        if (arr == null) return null;
        else {
            int index=0;
            int[] result= new int[arr.length];
            int defaultSpan = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j=i;j>=0;j--){
                    if (arr[i]>=arr[j])
                        defaultSpan++;
                }
                result[index++]=defaultSpan;
                defaultSpan=0;
            }
            return result;
        }
    }
}
