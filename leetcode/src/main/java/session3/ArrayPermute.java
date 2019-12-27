package session3;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 01/12/19
 */
public class ArrayPermute {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        _permute(arr);


    }

    private static void _permute(int[] arr) {
        _permute(arr,0);
    }

    private static void _permute(int[] arr, int i) {
        if (arr.length==i){
            System.out.println(Arrays.toString(arr));
        }
        else {
            for (int j = i; j < arr.length; j++) {
                _swap(arr,i,j);
                _permute(arr,i+1);
                _swap(arr,i,j);
            }
        }
    }

    private static void _swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
