package dynamicprogramming;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 31/07/19
 */
public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr));
        _rotateByK(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    private static void _rotateByK(int[] arr, int k) {
        while (k > 0) {
            for (int i = arr.length - 1; i > 0; i--) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            k--;
        }
    }
}
