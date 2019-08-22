package interview;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 24/07/19
 */
public class LongestPrefix {
    public static void main(String[] args) {

        String[] strings={"flower","flow","flight"};
        longestCommonPrefix(strings);
    }
    public static String longestCommonPrefix(String[] strs) {
        System.out.println(Arrays.toString(strs));
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        return null;
    }

}
