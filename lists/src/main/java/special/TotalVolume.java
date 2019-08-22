package special;

/**
 * @author Dhiraj
 * @date 06/07/19
 */
public class TotalVolume {
    public static void main(String[] args) {
        //int[] arr={0,0,4,0,0,6,0,0,3,0,8,0,2,0,5,2,0,3,0,0};
        //int[] arr={1,8,6,2,5,4,8,3,7};
        //int[] arr={1,3,2,4,2,3};
        int[] arr=new int[]{3,5,4,2,3};
        System.out.println(histogramVolume(arr));
    }

    private static int  histogramVolume(int[] arr) {
        int[] leftmax=new int[arr.length];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
            leftmax[i]=max;
        }
        max=arr[arr.length-1];
        int[] rightMax=new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            max=Math.max(max,arr[i]);
            rightMax[i]=max;
        }
        int[] delta=new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            delta[i]=Math.min(leftmax[i],rightMax[i]);
        }
        int[] finalValume=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            finalValume[i]=delta[i]-arr[i];
        }
        int sum=0;
        for (int i:finalValume)
            sum+=i;
        return sum;
    }
}
