package questions;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 15/06/19
 */
public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 2, 1, 5, 6}; // 10
        System.out.println(findLargestRectangle(arr1));
        int[] arr2 = {2, 3, 4, 2, 1, 5, 6}; // 10
        System.out.println(findLargestRectangle(arr2));
        int[] arr3 = {6, 2, 5, 4, 5, 1, 6}; // 12
        System.out.println(findLargestRectangle(arr3));


    }

    /**
     *
     * This also works
     *
     * @param arr
     * @return
     */
    /*private static int findLargestRectangle(int[] histo) {
        Stack<Integer> heights = new Stack<>();
        Stack<Integer> indexes = new Stack<>();

        int largestSize = 0;
        for (int i = 0; i < histo.length; i++) {
            if (heights.isEmpty() || histo[i] > heights.peek()) {
                heights.push(histo[i]);
                indexes.push(i);
            } else if (histo[i] < heights.peek()) {
                int lastIndex = 0;
                while (!heights.isEmpty() && histo[i] < heights.peek()) {
                    lastIndex = indexes.pop();
                    int tempArea = heights.pop() * (i - lastIndex);
                    if (largestSize < tempArea)
                        largestSize = tempArea;
                }
                heights.push(histo[i]);
                indexes.push(lastIndex);
            }
        }

        while (!heights.isEmpty()) {
            int tempArea = heights.pop() * (histo.length - indexes.pop());
            if (largestSize < tempArea)
                largestSize = tempArea;
        }
        return largestSize;
    }*/

    private static int findLargestRectangle(int[] arr) {
        Stack<Integer> s = new Stack<>();
        if (arr == null || arr.length == 0)
            return 0;
        int maxArea = 0;
        int i = 0;
        while (i < arr.length) {
            if (s.isEmpty() || arr[s.peek()] <= arr[i])
                s.push(i++);
            else {
                int top = s.pop();
                maxArea = Math.max(maxArea, arr[top] * (s.isEmpty() ? i : i - s.peek() - 1));
            }
        }
        while (!s.isEmpty()) {
            int top = s.pop();
            maxArea = Math.max(maxArea, arr[top] * (s.isEmpty() ? i : i - s.peek() - 1));
        }
        return maxArea;
    }
}
