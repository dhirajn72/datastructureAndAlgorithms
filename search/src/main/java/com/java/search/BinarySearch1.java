package com.java.search;

/**
 * @author Dhiraj
 * @date 14/11/18
 */
public class BinarySearch1 {

    public static int searchIterative(int[] arr, int data) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == data)
                return mid;
            else if (arr[mid] < data)
                low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static int searchRecursive(int[] arr, int low, int high, int data) {
        int mid = (low + high)/ 2;
        if (low <= high) {
            if (arr[mid] == data)
                return mid;
            else if (data > arr[mid] )
                return searchRecursive(arr, mid + 1, high, data);
            return
                    searchRecursive(arr, low, mid - 1, data);
        }
        return -1;

        /*if (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == data)
                return mid;
            if (arr[mid] > data)
                return searchRecursive(arr, low, mid - 1, data);
            return searchRecursive(arr, mid + 1, high, data);
        }
        return -1;*/
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //int index=searchIterative(arr,8);
        int index = searchRecursive(arr, 0, arr.length - 1, 3);
        System.out.println(index);
    }
}
