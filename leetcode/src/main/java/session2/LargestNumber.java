package session2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Dhiraj
 * @date 21/09/19
 */
public class LargestNumber {
    public static void main(String[] args) {
        int[] arr={0,0,0,0};
        System.out.println(largestNumber(arr));
    }

    public static String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        //Handles:: [0,0,0,0] case, keep on deleting until 1 char is left
        while (sb.charAt(0) == '0' && sb.length() > 1)
            sb.deleteCharAt(0);

        return sb.toString();
    }
}
