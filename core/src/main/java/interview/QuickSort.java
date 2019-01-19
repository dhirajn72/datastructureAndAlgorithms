package interview;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 18/01/19
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr={4,6,3,8,1,5};
        quicksort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quicksort(int[] arr) {
        sort(arr,0,arr.length-1);
    }
    public static void sort(int[] arr,int low,int high){
        int i=low,j=high;
        int temp;
        int pivot=arr[(low+high)/2];
        while (i<=j){
            while (arr[i]<pivot)
                i++;
            while (arr[j]>pivot)
                j--;
            if (i<=j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        if (low<j)
            sort(arr,low,j);
        if (i<high)
            sort(arr,i,high);
    }
}
