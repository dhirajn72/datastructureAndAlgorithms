package leetcode;

import java.util.*;

/**
 * @author Dhiraj
 * @date 21/08/19
 */
public class RemoveInvalidParentheses {
    public static void main(String[] args) {
        //String s= ")(";
        //String s= "n";

        String s="(a)())()(a)())()(a)())()(a)())()(a)())()";
        //String s="()())()";

        System.out.println(removeInvalidParentheses(s));

    }


    public static List<String> removeInvalidParentheses(String s) {
        String input=s;
        Set<String> results=new HashSet<>();
        for(int i=0;i<s.length();i++){
            StringBuilder sb=new StringBuilder(input);
            sb=sb.deleteCharAt(i);
            boolean res=_isValid(sb.toString());
            if(res)
                results.add(sb.toString());
        }
        if (results.size()==0){
            List<String> list=new ArrayList<>();
            //list.add(s);
            return list;
        }
        return new ArrayList<>(results);
    }
    public static boolean _isValid(String str){
        char[] ch=str.toCharArray();
        Stack<Character> s=new Stack<>();
        for(int i=0;i<ch.length;i++){
            if(ch[i]==')' && !s.isEmpty() && s.peek()=='(')
                s.pop();
            else if (ch[i]==']' && !s.isEmpty() && s.peek()=='[' )
                s.pop();
            else{
                if (!Character.isLetter(ch[i]) || !Character.isAlphabetic(ch[i]))
                s.push(ch[i]);
            }
        }
        return s.isEmpty();
    }
}
