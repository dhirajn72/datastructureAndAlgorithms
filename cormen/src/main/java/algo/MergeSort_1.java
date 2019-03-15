package algo;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 09/03/19
 */
public class MergeSort_1 {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,1,3,6,2};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr,int left,int right) {
        if (left<right){
            int mid=(left+right)/2;
            sort(arr,left,mid);
            sort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1=mid-left+1;
        int n2=right-mid;

        int[] leftArray=new int[n1];
        int[] rightArray=new int[n2];

        for (int i=0;i<n1;i++)
            leftArray[i]=arr[left+i];
        for (int j=0;j<n2;j++)
            rightArray[j]=arr[mid+1+j];


        int i=0,j=0;
        int k=left;

        while (i<leftArray.length && j<rightArray.length){
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
        while (i<leftArray.length){
            arr[k]=leftArray[i];
            i++;
            k++;
        }
        while (j<rightArray.length){
            arr[k]=rightArray[j];
            j++;
            k++;
        }
    }
}
