package questions;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 15/06/19
 */
public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int[] arr2 = {2, 3, 4, 2, 1, 5, 6}; // 10
        System.out.println(findLargestRectangle(arr2));
        int[] arr3 = {6, 2, 5, 4, 5, 1, 6}; // 12
        System.out.println(findLargestRectangle(arr3));
        int[] arr4={5,1,5,4,4,3,4};
        System.out.println(findLargestRectangle(arr4));

    }

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
