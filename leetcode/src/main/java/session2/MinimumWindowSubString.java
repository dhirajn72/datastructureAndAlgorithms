package session2;

/**
 * @author Dhiraj
 * @date 20/09/19
 */
public class MinimumWindowSubString {

    /*
    Input: S = "ADOBECODEBANC", T = "ABC"
Output: "BANC"
     */

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }

    public static String minWindow(String s, String t) {
        if (s == null || t == null) return null;
        if (s == null && t != null)
            return null;
        if (s != null && t == null)
            return null;
        if (s.length() < t.length()) return null;

        boolean flag=false;
        int start = 0;
        int len=t.length();
        String res="";
        while (start < s.length()) {
            for (int i = start; i < s.length() - t.length(); i++) {
                int[] arr = new int[122];
                String s1 = "";
                for (int j = 0; j < len; j++) {
                    arr[s.charAt(i + j)] = s.charAt(i + j);
                    s1 += s.charAt(i + j) + "";
                }
                int countIndex = 0;
                for (int j = 0; j < t.length(); j++) {
                    if (arr[t.charAt(j)] > 0) {
                        countIndex++;
                    } else break;
                }
                if (countIndex == t.length()) {
                    System.out.println("Found all ");
                    flag=true;
                    res=s1;
                    break;
                }
            }
            if (flag)break;
            len++;
            start++;
        }
        return res;
    }
}
