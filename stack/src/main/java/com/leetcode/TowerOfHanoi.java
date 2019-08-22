package com.leetcode;

/**
 * @author Dhiraj
 * @date 20/07/19
 */
public class TowerOfHanoi {
    public static void main(String[] args) {
        _towerOfHanoi(3,"A","B","C");
    }

    private static void _towerOfHanoi(int n, String from, String temp, String to) {
        if (n==0)
            return;
        _towerOfHanoi(n-1,from,to,temp);
        System.out.println("Moved plate "+ n +" from "+ from +" to "+to);
        _towerOfHanoi(n-1,temp,from,to);

    }
}
