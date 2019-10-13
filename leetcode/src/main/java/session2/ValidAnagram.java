package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 21/09/19
 */
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagawram"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s==null||t==null)return false;
        if (s==null&&t!=null)return false;
        if (s!=null && t==null)return false;
        if (s.length()!=t.length())return false;

        char[] sChar=s.toCharArray();
        char[] tChar=t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        int i=0;
        while (i<sChar.length){
            if (sChar[i]!=tChar[i])return false;
            i++;
        }
        return true;

    }
}
