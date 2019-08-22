package com.java.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Dhiraj
 * @date 17/06/19
 */
public class DivideArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 6, 7, 8, 9, 10}; // [10,9,8,1]::[2,3,4,6,6,7]
        divideInEqualSum(arr);

    }

    private static void divideInEqualSum(int[] arr) {
        int[] leftArray = new int[arr.length];
        int leftCount = 0;
        int[] rightArray = new int[arr.length];
        int rightCount = 0;

        int totalSum = 0;
        for (int i : arr)
            totalSum += i;
        int half = totalSum / 2;
        int[] ints=new int[128];
        for (int i:arr)
            ints[i]=i;

        totalSum=0;
        for (int i=0;i<arr.length;i++){
            if (totalSum!=0) {
                totalSum += arr[i];
                leftArray[arr[i]]=arr[i];
                if (totalSum<half){
                    int target=half-totalSum;
                    if (ints[target]+totalSum==half){
                        leftArray[ints[target]]=ints[target];
                        System.out.println("Found "+(ints[target]+totalSum));
                        break;
                    }
                }
                if (totalSum>half){
                    totalSum-=arr[i];
                    leftArray[totalSum-=arr[i]]=0;
                }
            }
            if(totalSum==0){
                totalSum+=arr[i];
                leftArray[arr[i]]=arr[i];
            }
        }
        System.out.println(Arrays.toString(leftArray));
        totalSum=0;
        for (int i:leftArray)
            totalSum+=i;
        System.out.println(totalSum);
    }
}
