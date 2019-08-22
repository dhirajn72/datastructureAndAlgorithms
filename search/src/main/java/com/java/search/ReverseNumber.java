package com.java.search;

/**
 * @author Dhiraj
 * @date 15/07/19
 */
public class ReverseNumber {
    public static void main(String[] args) {

        String s = "123";
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--)
            res += s.charAt(i);
        System.out.println(res);

        int n = 123, reverse = 0;
        while (n >= 1) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }
        System.out.println(reverse);
    }
}
