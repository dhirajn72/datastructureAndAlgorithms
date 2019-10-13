package session2;

/**
 * @author Dhiraj
 * @date 26/08/19
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        //System.out.println(_binarySearch(arr,0,arr.length,10));
        System.out.println(search(new int[]{5},5));
    }

    private static boolean _binarySearch(int[] arr, int low,int high,int key) {
        while (low<high){
            int mid=(low+high)/2;
            if (arr[mid]==key)
                return true;
            else if (arr[mid]>key)
                high=mid-1;
            else
                low=mid+1;
        }
        return false;
    }
    public static int search(int[] nums, int key) {
        int low=0;
        int high=nums.length-1;
        //if (nums[0]==key)return 0;
        while (low<=high){
            int mid=(low+high)/2;
            if (nums[mid]==key)
                return mid;
            else if (nums[mid]>key)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }

}
