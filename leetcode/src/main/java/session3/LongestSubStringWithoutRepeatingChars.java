package session3;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 10/11/19
 */
public class LongestSubStringWithoutRepeatingChars {

    public static void main(String[] args) {
        String s="jbpnbwwd";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        if (s==null||s.length()==0)return 0;
        if (s.length()==1)return 1;
        int[] arr=new int[130];
        int i=0;
        int max=Integer.MIN_VALUE;
        while (i<s.length()){
            for (int j = i; j < s.length(); j++) {
                if (arr[s.charAt(j)]!=0){
                    int count=0;
                    for (int k = 0; k <arr.length ; k++) {
                        if (arr[k]!=0)
                            count++;
                    }
                    max=Math.max(max,count);
                    Arrays.fill(arr,0);
                    break;
                }
                else {
                    arr[s.charAt(j)] = s.charAt(j);
                }
            }
            i++;
        }
        return max;
    }
}
