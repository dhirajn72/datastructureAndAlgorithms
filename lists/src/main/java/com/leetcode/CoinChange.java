package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 28/07/19
 */
public class CoinChange {
    public static void main(String[] args) {
        int[] arr={1, 2, 5};
        System.out.println(coinChange(arr,11));
    }

    public  static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    int rem=i - coins[j];
                    dp[i] = Math.min(dp[i], dp[rem] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }



    /*public static int coinChange(int[] coins, int amount) {
        if (amount < 1) return 0;
        return coinChange(coins, amount, new int[amount]);
    }

    private static int coinChange(int[] coins, int rem, int[] count) {
        if (rem < 0) return -1;
        if (rem == 0) return 0;
        if (count[rem - 1] != 0) return count[rem - 1];
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = coinChange(coins, rem - coin, count);
            if (res >= 0 && res < min)
                min = 1 + res;
        }
        count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return count[rem - 1];
    }*/




















    /*public static int coinChange(int[] coins, int amount) {
        List<Integer> integers= new ArrayList<>();
        for (int i:coins)
            integers.add(i);
        List<List<Integer>> integers1= new ArrayList<>();
        _subSetSum(integers,amount,new ArrayList<Integer>(),integers1);
        int minLen=Integer.MAX_VALUE;
        for (List<Integer> i:integers1){
            minLen=Math.min(i.size(),minLen);

        }
        return minLen;
    }

    private static void _subSetSum(List<Integer> numbers, int target, ArrayList<Integer> partial,List<List<Integer>> integers1) {
        int sum=0;
        for (int i:partial)
            sum+=i;
        if (sum==target)
            integers1.add(new ArrayList<>(partial));
        if (sum>target)
            return;
        for (int i = 0; i <numbers.size() ; i++) {
            ArrayList<Integer> remaining=new ArrayList<>();
            int n=numbers.get(i);
            for (int j = i; j < numbers.size(); j++) {
                remaining.add(numbers.get(j));
            }
            ArrayList<Integer> partial_res=new ArrayList<>(partial);
            partial_res.add(n);
            _subSetSum(remaining,target,partial_res,integers1);
        }*/

}
