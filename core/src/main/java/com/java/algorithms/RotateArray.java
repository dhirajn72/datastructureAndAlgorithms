package com.java.algorithms;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 16/07/19
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
       // _rotateClockWise(arr,1);
        _rotateAntiClockWise(arr,1);

        System.out.println(Arrays.toString(arr));


    }

    private static void _rotateClockWise(int[] arr,int n) {
        if (arr==null)return;
        while (n>0) {
            for (int i = arr.length - 1; i > 0; i--) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            n--;
        }
    }private static void _rotateAntiClockWise(int[] arr,int n) {
        if (arr==null)return;
      //  while (n>0) {
            for (int i = 0; i <arr.length-1; i++) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            n--;
      //  }
    }
}
