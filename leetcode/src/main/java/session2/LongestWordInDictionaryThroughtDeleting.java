package session2;

import java.util.*;

/**
 * @author Dhiraj
 * @date 21/09/19
 */
public class LongestWordInDictionaryThroughtDeleting {
    public static void main(String[] args) {
        //s = "abpcplea", d = ["ale","apple","monkey","plea"]
        // "abpcplea" ["a","b","c"]
        List<String> d=new ArrayList<>();
        d.add("ale");
        d.add("apple");
        d.add("monkey");
        d.add("plea");
        /*d.add("a");
        d.add("b");
        d.add("c");*/
        System.out.println(findLongestWord("abpcplea",d));

    }
    public static String findLongestWord(String s, List<String> d) {
        if (s == null) return "";
        if (s.length() == 0) return "";
        if (d.size() == 0) return "";

        Map<Character,Character> map=new HashMap<>();
        for (char c:s.toCharArray())
            map.put(c,c);

        Collections.sort(d,Collections.reverseOrder());
        String result="";
        int max=Integer.MIN_VALUE;
        for (String s1:d){
            char[] chars=s1.toCharArray();
            String v="";
            boolean flag=true;
            for (int i = 0; i < chars.length; i++) {
                if (!map.containsKey(chars[i])){
                    flag=false;
                }
                if (!flag)break;
                v+=chars[i]+"";
            }
            if (flag){
                result=result.length()>v.length()?result:v;
            }
        }
        return result;
    }
}
