package com.karumanchi;

/**
 * @author Dhiraj
 * @date 20/07/19
 */
public class TowerOfHanoi {
   public static void main (String [] args) {
        hanoi(3, "A", "B", "C");
    }
    public static void hanoi(int n, String from, String temp, String to) {
        if (n == 0)
            return;
        hanoi(n-1, from, to, temp);
        System.out.println("Moving disc " + n + " from " + from + " to " + to);
        hanoi(n-1, temp, from, to);
    }
}
