package com.java.search;

/**
 * @author Dhiraj
 * @date 11/03/19
 */
public class BinarySearch_1 {
    public static void main(String[] args) {
        int[] arr={10,21,32,44,56,62,71,87,96,107};
        System.out.println(search(arr,0,arr.length-1,99));
    }

    private static int search(int[] arr, int low,int high,int data) {
        int mid=(low+high)/2;

        if (data==arr[mid]) {
            return mid + 1;
        }
        else if (mid==high && mid==low && arr[mid]!=data){
            System.out.println("Element Not available in array !");
            return -1;
        }
        else if (data>arr[mid])
            return search(arr,mid+1,high,data);
        else  return search(arr,low,mid-1,data);

    }
}
