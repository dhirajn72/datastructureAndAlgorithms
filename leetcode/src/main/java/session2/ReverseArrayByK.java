package session2;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 30/08/19
 */
public class ReverseArrayByK {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        System.out.println(Arrays.toString(arr));
        int k=3;
        _reverse(arr,k);
        System.out.println(Arrays.toString(arr));

    }
    private static void _reverse(int[] arr, int k) {
        Stack<Integer> stack=new Stack<>();
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
            if (stack.size()==3){
                while (!stack.isEmpty())
                    arr[index++]= stack.pop();
            }
        }
        while (!stack.isEmpty())
            arr[index++]= stack.pop();
    }
}
