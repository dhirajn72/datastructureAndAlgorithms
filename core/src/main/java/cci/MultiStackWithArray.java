package cci;

import java.util.EmptyStackException;

/**
 * @author Dhiraj
 * @date 03/07/19
 */
public class MultiStackWithArray {
    private int numberOfStack = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public MultiStackWithArray(int stackCapacity) {
        this.stackCapacity = stackCapacity;
        values=new int[numberOfStack*stackCapacity];
        sizes=new int[numberOfStack];
    }

    public void push(int stackNumber,int element){
        if (isFull(stackNumber))
            throw new FullStackException("Stack is full !");
        sizes[stackNumber]++;
        values[indexOfTop(stackNumber)]=element;
    }

    public int pop(int stackNumber){
        if (isEmpty(stackNumber))
            throw new EmptyStackException();
        int topIndex=indexOfTop(stackNumber);
        int element=values[topIndex];
        values[topIndex]=0;
        sizes[stackNumber]--;
        return element;
    }

    private boolean isEmpty(int stackNumber) {
        return sizes[stackNumber]==0;
    }

    /***
     * This is trickey, notice the offset and size
     * @param stackNumber
     * @return
     */
    private int indexOfTop(int stackNumber) {
        int offset=stackNumber*stackCapacity;
        int size=sizes[stackNumber];
        return offset+size-1;
    }
    public int peek(int stackNumber){
        if (isEmpty(stackNumber))
            throw new EmptyStackException();
        return values[indexOfTop(stackNumber)];
    }


    private boolean isFull(int stackNumber) {
        return sizes[stackNumber]==stackCapacity;
    }

    public static void main(String[] args) {
        MultiStackWithArray s= new MultiStackWithArray(3);
        s.push(0,1);
        s.push(0,2);
        s.push(0,3);

        /*System.out.println(s.pop(0));
        System.out.println(s.pop(0));
        System.out.println(s.pop(0));
        System.out.println(s.pop(0));*/

        /*System.out.println(s.peek(0));
        System.out.println(s.peek(0));
        System.out.println(s.peek(0));
*/




        System.out.println(s);
        System.out.println();
    }


}
