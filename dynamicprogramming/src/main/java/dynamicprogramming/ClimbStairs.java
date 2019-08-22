package dynamicprogramming;

/**
 * @author Dhiraj
 * @date 29/07/19
 */
public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(_climbStairs(6));
        System.out.println(_memoizedClimbingStairs(6));
    }
    private static int _memoizedClimbingStairs(int n) {
        int[] dp = new int[n + 1];
        return _climbStairHelper(n, dp);
    }
    private static int _climbStairHelper(int n, int[] dp) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        if (dp[n] > 0)
            return dp[n];
        dp[n] = _climbStairHelper(n - 1, dp) + _climbStairHelper(n - 2, dp) + _climbStairHelper(n - 3, dp);
        return dp[n];
    }

    private static int _climbStairs(int stairs) {
        return _climbStairHelper(stairs);
    }

    private static int _climbStairHelper(int n) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        return _climbStairHelper(n - 1) + _climbStairHelper(n - 2) + _climbStairHelper(n - 3);
    }
}
