package cci;

/**
 * @author Dhiraj
 * @date 24/06/19
 */
public class LinkedList {
    private int size;
    private ListNode root;

    public void add(int data){
        if (root==null)
            root=new ListNode(data);
        else {
            ListNode temp=root,prev=null;
            while (temp!=null){
                prev=temp;
                temp=temp.getNext();
            }
            prev.setNext(new ListNode(data));
        }
        size++;
    }
    public void remove(int index){

        if (index>size || index<0 || size==index)
            throw new IllegalArgumentException("Invalid index :"+index);
        else {
            if (index==0){
                ListNode temp=root;
                root=root.getNext();
                temp.setNext(null);
                System.out.println("Removed: "+temp.getData());
            }else {
                ListNode prev=root,temp=root;
                int count=0;
                while (prev!=null && count<index){
                    temp=prev;
                    prev=prev.getNext();
                    count++;
                }
                temp.setNext(temp.getNext().getNext());
            }
        }
        size--;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder= new StringBuilder("[");
        ListNode temp=root;
        while (temp!=null){
            builder.append(temp.getData()).append(",");
            temp=temp.getNext();
        }
        builder.append("]");
        return builder.toString();
    }


    public static void main(String[] args) {
        LinkedList list= new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);
        System.out.println(list.getSize());
        list.remove(1);
        list.remove(1);
        System.out.println(list);

    }
}
