package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 01/09/19
 */
public class NthFibonacci {
    public static void main(String[] args) {
        System.out.println(fib(3));;
    }


    public static int fib(int n) {
        /*if (n==0)return 0;
        if (n==1)return 1;
        int[] dp=new int[n];
        dp[0]=1;
        dp[1]=1;
        int i=2;
        while (i<n){
            dp[i]=dp[i-1]+dp[i-2];
            i++;
        }
        System.out.println(Arrays.toString(dp));

        return dp[n-1];*/


        if (n==0)return 0;
        if (n==1)return 1;
        int first=1,second=1;
        int i=2;
        while (i<n){
            int sum=first+second;
            first=second;
            second=sum;
            i++;
        }
        return second;
    }
}
