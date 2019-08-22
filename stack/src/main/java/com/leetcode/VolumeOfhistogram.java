package com.leetcode;

/**
 * @author Dhiraj
 * @date 06/07/19
 */
public class VolumeOfhistogram {
    public static void main(String[] args) {

        int[] arr={0,0,4,0,0,6,0,0,3,0,8,0,2,0,5,2,0,3,0,0};
        System.out.println(histogramVolume(arr));

    }
    public static int  histogramVolume(int[] histo){
        int[] leftMaxes=new int[histo.length];
        int leftMax=histo[0];
        for (int i = 0; i <histo.length ; i++) {
            leftMax=Math.max(leftMax,histo[i]);
            leftMaxes[i]=leftMax;
        }
        int sum=0;

        int rightMax=histo[histo.length-1];
        for (int i = histo.length-1;i>=0 ; i--) {
            rightMax=Math.max(rightMax,histo[i]);
            int secondTallest=Math.min(rightMax,leftMaxes[i]);
            if (secondTallest>histo[i])
                sum+=secondTallest-histo[i];

        }
        return sum;
    }

}
