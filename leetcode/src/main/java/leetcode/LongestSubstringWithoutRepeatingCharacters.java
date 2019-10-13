package leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 17/08/19
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        //String s="abcabcbb";
        //String s="pwwkew";
        //String s="aab";
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String str) {
        if (str==null||str.length()==0)return 0;
        int[] arr=new int[128];
        char[] chars=str.toCharArray();
        int index=0;
        int max=0;
        for (int i=index;i<chars.length;i++){
            if (arr[chars[i]]!=0){
                int count=0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j]!=0)
                        count++;
                }
                max=Math.max(max,count);
                Arrays.fill(arr,0);
                i=index++;
            }
            else {
                arr[chars[i]]=chars[i];
            }

        }
        int count=0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=0)
                count++;
        }
        max=Math.max(max,count);
        return max;
    }
        /*if (null==str||"".equals(str))return 0;
        int[] ints= new int[128];
        String max="";
        int index=0;
        for (int i=index;i<str.length();i++){
            if (ints[str.charAt(i)]!=0){
                String s="";
                for (int j=0;j<ints.length;j++){
                    if (ints[j]>0) {
                        char c = (char) ints[j];
                        s += c;
                    }
                }
                if (s.length()>max.length())max=s;
                Arrays.fill(ints,0);
                i=index++;
            }else {
                ints[str.charAt(i)]=str.charAt(i);
            }
        }
        String s="";
        for (int j=0;j<ints.length;j++){
            if (ints[j]>0) {
                char c = (char) ints[j];
                s += c;
            }
            if (s.length()>max.length())max=s;
        }
        return max.length();
    }*/
}
