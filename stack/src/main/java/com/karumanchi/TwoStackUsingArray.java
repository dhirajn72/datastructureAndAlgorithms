package com.karumanchi;

import java.util.EmptyStackException;

/**
 * @author Dhiraj
 * @date 05/07/19
 */
public class TwoStackUsingArray {
    public static void main(String[] args) {
        TwoStackWithOneArray s= new TwoStackWithOneArray(3);
        s.push(0,1);
        s.push(0,2);
        s.push(0,3);
        s.push(1,4);
        s.push(1,5);
        s.push(1,6);
        s.push(2,7);
        s.push(2,8);
        s.push(2,9);

        System.out.println(s.pop(1));
        System.out.println(s.pop(1));
        System.out.println(s.pop(1));

        System.out.println(s);
        System.out.println();


    }
}

class TwoStackWithOneArray {
    private final int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] stackNumbers;

    public TwoStackWithOneArray(int stackCapacity) {
        this.stackCapacity = stackCapacity;
        values = new int[numberOfStacks * stackCapacity];
        stackNumbers = new int[numberOfStacks];
    }

    public void push(int stackNumber, int value) {
        if (isFull(stackNumber))
            throw new StackFullException();
        stackNumbers[stackNumber]++;
        values[indexOfTop(stackNumber)] = value;
    }

    private int indexOfTop(int stackNumber) {
        int offset = stackNumber * stackCapacity;
        int size = stackNumbers[stackNumber];
        return offset + size - 1;
    }

    public int pop(int stackNumber){
        if (isEmpty(stackNumber))
            throw new EmptyStackException();
        int index=indexOfTop(stackNumber);
        int popped=values[index];
        values[index]=-1;
        stackNumbers[stackNumber]--;
        return popped;
    }

    private boolean isEmpty(int stackNumber) {
        return stackNumbers[stackNumber]==0;
    }


    private boolean isFull(int stackNumber) {
        return stackNumbers[stackNumber] == stackCapacity;
    }


}