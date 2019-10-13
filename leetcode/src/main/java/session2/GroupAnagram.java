package session2;

import java.util.*;

/**
 * @author Dhiraj
 * @date 27/08/19
 */
public class GroupAnagram {
    public static void main(String[] args) {
        String[] arr={"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(null));


    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs==null|| strs.length==0)return new ArrayList<>();
        Map<String,List<String>> stringListMap=new HashMap<>();
        for (String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String s1="";
            for (char c:ch)
                s1+=c+"";
            if (stringListMap.containsKey(s1)){
                stringListMap.get(s1).add(s);
            }
            else {
                List<String> list=new ArrayList<>();
                list.add(s);
                stringListMap.put(s1,list);
            }
        }
        System.out.println(stringListMap);
        return new ArrayList<>(stringListMap.values());
    }
}
