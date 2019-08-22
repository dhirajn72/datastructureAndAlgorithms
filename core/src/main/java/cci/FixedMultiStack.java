package cci;

import java.util.EmptyStackException;

/**
 * @author Dhiraj
 * @date 03/07/19
 */
public class FixedMultiStack {
    private int numberOfStack = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public FixedMultiStack(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStack];
        sizes = new int[numberOfStack];
    }

    public void push(int stackNum, int value) {
        if (isFull(stackNum))
            throw new FullStackException("Stack is full");
        sizes[stackNum]++;
        values[indexOfTop(stackNum)] = value;
    }
    public int pop(int stackNum) {
        if (isEmpty(stackNum))
            throw new EmptyStackException();
        int topIndex = indexOfTop(stackNum);
        int value = values[topIndex];
        values[topIndex] = 0;
        sizes[stackNum]--;
        return value;
    }

    public int peek(int stackNum) {
        if (isEmpty(stackNum))
            throw new EmptyStackException();
        return values[indexOfTop(stackNum)];
    }

    private boolean isEmpty(int stackNum) {
        return sizes[stackNum] == 0;
    }

    private int indexOfTop(int stackNum) {
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }

    private boolean isFull(int stackNum) {
        return sizes[stackNum] == stackCapacity;
    }

    public static void main(String[] args) {

        FixedMultiStack s= new FixedMultiStack(5);
        s.push(1,1);
        s.push(1,2);
        s.push(1,3);
        s.push(1,4);
        s.push(1,5);
        /*s.push(1,6);
        s.push(1,7);
        s.push(1,8);
        s.push(1,9);
        s.push(1,3);*/
        //s.push(1,1);
        //s.push(1,2);
        //s.push(1,3);

        s.push(0,10);
        s.push(0,20);
        s.push(0,30);
        s.push(0,40);
        s.push(0,50);
       /* s.push(0,60);
        s.push(0,70);
        s.push(0,80);
        s.push(0,90);
        s.push(0,30);*/

        s.push(2,100);
        s.push(2,200);
        s.push(2,300);
        s.push(2,400);
        s.push(2,500);
        /*s.push(2,600);
        s.push(2,700);
        s.push(2,800);
        s.push(2,900);
        s.push(2,300);*/



        System.out.println(s);
        System.out.println(s.pop(0));
        System.out.println(s.pop(0));
        System.out.println(s.pop(0));
        System.out.println(s.pop(0));
        System.out.println(s.pop(0));
        /*System.out.println(s.pop(0));
        System.out.println(s.pop(0));
        System.out.println(s.pop(0));
        System.out.println(s.pop(0));
        System.out.println(s.pop(0));*/

        System.out.println(s.pop(1));
        System.out.println(s.pop(1));
        System.out.println(s.pop(1));
        System.out.println(s.pop(1));
        System.out.println(s.pop(1));
        /*System.out.println(s.pop(1));
        System.out.println(s.pop(1));
        System.out.println(s.pop(1));
        System.out.println(s.pop(1));
        System.out.println(s.pop(1));*/

        System.out.println(s.pop(2));
        System.out.println(s.pop(2));
        System.out.println(s.pop(2));
        System.out.println(s.pop(2));
        System.out.println(s.pop(2));
        /*System.out.println(s.pop(2));
        System.out.println(s.pop(2));
        System.out.println(s.pop(2));
        System.out.println(s.pop(2));
        System.out.println(s.pop(2));*/
        //System.out.println(s.pop(1));





        System.out.println();





    }
}
