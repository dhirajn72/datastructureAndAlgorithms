package leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 09/08/19
 */
public class LongestCommonPrefix_1 {
    public static void main(String[] args) {
        String[] arr={"flower","flown","flow","flw"};
        System.out.println(_longestCommonPrefix(arr));
    }
    private static String _longestCommonPrefix(String[] arr) {
        if (arr==null||arr.length==0)return null;
        if (arr.length==1)return arr[0];
        Arrays.sort(arr);
        String first=arr[0];
        String last=arr[arr.length-1];
        StringBuilder sb= new StringBuilder();
        int i=0;
        while (i<first.length()){
            if (first.charAt(i)==last.charAt(i)){
                sb.append(first.charAt(i));
            }
            else
                break;
            i++;
        }
        return sb.toString();
    }
}
