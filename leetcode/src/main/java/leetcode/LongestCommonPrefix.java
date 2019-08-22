package leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 06/08/19
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] arr) {
        if (arr.length == 0)
            return "";
        if (arr.length == 1)
            return arr[0];
        Arrays.sort(arr);
        int min = Math.min(arr[0].length(), arr[arr.length - 1].length());
        int i = 0;
        while (i < min && arr[0].charAt(i) == arr[arr.length - 1].charAt(i))
            i++;

        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < i; j++) {
            builder.append(arr[0].charAt(j));
        }
        return builder.toString();
    }

    /* Driver Function to test other function */
    public static void main(String[] args) {
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println("The longest Common Prefix is : " + longestCommonPrefix(input));
    }
}
