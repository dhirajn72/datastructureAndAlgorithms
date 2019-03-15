package algo;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 10/03/19
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,1,3,6,2};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int low, int high) {

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
            sort(arr,low,j);
        if (i<high)
            sort(arr,i,high);
    }
}
