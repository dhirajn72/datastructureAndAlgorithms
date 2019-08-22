package dynamicprogramming;

/**
 * @author Dhiraj
 * @date 25/07/19
 */
public class EggDrop {
    static int eggDrop(int eggs, int floors) {
        if (floors == 1 || floors == 0)
            return floors;
        if (eggs == 1)
            return floors;
        int min = Integer.MAX_VALUE;
        int i, res;
        for (i = 1; i <= floors; i++) {
            res = Math.max(eggDrop(eggs - 1, i - 1), eggDrop(eggs, floors - i));
            if (res < min)
                min = res;
        }
        return min + 1;
    }
    public static void main(String args[]) {
        int eggs = 2, floors = 4;
        System.out.print("Minimum number of "
                + "trials in worst case with "
                + eggs + " eggs and " + floors
                + " floors is " + eggDrop(eggs, floors));
    }
}
