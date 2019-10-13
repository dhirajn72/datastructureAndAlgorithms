package session2;

/**
 * @author Dhiraj
 * @date 31/08/19
 */
public class LongestPalindromeSubstring {

    public static void main(String[] args) {
        //System.out.println(longestPalindrome("babad"));
        //System.out.println(longestPalindrome("babad"));
        //System.out.println(longestPalindrome("babad"));
        //System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("aaaamadamaagabcbax"));
        //System.out.println(isPalindrome("aaccaa"));

         //System.out.println(longestPalindrome("ac"));


    }


    public static String longestPalindrome(String s) {
        if (s==null||s.length()==0)return "";
        if (s.length()==1)return s;
        String longest="";
        for (int i = 0; i <s.length()-1 ; i++) {
            String p=s.charAt(i)+"";
            if (isPalindrome(p)){
                longest=longest.length()>p.length()?longest:p;
            }
            for (int j = i+1; j < s.length(); j++) {
                p+=s.charAt(j);
                if (isPalindrome(p)){
                    longest=longest.length()>p.length()?longest:p;
                }
            }

        }
        return longest;
    }

    private static boolean isPalindrome(String p) {
        int i=0;
        int j=p.length()-1;
        while (i<j){
            if (p.charAt(i)==p.charAt(j)){
                i++;
                j--;
            }
            else break;
        }
        if (i==j || i>j)
            return true;
        return false;
    }

}
