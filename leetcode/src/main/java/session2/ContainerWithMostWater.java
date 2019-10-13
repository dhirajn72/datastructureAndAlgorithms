package session2;

/**
 * @author Dhiraj
 * @date 23/08/19
 */
public class ContainerWithMostWater {
    /*
Input: [1,8,6,2,5,4,8,3,7]
Output: 49
     */

    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int area=0;
        while (l<r){
            int min=Math.min(height[l],height[r]);
            area=Math.max(area,min*(r-l));
            if (height[l]<height[r])
                l++;
            else
                r--;
        }
        return area;
    }
}
