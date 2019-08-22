package com.leetcode;

/**
 * @author Dhiraj
 * @date 05/08/19
 */
public class Google {

    //lookAndSay("111221") = "312211"
    public static void main(String[] args) {
        lookAndSay("111221"); // 312211
        lookAndSay("312211"); // 13112221
    }


    public static void lookAndSay(String s){
        char[] arr=s.toCharArray();
        int count=0;
        String result="";
        for(int i=0;i<arr.length;i++){
            int j;
            for( j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++; 			// 1,1,1
                }
                else{
                    break;
                }
            }
            result+=count+""+arr[i]; //
            i=j-1;
            count=0;
        }
        System.out.println(result);
    }
}
