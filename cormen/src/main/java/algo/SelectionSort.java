package algo;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 08/03/19
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,3,9,4,7,1,2};
        selectionSort(arr);
    }
    private static void selectionSort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int key=0;
        for (int j=1;j<arr.length;j++){
            key=arr[j];
            int i=j-1;
            while (i>=0 && arr[i]>key){
                arr[i+1]=arr[i];
                i=i-1;
            }
            arr[i+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
