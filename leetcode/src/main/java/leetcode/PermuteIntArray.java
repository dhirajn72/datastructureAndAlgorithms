package leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 17/08/19
 */
public class PermuteIntArray {
    public static void main(String[] args) {
        //_permutation(new int[]{1, 2, 3}, 0);
        _permutation("ABC");
    }

    private static void _permutation(String str) {
        _permutation("", str);
    }

    private static void _permutation(String prefix, String str) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else
            for (int i = 0; i < str.length(); i++)
                _permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()));
    }


    private static void _permutation(int[] arr, int i) {
        if (i == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        } else {
            for (int j = i; j < arr.length; j++) {
                swap(arr, i, j);
                _permutation(arr, i + 1);
                swap(arr, i, j);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
