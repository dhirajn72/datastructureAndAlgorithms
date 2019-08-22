package special;

/**
 * @author Dhiraj
 * @date 07/07/19
 */
public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] arr=new int[]{3,5,4,2,3};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int arr[]) {
        int left=0;
        int right=arr.length-1;
        int area=0;
        while (left<right){
            int min=Math.min(arr[left],arr[right]);
            int remaining=right-left;
            area=Math.max(area,min*remaining);
            if (arr[left]<arr[right])
                left++;
            else
                right--;
        }
        return area;
    }
}


