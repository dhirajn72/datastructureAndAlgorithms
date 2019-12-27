package session3;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 10/11/19
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs==null)return null;
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int minLength=Math.min(first.length(),last.length());
        int i=0;
        String res="";
        while (i<minLength && first.charAt(i)==last.charAt(i)) {
            res+=first.charAt(i);
            i++;
        }
        return res;
    }
}
