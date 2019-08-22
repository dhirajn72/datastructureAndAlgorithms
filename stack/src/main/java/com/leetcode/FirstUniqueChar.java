package com.leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 16/07/19
 */
public class FirstUniqueChar {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar(null));

    }

    public static int firstUniqChar(String s) {
        if (s==null||s.length()==0)return -1;
        int[] indexes=new int[255];
        for (int i=0;i<s.length();i++)
            indexes[s.charAt(i)]=++indexes[s.charAt(i)];

        for (int i=0;i<s.length();i++)
            if (indexes[s.charAt(i)]==1)return i;
        return -1;
    }
}
