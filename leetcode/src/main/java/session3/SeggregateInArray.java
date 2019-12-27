package session3;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 15/12/19
 */
public class SeggregateInArray {

    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 1, 2, 1, 1, 0, 0, 2, 1, 2};
        segregate(arr);

    }

    public static void segregate(int[] arr) {
        if (arr == null) return;

        int oneCount = 0;
        int zeroCount = 0;
        for (int i : arr) {
            if (i == 0)
                zeroCount++;
            if (i == 1)
                oneCount++;
        }

        for (int i = 0; i < zeroCount; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < oneCount; i++) {
            arr[zeroCount++] = 1;
        }
        for (int i = zeroCount; i < arr.length; i++) {
            arr[zeroCount++] = 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
