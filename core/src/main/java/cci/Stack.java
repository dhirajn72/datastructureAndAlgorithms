package cci;

/**
 * @author Dhiraj
 * @date 25/06/19
 */
public class Stack {
    private int size;
    private ListNode head;

    public void push(int data){
        if (head==null)head= new ListNode(data);
        else {
            ListNode node= new ListNode(data);
            node.setNext(head);
            head=node;
        }
        size++;
    }

    public int pop(){
        _validateSize();
        ListNode node=head;
        head=head.getNext();
        node.setNext(null);
        size--;
        return node.getData();
    }

    private boolean isEmpty() {
        return size==0;
    }

    public int peek(){
        _validateSize();
        return head.getData();
    }

    public void _validateSize() {
        if (isEmpty()){
            throw new IllegalArgumentException("Empty Stack!");
        }
    }
    private int size() {
        return size;
    }


    @Override
    public String toString() {
        StringBuilder builder= new StringBuilder("[");
        if (isEmpty())return builder.append("]").toString();
        ListNode temp=head;
        while (temp!=null){
            builder.append(temp.getData()).append(", ");
            temp=temp.getNext();
        }
        builder.delete(builder.length()-2,builder.length());
        builder.append("]");
        return builder.substring(0,builder.length());
    }

    public static void main(String[] args) {
        Stack stack= new Stack();
        stack.push(80);
        stack.push(90);
        stack.push(70);
        stack.push(50);
        stack.push(60);
        System.out.println(stack);
        System.out.println(stack.size());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.size());
    }

}
