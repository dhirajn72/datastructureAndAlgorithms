package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Dhiraj
 * @date 28/07/19
 */
public class FindAllAnagramInString {
    public static void main(String[] args) {

        String s=  "abab";//"cbaebabacd";
        String p="ab"; //"abc";

        s="acdcaeccde";
        p="c";
        System.out.println(findAnagrams(s,p));
    }













    public  static List<Integer> findAnagrams(String s, String p) {
        if (s!=null && p!=null && s.length()<p.length())return new ArrayList<>();
        Set<Integer> indexes = new HashSet<>();
        if (p.length()<5) {
            List<String> permutations = _permutation(p);
            System.out.println(permutations);

            for (String anagram : permutations) {
                if (s.contains(anagram)) {
                    int index = s.indexOf(anagram);
                    indexes.add(index);
                    int startIndex = index;
                    int endIndex = s.length();
                    while (startIndex < endIndex) {
                        index = s.indexOf(anagram, startIndex);
                        if (index != -1) {
                            indexes.add(index);
                            startIndex = index;
                        }
                        startIndex++;
                    }
                }
            }
        }
        else {
            int index = s.indexOf(p);
            int startIndex = index;
            int endIndex = s.length();
            while (startIndex < endIndex) {
                index = s.indexOf(p, startIndex);
                if (index != -1) {
                    indexes.add(index);
                    startIndex = index;
                }
                startIndex++;
            }

        }
        return new ArrayList<>(indexes);
    }

    private  static List<String> _permutation(String str) {
        return _permutation("",str,new ArrayList<String>());
    }

    private static List<String> _permutation(String prefix, String str, ArrayList<String> strings) {
        if (str.length()==0)
           strings.add(prefix);
        else
            for (int i = 0; i < str.length(); i++)
                _permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,str.length()),strings);
        return strings;

    }
}
