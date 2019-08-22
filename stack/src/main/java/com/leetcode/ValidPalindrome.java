package com.leetcode;

/**
 * @author Dhiraj
 * @date 17/07/19
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(null));
        System.out.println(isPalindrome(""));


    }
    public static boolean isPalindrome(String s) {
        if (s==null||s.length()==0 || "".equalsIgnoreCase(s.trim()))return true;
        if (s.length()==1)return true;

        String str="";
        for (int i=0;i<s.length();i++){
            if ( (s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122) ){
                str+=s.charAt(i)+"";
            }
        }
        str=str.toLowerCase();
        int i=0,j=str.length()-1;

        while (i<j){
            if (str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        if (i==j)
            return true;
        return false;
    }
}
