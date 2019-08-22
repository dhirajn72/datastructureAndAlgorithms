package dynamicprogramming;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * @author Dhiraj
 * @date 16/08/19
 */
public class Fibonnacci {
    public static void main(String[] args) {
        int num=4000000;
        Instant i1=Instant.now();
        System.out.println(_fibonacci(num));
        System.out.println(ChronoUnit.MILLIS.between(i1,Instant.now()));
        // 0,1,2,3,5,8,13,21,34,55
        Instant i3=Instant.now();
        //System.out.println(_fibboUnMemoised(num));
        System.out.println(ChronoUnit.MILLIS.between(i3,Instant.now()));
    }

    private static int _fibonacci(int n) {
        int[] dp=new int[n+1];
       return  _fibbo(n,dp);

    }
    private static int _fibbo(int n, int[] dp) {
        if (n==0)return 0;
        if (n==1)return 1;
        else{
            dp[0]=0;
            dp[1]=1;
            for (int i = 2; i <=n ; i++) {
                dp[i]=dp[i-1]+dp[i-2];
            }
            return dp[n];
        }
    }
    private static int _fibboUnMemoised(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return  _fibboUnMemoised(n - 1) + _fibboUnMemoised(n - 2);

    }

}
