package leetcode;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Dhiraj
 * @date 10/08/19
 */
public class ReservoirSampling {
    // A function to randomly select k items from stream[0..n-1].
    static void selectKItems(int arr[], int n, int k) {
        int i;
        int reservoir[] = new int[k];
        for (i = 0; i < k; i++)
            reservoir[i] = arr[i];
        Random r = new Random();
        for (; i < n; i++) {
            int j = r.nextInt(i + 1);
            if (j < k)
                reservoir[j] = arr[i];
        }

        System.out.println("Following are k randomly selected items");
        System.out.println(Arrays.toString(reservoir));
    }
    public static void main(String[] args) {
        int stream[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int n = stream.length;
        int k = 2;
        selectKItems(stream, n, k);
    }
}
