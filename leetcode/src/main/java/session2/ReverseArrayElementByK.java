package session2;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 26/08/19
 */
public class ReverseArrayElementByK {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(Arrays.toString(_reverseByK(arr,3)));

    }
    private static int[] _reverseByK(int[] arr, int k) {
        int count=0,lastIndex=0;
        Stack<Integer> s=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
            count++;
            if (count==k){
                int index=lastIndex;
                while (!s.isEmpty())
                    arr[index++]=s.pop();
                count=0;
                lastIndex=index;
            }
        }
        s.clear();
        for (int i = lastIndex; i <arr.length ; i++) {
            s.push(arr[i]);
        }
        while (!s.isEmpty())
            arr[lastIndex++]=s.pop();
        return arr;
    }
}
