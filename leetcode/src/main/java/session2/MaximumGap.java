package session2;

/**
 * @author Dhiraj
 * @date 07/10/19
 */
public class MaximumGap {

    public static void main(String[] args) {
        int[] arr={3,6,9,1};
        //int[] arr={3,6,5,0,4,2,8,9,1};
        //System.out.println(maximumGap(arr));
        //_quickSort(arr);
        System.out.println(maximumGap(arr));
    }
    public static int maximumGap(int[] nums) {
        if (nums==null)return 0;
        if (nums.length==1)return 0;
        if (nums.length==0)return 0;
        _quickSort(nums);
        int max=Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            max=Math.max(max,nums[i]-nums[i-1]);
        }
        return max;
    }

    private static void _quickSort(int[] nums) {
        _sort(nums,0,nums.length-1);
    }

    private static void _sort(int[] arr, int low, int high) {
        int i=low,j=high;
        int pivot=arr[(i+j)/2];
        while (i<=j){
            while (arr[i]<pivot)
                i++;
            while (arr[j]>pivot)
                j--;
            if (i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        if (low<j)
            _sort(arr,low,j);
        if (i<high)
            _sort(arr,i,high);

    }
}
