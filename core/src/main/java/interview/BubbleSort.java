package interview;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 16/01/19
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={8,3,6,1,5,7,2};
        System.out.println(Arrays.toString(arr));
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        int temp=0;
        for (int i=arr.length-1;i>=0;i--){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
    }
}

