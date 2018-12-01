package com.java.selection;

import com.java.sort.client.DataUtils;

/**
 * @author Dhiraj
 * @date 10/11/18
 */
public class TestClass2 {
    public static void sort(int[] arr){
        int min,temp;
        for (int i=0;i<arr.length-1;i++){
            min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min])
                    min=j;
                temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr=DataUtils.getIntArray();
        sort(arr);
        DataUtils.print(arr);
    }
}
