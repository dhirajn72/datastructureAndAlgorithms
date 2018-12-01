package com.java.selection;

import com.java.sort.client.DataUtils;

/**
 * @author Dhiraj
 * @date 11/11/18
 */
public class TestClass3 {
    public static void sort(int[] arr){
        int min,temp;
        for (int i=0;i<arr.length;i++){
            min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]){ // j is only for condition check
                    min=j;
                }
                temp=arr[i]; // don't use j for swapping
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= DataUtils.getIntArray();
        sort(arr);
        DataUtils.print(arr);
    }
}
