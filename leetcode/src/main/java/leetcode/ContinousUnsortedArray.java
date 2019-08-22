package leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 04/08/19
 */
public class ContinousUnsortedArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3, 3};
        System.out.println(findUnsortedSubarray(arr));
    }

    public static int findUnsortedSubarray(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        if (Arrays.equals(arr, arr2)) return 0;
        int i = 0, j = arr2.length - 1;
        while (i < j) {
            if (arr[i] == arr2[i] && arr[j] == arr2[j]) {
                i++;
                j--;
            } else if (arr[i] == arr2[i]) i++;
            else if (arr[j] == arr2[j]) j--;
            else break;
        }
        int count = 1;
        while (i != j) {
            count++;
            i++;
        }
        return count;
    }
}
