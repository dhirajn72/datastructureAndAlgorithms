package session2;

/**
 * @author Dhiraj
 * @date 23/08/19
 */
public class PalindromeNumner {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
    public static boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        int i=0;
        int j=s.length()-1;
        while (i<j && s.charAt(i)==s.charAt(j)){
            i++;
            j--;
        }
        return s.charAt(i)==s.charAt(j);
    }
}
