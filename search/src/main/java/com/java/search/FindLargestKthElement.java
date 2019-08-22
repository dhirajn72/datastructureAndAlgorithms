package com.java.search;

/**
 * @author Dhiraj
 * @date 14/07/19
 */
public class FindLargestKthElement {
    public static void main(String[] args) {

        System.out.println(_KthLargestValue(new int[]{4,3,2,9,8,7,6,5,7,6,5},3));

    }

    private static int _KthLargestValue(int[] arr,int k) {
        _quickSort(arr,0,arr.length-1);
        return arr[arr.length-k];
    }

    private static void _quickSort(int[] arr, int low, int high) {
        int i=low,j=high;
        int pivot=arr[(low+high)/2];
        while (i<=j){
            while (arr[i]<pivot)
                i++;
            while (arr[j]>pivot)
                j--;
            if (i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }

        if (low<j)
            _quickSort(arr,low,j);
        if (i<high)
            _quickSort(arr,i,high);
    }
}
