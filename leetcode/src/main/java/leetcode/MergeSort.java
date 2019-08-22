package leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 06/08/19
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr= {6,5,2,4,1,6,9,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        sort(arr,0,arr.length-1);
    }

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            _merge(arr, low, mid, high);
        }
    }

    private static void _merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArray[i] = arr[low+i];
        for (int i = 0; i < n2; i++)
            rightArray[i] = arr[mid+1+i];

        int i = 0, j = 0;
        int k = low;

        while (i < n1 && j < n2) {
            if (leftArray[i] < rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            arr[k]=leftArray[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k]=rightArray[j];
            j++;
            k++;
        }
    }
}
