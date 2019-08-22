package com.leetcode;

import java.util.*;

/**
 * @author Dhiraj
 * @date 20/07/19
 */
public class GroupAnagram {
    public static void main(String[] args) {
        String[] arr={"eat", "tea", "tan", "ate", "nat", "bat"};
        /*Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/
        groupAnagrams(arr);

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,String> map= new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String s=strs[i];
            char[] cArray=s.toCharArray();
            Arrays.sort(cArray);
            s="";
            for (char c:cArray)
                s+=c;

        }
        return null;
    }
}
