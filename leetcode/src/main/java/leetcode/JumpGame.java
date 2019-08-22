package leetcode;

/**
 * @author Dhiraj
 * @date 11/08/19
 */
public class JumpGame {
    public static void main(String[] args) {
        //int[] arr = {4, 3, 1, 1, 4, 3};
        //int[] arr = {3, 3, 1, 1, 4, 3};
        //int[] arr = {5, 3, 1, 1, 4, 3};
        //int[] arr = {5, 3, 1, 1, 4, 3};
        //int[] arr = {1, 3, 1, 1, 4, 3};
        //int[] arr={4,2,1,0,4};
        //int[] arr={0,2,1,0,4};
        //int[] arr={1,2,1,0,4};
        //int[] arr={1,2,1,1,4};
        //int[] arr={2,3,1,1,4};
        //int[] arr={3,2,1,0,4};
        //int[] arr={2,3,1,1,8,9,4,2,4};
        int[] arr={1};



        System.out.println(canJump(arr));
    }

    public static boolean canJump(int[] arr) {
        if (arr == null || arr.length == 0) return false;
        if (arr.length==1)return true;
        int first = arr[0];
        int length = arr.length - 1;
        if (first==length)return true;
        while (first<=length){
            if (arr[first]==0)return false;
            first+=arr[first];
            if (first==length)return true;
            if (arr[0]==0)return false;
        }
        if (first>length)return false;
        return true;
    }
}
