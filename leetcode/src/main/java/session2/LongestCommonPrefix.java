package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 23/08/19
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        /*
Input: ["flower","flow","flight"]
Output: "fl"
         */

        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }



    public static String longestCommonPrefix(String[] strs) {
        if (strs==null||strs.length==0)return null;
        Arrays.sort(strs);
        int i=strs[0].length();
        int j=strs[strs.length-1].length();
        int minLen=Math.min(i,j);
        int k=0;
        while (k<minLen && strs[0].charAt(k)==strs[strs.length-1].charAt(k))
            k++;

        String s="";
        for (int l = 0; l <k ; l++)
            s+=strs[0].charAt(l);
        return s;
    }
}
