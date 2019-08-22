package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 17/08/19
 */
public class PermutationInString_1 {


    public static void main(String[] args) {
        //System.out.println(checkInclusion("prosperity", "properties"));
        //System.out.println(checkInclusion("prosperity", "properties"));
        //System.out.println(checkInclusion("cba", "dabc"));
        //System.out.println(checkInclusion("abc","ccccbbbbaaaa"));
        System.out.println(checkInclusion("adc","dcda"));

    }

    private static boolean checkInclusion(String s1, String s2) {

        if (s1 == null && s2 == null) return true;
        if (s1 != null && s2 == null) return false;
        if (s1 == null && s2 != null) return false;
        if (s1.length() > s2.length()) return false;
        Map<Character, Integer> s1Map = charCount(s1);
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            String sub = s2.substring(i, i + s1.length());
            Map<Character, Integer> s2Map = charCount(sub);
            if (compareMap(s1Map, s2Map)) {
                return true;
            }
        }
        return false;
    }

    private static boolean compareMap(Map<Character, Integer> s1Map, Map<Character, Integer> s2Map) {
        for (Character key : s1Map.keySet()) {
            if (s1Map.get(key) - s2Map.getOrDefault(key, 0) != 0) {
                return false;
            }
        }
        return true;
    }

    private static Map<Character, Integer> charCount(String s1) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (characterIntegerMap.containsKey(s1.charAt(i))) {
                characterIntegerMap.put(s1.charAt(i), characterIntegerMap.get(s1.charAt(i))+1);
            } else
                characterIntegerMap.put(s1.charAt(i), 1);
        }
        return characterIntegerMap;
    }
}
