package special;


import java.util.Stack;

/**
 * @author Dhiraj
 * @date 06/07/19
 */
public class LargestHistogram {
    public static void main(String[] args) {
        int[] arr=new int[]{3,5,4,2,3};
        System.out.println(_largestHistogram(arr));
    }

    private static int _largestHistogram(int[] arr) {
        if (arr==null)return 0;
        int area = 0;
        Stack<Integer> s = new Stack<>();
        int i = 0;
        while (i < arr.length) {
            if (s.isEmpty() || arr[s.peek()] <= arr[i]) {
                s.push(i);
                i++;
            } else {
                area = Math.max(area, (arr[s.pop()] * (s.isEmpty() ? i : i - s.peek() - 1)));
            }
        }
        while (!s.isEmpty()) {
            area = Math.max(area, (arr[s.pop()] * (s.isEmpty() ? i : i - s.peek() - 1)));
        }
        return area;
    }
}
