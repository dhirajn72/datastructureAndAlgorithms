package session3;

import leetcode.ListNode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 28/01/20
 */
public class SortList {
    public ListNode sortList(ListNode head) {

        return null;
    }

    public static void sort(int[] arr){
        sort(arr,0,arr.length-1);

    }


    public static void main(String[] args) {
        int[] arr={7,1,2,3,7,9,5,4,6};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int low, int high){
        if (low<high){
            int mid=(high+low)/2;
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }

    }
    public static void sort(ListNode[] arr,int low, int high){
        if (low<high){
            int mid=(high+low)/2;
            sort(arr,low,mid);
            sort(arr,mid+1,high);
           // merge(arr,low,mid,high);
        }

    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int n1=mid-low+1;
        int n2=high-mid;

        int[] leftArray=new int[n1];
        int[] rightArray=new int[n2];
        for (int i = 0; i < n1; i++) {
            leftArray[i]=arr[low+i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j]=arr[mid+1+j];
        }

        int i=0,j=0;
        int k=low;
        while (i<n1 && j<n2){
            if (leftArray[i]<=rightArray[j]) {
                arr[k]=leftArray[i];
                i++;
            }
            else {
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
