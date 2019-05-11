package com.java.algorithms;

/**
 * @author Dhiraj
 * @date 08/05/19
 */
public class DuplicatesiInArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 2, 7, 8, 9,8,6};
        findDuplicate(arr);

    }
    private static void findDuplicate(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found at index:: " + j + " and the element is::" + arr[j]);
                    flag = false;
                    //break;

                }
            }
           // break;
        }
        if (flag)
            System.out.println("No duplicates found in array");
    }

}
