package cci;

import com.java.utils.DataUtils;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 27/06/19
 */
public class MergeSort {
    public static void _sort(int[] arr){
        _sort(arr,0,arr.length-1);
    }

    private static void _sort(int[] arr, int low, int high) {
        if (low<high){
            int mid= (low+high)/2;
            _sort(arr,low,mid);
            _sort(arr,mid+1,high);
            _merge(arr,low,mid,high);
        }

    }

    private static void _merge(int[] arr, int low, int mid, int high) {
        int n1=mid-low+1;
        int n2=high-mid;

        int[] leftArray=new int[n1];
        int[] rightArray=new int[n2];

        for (int i=0;i<n1;i++)
            leftArray[i]=arr[low+i];
        for (int i=0;i<n2;i++)
            rightArray[i]=arr[mid+1+i];

        int i=0,j=0;
        int k=low;
        while (i < n1 && j< n2){
            if (leftArray[i]<=rightArray[j]){
                arr[k]=leftArray[i];
                i++;
            }
            else {
                arr[k]=rightArray[j];
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

    public static void main(String[] args) {
       int[] arr= DataUtils.getUnorderedArray();
        System.out.println(Arrays.toString(arr));
        _sort(arr);
        System.out.println(Arrays.toString(arr));

    }


}
