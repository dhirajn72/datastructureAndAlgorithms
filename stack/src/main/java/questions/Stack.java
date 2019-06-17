package questions;

import com.java.stack.ListNode;

import java.util.EmptyStackException;

/**
 * @author Dhiraj
 * @date 16/06/19
 */
public class Stack {
    private int size;
    private ListNode top;

    public void push(int element) {
        ListNode node = new ListNode(element);
        if (size != 0) {
            node.setNext(top);
        }
        top = node;
        size++;
    }

    public int pop(){
        int temp=0;
        if (size()!=0){
            temp=top.getData();
            top=top.getNext();
        }
        else throw new EmptyStackException();
        size--;
        return temp;
    }
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "size=" + size +
                ", top=" + top +
                '}';
    }

    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s);
    }
}
