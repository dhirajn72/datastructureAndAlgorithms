package com.java.search;

/**
 * @author Dhiraj
 * @date 11/06/19
 */
public class BinarySearch {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(search(arr,5));
            System.out.println(search(arr,8));

        }

    private static int  search(int[] arr,int key) {
            int low=0,high=arr.length-1;
            while (low<=high){
                int mid=low+(high-low)/2;
                if (arr[mid]==key){
                    System.out.println("Found at index: "+mid);
                    return mid;
                }
                else if (key<arr[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }
            return -1;
    }
}
