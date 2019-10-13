package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 22/08/19
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        //System.out.println(lengthOfLongestSubstring("pwwkew"));
        //System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("au"));
        //System.out.println(lengthOfLongestSubstring("dvdf"));



    }

    public static int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0)return 0;
        if(s.length()==1)return 1;
        int[] memo=new int[128];
        char[] chars=s.toCharArray();
        int maxLen=Integer.MIN_VALUE;
        int index=0;
        for ( int i = index; i < chars.length;i++) {
            if (memo[chars[i]]!=0){
                int charCount=0;
                for (int j = 0; j < memo.length; j++) {
                    if (memo[j] != 0)
                        charCount++;
                }
                maxLen=Math.max(maxLen,charCount);
                Arrays.fill(memo,0);
                i=index++;
            }
            else
                memo[chars[i]]=chars[i];
        }
        int charCount=0;
        for (int j = 0; j < memo.length; j++) {
            if (memo[j] > 0)
                ++charCount;
        }
        return Math.max(maxLen,charCount);
    }
}
