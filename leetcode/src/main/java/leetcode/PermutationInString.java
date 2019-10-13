package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 17/08/19
 */
public class PermutationInString {


    public static void main(String[] args) {
        //System.out.println(checkInclusion("prosperity", "properties"));
        //System.out.println(checkInclusion("prosperity", "properties"));
        System.out.println(checkInclusion("cba", "dabc"));

    }

    private static boolean checkInclusion(String s1, String s2) {
        if (s2 == null || s2.length() == 0) {
            return s2.equals(s1);
        }
        if (s1.length() > s2.length()) {
            return false;
        }
        Map<Character, Integer> s1map = charCount(s1);
        int lenDiff = s2.length() - s1.length();
        for (int i = 0; i <= lenDiff; i++) {
            String sub = s2.substring(i, i + s1.length());
            Map<Character, Integer> s2map = charCount(sub);
            if (mapCompare(s1map, s2map)) {
                return true;
            }
        }
        return false;
    }

    public static Map<Character, Integer> charCount(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        return map;
    }

    public static boolean mapCompare(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        for (Character ch : map1.keySet()) {
            if (map1.get(ch) - map2.getOrDefault(ch, -1) != 0) {
                return false;
            }
        }
        return true;

    }
}
