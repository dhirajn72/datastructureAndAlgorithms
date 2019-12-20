package com.leetcode;

/**
 * @author Dhiraj
 * @date 16/07/19
 */
public class Reverse32BitNumber {

    public static void main(String[] args) {
        //System.out.println(reverse(123));
        System.out.println(reverse(-1234567891));
        System.out.println(reverse(123));




    }

    public static int reverse(int x) {
        long k = x;
        /*boolean isNegtive = false;
        if(k < 0){
            k = 0 - k;
            isNegtive = true;
        }*/
        long result = 0;
        while(k != 0){
            result = result * 10;
            result =result+ k % 10;
            k =  k/10;
        }

        if(result > Integer.MAX_VALUE) return 0;
        return (int) result;
        //return isNegtive  ? 0 - ((int)result) : (int)result;
    }
}
