package leetcode;

import java.util.HashMap;

/**
 * @author Dhiraj
 * @date 21/08/19
 */
public class MinimumWindowSubstring {
    public static void main(String[] args) {


    }

    public String minWindow(String s, String t) {
        HashMap<Character,Character> map= new HashMap<>();
        boolean flag=true;
        while (flag){
            int i=0;
            int j=s.length()-1;
            for (int k = 0; k < s.length(); k++) {
                map.put(s.charAt(k),s.charAt(k));
            }
            for (int k = 0; k < t.length(); k++) {
                if (map.get(t.charAt(k))==null){
                 break;
                }
            }
            flag=false;
        }
        return null;
    }

}
