package session2;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 21/09/19
 */
public class ReverseWordsInString {
    public static void main(String[] args) {
        String s="a good   example";//"  hello world!  ";//"the sky is blue";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        if (s==null)return s;

        String[] arr=s.split(" ");
        StringBuilder sb=new StringBuilder();
        /*for (int i = arr.length-1; i >=0 ; i--) {
            //sb.append(arr)

        }*/
        Stack<String> stack=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        String res="";
        while (!stack.isEmpty()){
            String s2=stack.pop();
            if (!s2.isEmpty())
                res+=s2+" ";
        }
        System.out.println("******");
        return res.trim();
    }
}
