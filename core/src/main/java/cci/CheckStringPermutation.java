package cci;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 23/06/19
 */
public class CheckStringPermutation {
    public static void main(String[] args) {

        String s1="abc";
        String s2="bcaa";
        _checkPermutation(s1,s2);
        _checkPermutationAnotherWay(s1,s2);

    }

    private static void _checkPermutationAnotherWay(String s1, String s2) {
        char[] chars=s1.toCharArray();
        char[] chars1=s2.toCharArray();
        if (chars.length!=chars1.length)throw new IllegalArgumentException("Length not equal");

        int[] ints= new int[128];
        for (char c:chars){
            ints[c]++;
        }
        for (char c:chars1){
            if (ints[c]==0) {
                System.out.println("Not permutation");
                break;
            }
        }

    }

    private static void _checkPermutation(String s1, String s2) {
        char[] chars=s1.toCharArray();
        char[] chars1=s2.toCharArray();
        if (chars.length!=chars1.length)throw new IllegalArgumentException("Length not equal");
        Arrays.sort(chars);
        Arrays.sort(chars1);
        System.out.println(new String(chars).toString().equals(new String(chars1)));
    }
}
