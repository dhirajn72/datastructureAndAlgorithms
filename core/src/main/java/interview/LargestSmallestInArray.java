package interview;

/**
 * @author Dhiraj
 * @date 30/01/19
 */
public class LargestSmallestInArray {
    public static void main(String[] args) {
        int[] arr = {56, 89, 2, 100, 67, 200, 1, 90};
        getSmallestAndLargestElement(arr);
    }

    public static void getSmallestAndLargestElement(int[] arr) {
        int min = 0;
        int max = Integer.MIN_VALUE;
        /*for (int item:arr){
            if (item<min){
                min=item;
            }
            if (item>max){
                max=item;
            }
        }*/

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int number : arr) {
            if (number > largest) {
                largest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Min is::" + min);
        System.out.println("Max is::" + max);

    }


}
