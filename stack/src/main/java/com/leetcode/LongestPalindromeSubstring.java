package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 19/07/19
 */
public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        //String s = "cdabadprrrrrrrsede";
        /*String
                s="whdqcudjpisufnrtsyupwtnnbsvfptrcgvobbjglmpynebblpigaflpbezjvjgbmofejyjssdhbgghgrhzuplbeptpaecfdanhlylgusptlgobkqnulxvnwuzwauewcplnvcwowmbxxnhsdmgxtvbfgnuqdpxennqglgmspbagvmjcmzmbsuacxlqfxjggrwsnbblnnwisvmpwwhomyjylbtedzrptejjsaiqzprnadkjxeqfdpkddmbzokkegtypxaafodjdwirynzurzkjzrkufsokhcdkajwmqvhcbzcnysrbsfxhfvtodqabvbuosxtonbpmgoemcgkudandrioncjigbyizekiakmrfjvezuzddjxqyevyenuebfwugqelxwpirsoyixowcmtgosuggrkdciehktojageynqkazsqxraimeopcsjxcdtzhlbvtlvzytgblwkmbfwmggrkpioeofkrmfdgfwknrbaimhefpzckrzwdvddhdqujffwvtvfyjlimkljrsnnhudyejcrtrwvtsbkxaplchgbikscfcbhovlepdojmqybzhbiionyjxqsmquehkhzdiawfxunguhqhkxqdiiwsbuhosebxrpcstpklukjcsnnzpbylzaoyrmyjatuovmaqiwfdfwyhugbeehdzeozdrvcvghekusiahfxhlzclhbegdnvkzeoafodnqbtanfwixjzirnoaiqamjgkcapeopbzbgtxsjhqurbpbuduqjziznblrhxbydxsmtjdfeepntijqpkuwmqezkhnkwbvwgnkxmkyhlbfuwaslmjzlhocsgtoujabbexvxweigplmlewumcone";
        *String s =
                "fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffgggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg";

        */
        String s="cbbd";
        System.out.println(longestPalindrome(s));
        System.out.println("***");
        /*System.out.println(_isPalindrome("dabad"));;
        System.out.println(_isPalindrome("babdbab"));;*/
    }

   /* public static String longestPalindrome(String str) {
        if (str == null || str.length() == 0) return "";
        String s = "";
        int max = Integer.MIN_VALUE;
        Map<Integer, String> map = new HashMap<>();
        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            for (int j = i; j < strArray.length; j++) {
                s += strArray[j];
                if (_isPalindrome(s)) {
                    max = Math.max(max, s.length());
                    if (!map.containsKey(max))
                        map.put(max, s);
                }
            }
            s = "";
        }
        return map.get(max);
    }*/

   // cbbd
    public static String longestPalindrome(String str) {
        String max="";
        for (int i = 0; i < str.length(); i++) {
            int j=i;
            int k=i;
            String s="";
            while (j>0 && k<str.length() && str.charAt(j)==str.charAt(k)){
                j--;
                k++;
            }
            max=max.length()>s.length()?max:s;

        }
        return max;
    }

    private static boolean _isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        char[] strArray = str.toCharArray();
        while (i < j) {
            if (strArray[i] == strArray[j]) {
                i++;
                j--;
            } else {
                break;
            }
        }
        if (i == j || i > j)
            return true;
        return false;
    }
}
