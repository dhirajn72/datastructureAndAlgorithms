package com.java.insertion;

import com.java.sort.client.DataUtils;

/**
 * @author Dhiraj
 * @date 10/11/18
 */
public class TestClass1 {
    public static  void sort(int[] arr){
        int temp;
        for (int i=1;i<arr.length;i++){
            for (int j=i;j>0;j--){
                if (arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr= DataUtils.getIntArray();
        sort(arr);
        DataUtils.print(arr);
    }
}
