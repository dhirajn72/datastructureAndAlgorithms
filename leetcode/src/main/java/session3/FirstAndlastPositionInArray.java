package session3;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 28/11/19
 */
public class FirstAndlastPositionInArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10},10)));;
        System.out.println(Arrays.toString(searchRange(new int[]{2,2},2)));;


    }

    public static int[] searchRange(int[] nums, int target) {
        if (nums==null)return new int[]{-1,-1};
        if (nums.length==0)return new int[]{-1,-1};
        boolean flag=true;

        int[] res=new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                int j=i+1;
                res[0]=i;
                while (j<nums.length && nums[j]==target ){
                    j++;
                }
                if (nums[j-1]==target)
                    res[1]=j-1;
                flag=false;
                break;
            }
        }
        if (flag)return new int[]{-1,-1};
        return res;
    }
}
