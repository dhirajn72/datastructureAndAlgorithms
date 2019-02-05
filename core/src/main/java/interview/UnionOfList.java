package interview;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 28/01/19
 */
public class UnionOfList {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        //leftRotate(arr, 3,5);
        System.out.println(Arrays.toString(arr));
        leftRotate(arr, 3);


    }

    static void leftRotate(int arr[], int d, int n) {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }

    static void leftRotatebyOne(int arr[], int n) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }

    private static void leftRotate(int[] inputArray, int n) {
        System.out.println("Input Array Before Rotation :");
        System.out.println(Arrays.toString(inputArray));
        int temp;
        for (int i = 0; i < n; i++) {
            temp = inputArray[0];
            for (int j = 0; j < inputArray.length - 1; j++) {
                inputArray[j] = inputArray[j + 1];
            }

            inputArray[inputArray.length - 1] = temp;
        }

        System.out.println("Input Array After Left Rotation By " + n + " Positions :");

        System.out.println(Arrays.toString(inputArray));
    }
}
