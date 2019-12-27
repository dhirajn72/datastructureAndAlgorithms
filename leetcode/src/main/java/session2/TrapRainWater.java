package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 15/10/19
 */
public class TrapRainWater {

    public static void main(String[] args) {
        System.out.println(trap(new int[]{1,0,2,1,3,1,1,1,3,3}));
    }

    public static int trap(int[] arr) {
        if (arr==null)return -1;
        int[] leftMax=new int[arr.length];
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            leftMax[i]=Math.max(max,arr[i]);
            max=Math.max(max,arr[i]);
        }
        int[] rightMax=new int[arr.length];
        max=Integer.MIN_VALUE;
        for (int i = arr.length-1; i >=0; i--) {
            rightMax[i]=Math.max(max,arr[i]);
            max=Math.max(max,arr[i]);
        }
        int[] delta=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            delta[i]=Math.min(leftMax[i],rightMax[i]);
        }
        int[] result=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i]=delta[i]-arr[i];
        }
        System.out.println(Arrays.toString(result));
        return Arrays.stream(result).sum();
    }
}
