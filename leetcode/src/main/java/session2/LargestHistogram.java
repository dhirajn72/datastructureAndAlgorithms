package session2;

/**
 * @author Dhiraj
 * @date 31/08/19
 */
public class LargestHistogram {


    public int largestRectangleArea(int[] heights) {
        if (heights==null||heights.length==0)return 0;
        int count=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i; j < heights.length; j++) {
                if (heights[j]>=heights[i])
                    count++;
                else break;
            }
            for (int j = i-1; j >=0 ; j--) {
                if (heights[j]>=heights[i])
                    count++;
                else break;
            }
            max=Math.max(max,heights[i]*count);
            count=0;
        }
        return max;
    }
}
