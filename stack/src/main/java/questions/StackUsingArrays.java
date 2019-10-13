package questions;

import com.karumanchi.StackFullException;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author Dhiraj
 * @date 15/09/19
 */
public class StackUsingArrays {
    int[] arr;
    int top,size;

    public StackUsingArrays(int size) {
        this.size = size;
        arr=new int[size];
    }

    public void push(int data){
        if (top==size)
            throw new StackFullException();
        arr[top++]=data;
    }
    public int pop(){
        if (top==0)
            throw new EmptyStackException();
        return arr[--top];
    }

    public int peek(){
        if (top==0)
            throw new EmptyStackException();
        return arr[top-1];
    }

    @Override
    public String toString() {
        return "StackUsingArrays{" +
                "arr=" + Arrays.toString(arr) +
                ", top=" + top +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        StackUsingArrays s = new StackUsingArrays(7);
        //System.out.println(s.pop());
        s.push(10);
        System.out.println(s.pop());
        System.out.println(s);

    }

}
