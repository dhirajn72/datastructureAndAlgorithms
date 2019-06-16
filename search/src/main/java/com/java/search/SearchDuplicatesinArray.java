package com.java.search;

/**
 * @author Dhiraj
 * @date 11/06/19
 */
public class SearchDuplicatesinArray {
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 4, 5};
        System.out.println(findDups(arr));;
    }

    private static int findDups(int[] arr) {
        int[] countArray=new int[10];
        for (int i=0;i<arr.length;i++){
            if (countArray[arr[i]]==1){
                System.out.println("Found dups:"+arr[i]);
                return -1;
            }
            else {
                countArray[arr[i]]=countArray[arr[i]]+1;
            }
        }
        return 0;
    }
}
