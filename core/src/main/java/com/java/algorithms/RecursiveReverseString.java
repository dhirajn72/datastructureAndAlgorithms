package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 06/09/19
 */
public class RecursiveReverseString {
    public static void main(String[] args) {
        String str="My name sis dhiraj singh, and I live in bangalore and I am foody";
        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        String[] arr=str.split(" |,|\n");
        //return reverseRecursive(arr, "");
        return reverseRecursive(str, "");
    }

    private static String reverseRecursive(/*String[] arr*/String str, String res) {
        /*if (arr.length==1)
            return arr[0]+res;
        else {
            String[] arr2= Arrays.copyOfRange(arr,1,arr.length);
            return reverseRecursive(arr2,res)+" "+arr[0];
        }*/
        String[] wordArr = str.split(" ", 2);

        if (wordArr.length > 1) {
            return reverse(wordArr[1]) + " " + wordArr[0];
        }

        return wordArr[0]; // else, just return the one word
    }
}
