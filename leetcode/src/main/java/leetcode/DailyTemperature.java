package leetcode;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 04/08/19
 */
public class DailyTemperature {

    public static void main(String[] args) {
        //int[] arr={73, 74, 75, 71, 69, 72, 76, 73};
        int[] arr = {55, 38, 53, 81, 61, 93, 97, 32, 43, 78};//[3,1,1,2,1,1,0,1,1,0]
        System.out.println(Arrays.toString(dailyTemperatures(arr)));
    }

    public static int[] dailyTemperatures(int[] arr) {
        int[] indexes = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    indexes[index++] = j - i;
                    flag = false;
                    break;
                }
            }
            if (flag)
                indexes[index++] = 0;
        }
        return indexes;
    }
}