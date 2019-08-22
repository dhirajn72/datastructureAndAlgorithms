package com.karumanchi;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author Dhiraj
 * @date 21/07/19
 */
public class StackUsingArray {
    private final int stack=3;
    private int capacity;
    private int[] arr;
    private int[] stackNumber;

    public StackUsingArray(int capacity) {
        this.capacity= capacity;
        this.arr= new int[capacity*stack];
        this.stackNumber=new int[stack];
    }

    public void push(int stackNum,int data){
        if (isFull(stackNum))
            throw new StackFullException();
        stackNumber[stackNum]++;
        arr[topIndex(stackNum)]=data;
    }

    public int pop(int stackNum){
        if (ifEmpty(stackNum))
            throw new EmptyStackException();
        int top=topIndex(stackNum);
        int remove=arr[top];
        arr[top]=-1;
        stackNumber[stackNum]--;
        return remove;
    }

    private boolean ifEmpty(int stackNum) {
        return stackNumber[stackNum]==0;
    }


    private int topIndex(int stackNum) {
        int offset=stackNum*capacity;
        int n=stackNumber[stackNum];
        return offset+n-1;
    }

    private boolean isFull(int stack) {
        return stackNumber[stack]==capacity;
    }

    @Override
    public String toString() {
        return "StackUsingArray{" +
                "stack=" + stack +
                ", capacity=" + capacity +
                ", arr=" + Arrays.toString(arr) +
                ", stackNumber=" + Arrays.toString(stackNumber) +
                '}';
    }

    public static void main(String[] args) {
        StackUsingArray s= new StackUsingArray(4);
        s.push(0,1);
        s.push(0,2);
        s.push(0,3);
        s.push(0,4);
        //s.push(0,4);

        s.push(1,1);
        s.push(1,2);
        s.push(1,3);
        s.push(1,4);

        s.push(2,1);
        s.push(2,2);
        s.push(2,3);
        s.push(2,4);
        System.out.println(s);
        System.out.println(s.pop(2));
        System.out.println(s.pop(2));
        System.out.println(s.pop(2));
        System.out.println(s.pop(2));
       // System.out.println(s.pop(2));
        System.out.println(s.pop(0));
        System.out.println(s.pop(0));
        System.out.println(s.pop(0));
        System.out.println(s.pop(0));
        System.out.println(s.pop(1));
        System.out.println(s.pop(1));
        System.out.println(s.pop(1));
        System.out.println(s.pop(1));
        System.out.println(s);
    }
}
