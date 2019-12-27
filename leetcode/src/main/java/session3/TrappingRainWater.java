package session3;

/**
 * @author Dhiraj
 * @date 30/11/19
 */

/*
Success
Details
Runtime: 1 ms, faster than 96.54% of Java online submissions for Trapping Rain Water.
Memory Usage: 37.1 MB, less than 98.63% of Java online submissions for Trapping Rain Water.
 */
public class TrappingRainWater {
    public int trap(int[] arr) {
        if (arr==null)return 0;
        int[] leftMax=new int[arr.length];
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            leftMax[i]=Math.max(max,arr[i]);
            max=leftMax[i];
        }
        int[] rightMax=new int[arr.length];
        max=Integer.MIN_VALUE;
        for (int i = arr.length-1; i>=0 ; i--) {
            rightMax[i]=Math.max(max,arr[i]);
            max=rightMax[i];
        }
        int[] delta=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            delta[i]=Math.min(leftMax[i],rightMax[i]);
        }
        int[] result=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i]=delta[i]-arr[i];
        }
        int res=0;
        for (int i:result)
            res+=i;
        return res;
    }
}
