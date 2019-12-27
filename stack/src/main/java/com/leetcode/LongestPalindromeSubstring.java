package com.leetcode;

/**
 * @author Dhiraj
 * @date 19/07/19
 */


/**
 * Success
 * Details
 * Runtime: 30 ms, faster than 47.70% of Java online submissions for Longest Palindromic Substring.
 * Memory Usage: 37.9 MB, less than 52.02% of Java online submissions for Longest Palindromic Substring.
 */
public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        //String s = "cdabadprrrrrrrsede";
        /*String
                s="whdqcudjpisufnrtsyupwtnnbsvfptrcgvobbjglmpynebblpigaflpbezjvjgbmofejyjssdhbgghgrhzuplbeptpaecfdanhlylgusptlgobkqnulxvnwuzwauewcplnvcwowmbxxnhsdmgxtvbfgnuqdpxennqglgmspbagvmjcmzmbsuacxlqfxjggrwsnbblnnwisvmpwwhomyjylbtedzrptejjsaiqzprnadkjxeqfdpkddmbzokkegtypxaafodjdwirynzurzkjzrkufsokhcdkajwmqvhcbzcnysrbsfxhfvtodqabvbuosxtonbpmgoemcgkudandrioncjigbyizekiakmrfjvezuzddjxqyevyenuebfwugqelxwpirsoyixowcmtgosuggrkdciehktojageynqkazsqxraimeopcsjxcdtzhlbvtlvzytgblwkmbfwmggrkpioeofkrmfdgfwknrbaimhefpzckrzwdvddhdqujffwvtvfyjlimkljrsnnhudyejcrtrwvtsbkxaplchgbikscfcbhovlepdojmqybzhbiionyjxqsmquehkhzdiawfxunguhqhkxqdiiwsbuhosebxrpcstpklukjcsnnzpbylzaoyrmyjatuovmaqiwfdfwyhugbeehdzeozdrvcvghekusiahfxhlzclhbegdnvkzeoafodnqbtanfwixjzirnoaiqamjgkcapeopbzbgtxsjhqurbpbuduqjziznblrhxbydxsmtjdfeepntijqpkuwmqezkhnkwbvwgnkxmkyhlbfuwaslmjzlhocsgtoujabbexvxweigplmlewumcone";*/
        /*String s =
                "fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffgggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg";
*/

        //String s="cbbd";
        String s = "acc";

        s = "babad";
        System.out.println(longestPalindrome(s));
        System.out.println("***");
        /*System.out.println(_isPalindrome("dabad"));;
        System.out.println(_isPalindrome("babdbab"));;*/
    }

    public static String longestPalindrome(String input) {
        if (input.isEmpty())
            return "";

        int longestSoFar = 0, startIndex = 0, endIndex = 0;
        boolean[][] palindrom = new boolean[input.length()][input.length()];

        for (int i = 0; i < input.length(); i++) {
            palindrom[i][i] = true;
            for (int j = 0; j < i; j++) {
                if (input.charAt(i) == input.charAt(j) && (i - j <= 2 || palindrom[j + 1][i - 1])) {
                    palindrom[j][i] = true;
                    if (i - j + 1 > longestSoFar) {
                        longestSoFar = i - j + 1;
                        startIndex = j;
                        endIndex = i;
                    }
                }
            }
        }
        return input.substring(startIndex, endIndex + 1);
    }
}
