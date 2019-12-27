package session2;

/**
 * @author Dhiraj
 * @date 13/10/19
 */
public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr=new int[1];
        System.out.println(arr.length);
    }

    public static int search(int[] nums, int target) {
        if (nums==null)return -1;
        for (int i = 0; i <nums.length ; i++) {
            if (target==nums[i])
                return i;
        }
        return -1;
    }
}
