package session3;

/**
 * @author Dhiraj
 * @date 10/11/19
 */
public class ToPalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(-123));
    }

    public static boolean isPalindrome(int x) {
        if (x<0)return false;
        String s=String.valueOf(x);
        int i=0,j=s.length()-1;
        while (i<j){
            if (s.charAt(i)==s.charAt(j)) {
                i++;
                j--;
            }
            else break;
        }
        return s.charAt(i)==s.charAt(j);
    }
}
