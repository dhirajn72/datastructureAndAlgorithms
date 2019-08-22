package leetcode;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 07/08/19
 */
public class ReverseWordsOfString {
    public static String reverseWords(String str) {
        String s = "";
        StringBuilder sb=new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i)!=' ')
                s += str.charAt(i);
            if (str.charAt(i) == ' ') {
                for (int j = s.length() - 1; j >= 0; j--) {
                    sb.append(s.charAt(j));
                }
                sb.append(' ');
                s = "";
            }
        }
        sb.append(s);
        return sb.toString();
    }

    public static String reverseWordsWithStack(String str) {
        String[] arr= str.split(" ");
        Stack<String> s= new Stack<>();
        for(String s1:arr)
            s.push(s1);
        StringBuilder sb=new StringBuilder();
        while (!s.isEmpty())
            sb.append(s.pop()).append(" ");
        return sb.toString().trim();
    }
}
