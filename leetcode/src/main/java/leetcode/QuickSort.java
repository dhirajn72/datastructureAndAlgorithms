package leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 08/08/19
 */
public class QuickSort {
    public static void _sort(int[] arr){
        _sort(arr,0,arr.length-1);
    }
    private static void _sort(int[] arr, int low, int high) {
        int i=low;
        int j=high;
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
            _sort(arr,low,j);
        if (i<high)
            _sort(arr,i,high);
    }

    public static void main(String[] args) {
        int[] arr1=new int[]{9,8,7,5,-1,6,6,3,1,4,5};
        System.out.println(Arrays.toString(arr1));
        _sort(arr1);
        System.out.println(Arrays.toString(arr1));

    }
}
