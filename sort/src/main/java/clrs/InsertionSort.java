package clrs;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 04/08/19
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={9,1,6,10,7,4,2};
        System.out.println(Arrays.toString(arr));
        _insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void _insertionSort(int[] arr) {
        int key,i;
        for (int j = 1; j <arr.length ; j++) {
            key=arr[j];
            i=j-1;
            while (i>=0 && arr[i]>key){
                arr[i+1]=arr[i];
                i=i-1;
            }
            arr[i+1]=key;
        }
    }
}
