package dynamicprogramming;

/**
 * @author Dhiraj
 * @date 30/07/19
 */
public class HouseRobberII {
    public static void main(String[] args) {

        //System.out.println(_robHouse(new int[]{1,2,3,1})); // 4
       // System.out.println(_robHouse(new int[]{1,2,3,1}));
        //System.out.println(_robHouse(new int[]{2,3,2}));
       System.out.println(_robHouse(new int[]{1,2,1,1}));

    }
    private static int _robHouse(int[] arr) {
        if (arr.length==0)
            return 0;
        if (arr.length==1)
            return arr[0];
        if (arr.length==2)
            return Math.max(arr[0],arr[1]);
        if (arr.length==3)
            return Math.max(arr[1],Math.max(arr[0],arr[2]));

        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for (int i = 2; i < arr.length; i++) {
            dp[i]=Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        return dp[arr.length-1];
    }
}