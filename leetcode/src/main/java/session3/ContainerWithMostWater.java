package session3;

/**
 * @author Dhiraj
 * @date 10/11/19
 */
public class ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public static int maxArea(int[] height) {
        if (height==null)return 0;
        int i=0;
        int j=height.length-1;
        int max=Integer.MIN_VALUE;
        int count=height.length-1;
        while (i<j){
            int min=Math.min(height[i],height[j]);
            max=Math.max(max,min*count--);
            if (height[i]<height[j])
                i++;
            else
                j--;
        }

        return max;
    }
}
