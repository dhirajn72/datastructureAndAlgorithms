package session2;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class LongestPalindromicSubString {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("adccccdd"));


    }
    public static int longestPalindrome(String s) {
        if (s==null||s.length()==0)return 0;
        String str="";
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < s.length()-1; i++) {
            str+=s.charAt(i)+"";
            for (int j = i+1; j < s.length() ; j++) {
                str+=s.charAt(j);
                if (_isPalindrome(str)){
                    max=Math.max(max,str.length());
                }
            }
            str="";
        }
        return max;
    }

    private static boolean _isPalindrome(String str) {
        int i=0,j=str.length()-1;
        while (i<j && str.charAt(i)==str.charAt(j)){
            i++;
            j--;
        }
        return str.charAt(i)==str.charAt(j);
    }


}
