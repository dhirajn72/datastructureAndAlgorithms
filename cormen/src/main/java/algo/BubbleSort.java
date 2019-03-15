package algo;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 10/03/19
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,1,3,6,2};
        sort(arr);
    }

    private static void sort(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
