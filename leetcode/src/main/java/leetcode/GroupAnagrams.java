package leetcode;

import java.util.*;

/**
 * @author Dhiraj
 * @date 20/08/19
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        //String[] arr={"eat", "tea", "tan", "ate", "nat", "bat"};
        //String[] arr={"eat"};
        String[] arr = {"", "", ""};


        System.out.println(groupAnagrams(arr));
    }

    /**
     * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
     * Output:
     * [
     * ["ate","eat","tea"],
     * ["nat","tan"],
     * ["bat"]
     * ]
     *
     * @param strs
     * @return
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> map = new HashMap<>();
        for (String s : strs) {
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String s1="";
            for (char c:ch)
                s1+=c+"";
            if (!map.containsKey(s1))
                map.put(s1,new ArrayList());
            map.get(s1).add(s);
        }
        return new ArrayList(map.values());
    }
}
