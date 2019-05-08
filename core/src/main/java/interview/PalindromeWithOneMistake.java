package interview;

import java.util.Objects;

/**
 * @author Dhiraj
 * @date 15/03/19
 */
public class PalindromeWithOneMistake {
    public static void main(String[] args) {
        String str = "abcwba";
        checkPalindrome(str);
    }

    private static void checkPalindrome(String str) {
        boolean flag=false;
        int deletedIndex=-1;
        if (Objects.isNull(str)) {
            System.out.println("Object is null");
            return;
        }
        else{
            for (int i=0;i<str.length();i++){
                StringBuilder sb= new StringBuilder(str);
                StringBuilder sb2= sb.deleteCharAt(i);
                StringBuilder sb3=new StringBuilder();
                for (int j=sb2.length()-1;j>=0;j--)
                    sb3.append(sb2.charAt(j));
                if (String.valueOf(sb2).equals(String.valueOf(sb3))) {
                    flag = true;
                    deletedIndex=i;
                }
            }
        }
        if (flag) {
            System.out.println("Palindrome");
            System.out.println("Deleted index is:"+deletedIndex);
        }
        else System.out.println("Not a Palindrome even after deleting");
    }
}
