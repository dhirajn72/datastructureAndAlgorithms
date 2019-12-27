package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 17/10/19
 */
public class ReverseRecursive {

    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
    }

    public static void reverseString(char[] s) {
        if (s==null)return;
        System.out.println(Arrays.toString(s));
        reverse(s,0,s.length-1);
        System.out.println(Arrays.toString(s));
    }

    public static void reverse(char[] s, int first,int last){
        if (first<last){
            char temp=s[first];
            s[first]=s[last];
            s[last]=temp;
            reverse(s,first+1,last-1);
        }
    }
}
