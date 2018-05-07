package com.java.sort;

/**
 * @author Dhiraj
 * @date 06/05/18
 */
public class MergeSort {

    public void mergeSort(int[] arr, int[] temp,int left,int right){
        int mid;
        if (right>left) {
            mid = (right + left) / 2;
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid + 1, right);
            merge(arr, temp, left, mid + 1, right);
        }
    }

    private void merge(int[] arr, int[] temp, int left, int mid, int right) {

        int i,left_end,size,temp_pos;
        left_end=mid-1;
        temp_pos=left;
        size=right-left+1;

        while ((left<=left_end) && (mid<=right)){
            if (arr[left] <= arr[mid]){
                temp[temp_pos]=arr[left];
                temp_pos=temp_pos+1;
                left=left+1;
            }
            else {
                temp[temp_pos]=arr[mid];
                temp_pos=temp_pos+1;
                mid=mid+1;
            }
        }
        while (left<=left_end) {
            temp[temp_pos] = arr[left];
            left = left + 1;
            temp_pos = temp_pos + 1;
        }
        while (mid<=right) {
            temp[temp_pos] = arr[mid];
            mid = mid + 1;
            temp_pos = temp_pos + 1;
        }
        for (i=0;i<=size;i++){
            arr[right]=temp[right];
            right=right-1;
        }
    }


/*    void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public void sort(int arr[], int left, int right) {
        if (left < right) {
            int m = (left + right) / 2;
            sort(arr, left, m);
            sort(arr, m + 1, right);
            merge(arr, left, m, right);
        }
    }*/
}
