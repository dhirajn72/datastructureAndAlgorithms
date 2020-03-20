package session2;

import java.util.*;

/**
 * @author Dhiraj
 * @date 16/10/19
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] s={"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(s));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs==null )return new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        for (String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String res="";
            for (char c:arr)
                res+=String.valueOf(c);
            if (map.containsKey(res))
                map.get(res).add(s);
            else {
                List<String> l=new ArrayList<>();
                l.add(s);
                map.put(res, l);
            }
        }
        return new ArrayList<>(map.values());
    }
}
