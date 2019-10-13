package session2;

/**
 * @author Dhiraj
 * @date 23/08/19
 */
public class ContainerWithJadaPanni {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        System.out.println(maxWater(arr));

    }

    private static int maxWater(int[] arr) {
        int l=0,area=0;
        int r=arr.length-1;
        while (l<r){
            int min=Math.min(arr[l],arr[r]);
            area=Math.max(area,min*(r-l));
            if (arr[l]<arr[r])
                l++;
            else
                r--;
        }
        return area;
    }
}
