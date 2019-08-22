package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 10/08/19
 */
public class SlidingWindowMaximum {
    public static void main(String[] args) {

        /*int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k=3;*/

        /*int[] arr = {1, -1};
        int k=1;*/

        int[] arr = {7,2,4};
        int k=2;
        System.out.println(Arrays.toString(maxSlidingWindow(arr, k)));
    }
    public static int[] maxSlidingWindow(int[] arr, int k) {
        if (arr == null || arr.length == 0) return new int[]{};
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= arr.length - k; i++) {
            for (int j = 0; j < k; j++) {
                if (k==1){
                    max=arr[i];
                }
                else if (arr[i+j]>max)
                    max=arr[i+j];
            }
            list.add(max);
            max = Integer.MIN_VALUE;
        }
        int[] result = new int[list.size()];
        int index = 0;
        for (int e : list)
            result[index++] = e;
        return result;
    }
}
