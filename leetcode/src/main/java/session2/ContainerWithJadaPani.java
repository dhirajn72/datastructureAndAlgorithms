package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 27/08/19
 */
public class ContainerWithJadaPani {

    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));;
    }

    public static int trap(int[] height) {
        if(height==null||height.length==0)return 0;
        int[] leftMax=new int[height.length];
        int max=0;
        for (int i = 0; i < height.length; i++) {
            max=Math.max(max,height[i]);
            leftMax[i]=Math.max(max,height[i]);
        }
        int[] rightMax=new int[height.length];
        max=0;
        for (int i = height.length-1; i >=0 ; i--) {
            max=Math.max(max,height[i]);
            rightMax[i]=Math.max(max,height[i]);
        }
        int[] delta=new int[height.length];
        for (int i = 0; i < height.length; i++) {
            delta[i]=Math.min(leftMax[i],rightMax[i]);
        }
        int[] result=new int[height.length];
        for (int i = 0; i < delta.length; i++) {
            result[i]=delta[i]-height[i];
        }
        int sum=0;
        for (int i:result)
            sum+=i;
        return sum;
    }
}
