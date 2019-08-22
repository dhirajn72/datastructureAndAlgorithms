package leetcode;

/**
 * @author Dhiraj
 * @date 06/08/19
 */
public class PlindromeInteger {
    public static boolean isPalindrome(int x1) {
        int x=x1;
        if (x==0)return true;
        int result=0;
        while (x!=0){
            result=result*10;
            result=result+x%10;
            x=x/10;
        }
        return x1==result?true:false;
    }
}
