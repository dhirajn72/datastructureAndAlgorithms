package interview;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 16/01/19
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={8,3,6,1,5,7,2};
        System.out.println(Arrays.toString(arr));
        SelectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr) {
        int min,temp;
        for (int i=0;i<arr.length;i++){
            min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min])
                    min=j;
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}
