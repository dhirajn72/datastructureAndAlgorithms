package session3;

import java.util.*;

/**
 * @author Dhiraj
 * @date 15/12/19
 */
public class GroupAnagram {

    public static void main(String[] args) {

        String[] arr={"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(arr));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs==null)
            return new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for (String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String key="";
            for (char c:arr)
                key=key +""+c;

            if (!map.containsKey(key)){
                map.put(key,new ArrayList<>());
                map.get(key).add(s);
            }
            else {
                map.get(key).add(s);
            }
        }
        return new ArrayList<>(map.values());
    }
}