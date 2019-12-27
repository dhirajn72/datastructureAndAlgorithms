package session2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 13/10/19
 */
public class ThreeSum_1 {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }



    public  static  List<List<Integer>> threeSum(int[] arr) {
        if (arr == null) return new ArrayList<>();
        Arrays.sort(arr);
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < arr.length - 2; i++) {
            int first = arr[i];
            int start = i + 1;
            int end = arr.length - 1;
            while (start < end) {
                int second = arr[start];
                int third = arr[end];
                if (first + second + third == 0) {
                    List<Integer> integers = new ArrayList<>();
                    integers.add(first);
                    integers.add(second);
                    integers.add(third);
                    res.add(integers);
                }
                if (first + second + third > 0)
                    end = end - 1;
                else
                    start = start + 1;
            }
        }
        return new ArrayList<>(res);
    }
}
