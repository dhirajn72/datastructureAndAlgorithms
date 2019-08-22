package com.karumanchi;

/**
 * @author Dhiraj
 * @date 21/07/19
 */
public class LargestHistogramInArray {
    public static void main(String[] args) {
        //int[] arr={2,3,4,2,1,5,6};
        int[] arr={6, 2, 5, 4, 5, 1, 6};
      System.out.println(_largestHistogram(arr));
    }
    private static int _largestHistogram(int[] arr) {
        int max=Integer.MIN_VALUE;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i]<=arr[j])
                    count++;
                else break;
            }
            for (int j = i-1; j >= 0; j--) {
                if (arr[i]<=arr[j])
                    count++;
                else break;
            }
            max=Math.max(max,arr[i]*count);
            count=0;
        }
        return max;
    }
}
