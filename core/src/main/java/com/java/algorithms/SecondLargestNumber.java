package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 23/06/19
 */
public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr={9,4,2,10,5,15,11,4}; // Second largest is: 10
        getSecondLargest(arr);
    }

    private static void getSecondLargest(int[] arr) {
        int largest=0,seconLargest=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>largest){
                seconLargest=largest;
                largest=arr[i];
            }
        }
        System.out.println("Second Largest is::"+seconLargest);
    }
}
