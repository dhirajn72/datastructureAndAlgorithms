package com.leetcode;

/**
 * @author Dhiraj
 * @date 06/07/19
 */
public class HistogramVoliam {
    public static void main(String[] args) {
        //int[] arr={0,0,4,0,0,6,0,0,3,0,8,0,2,0,5,2,0,3,0,0};
        int[] arr={};

        System.out.println(histogramVolue(arr));
    }

    private static int histogramVolue(int[] arr) {
        if (arr==null|| arr.length==0)return 0;


        int[] leftMax= new int[arr.length];
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            min=Math.max(min,arr[i]);
            leftMax[i]=min;
        }
        int[] rightmax= new int[arr.length];
        min=arr[arr.length-1];
        for (int i = arr.length-1; i >=0; i--) {
            min=Math.max(min,arr[i]);
            rightmax[i]=min;
        }
        int[] delta=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            delta[i]=Math.min(leftMax[i],rightmax[i]);
        }
        int[] finalVolume=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            finalVolume[i]=delta[i]-arr[i];
        }
        int sum=0;
        for (int i:finalVolume)
            sum+=i;
        System.out.println(sum);
        return sum;
    }
}
