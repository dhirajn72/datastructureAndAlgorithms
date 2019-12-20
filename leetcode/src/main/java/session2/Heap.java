package session2;

/**
 * @author Dhiraj
 * @date 19/10/19
 */
public class Heap {
    private Node[] arr;
    int curr;
    int max;

    public Heap(int max) {
        this.arr = new Node[max];
        this.max = max;
    }

    public void insert(int data){
        if (curr==max)return;
        Node node=new Node(data);
        arr[curr]=node;
        trickleUp(curr++);
    }

    private void trickleUp(int index) {
        int parent=(index-1)/2;
        Node bottom=arr[index];
        while (index>0 && arr[parent].data>bottom.data){
            arr[index]=arr[parent];
            index=parent;
            parent=parent-1;
        }
        arr[index]=bottom;
    }

    public int remove(){
        Node top=arr[0];
        arr[0]=arr[--curr];
        arr[curr]=null;
        trickleDown(0);
        return top.data;
    }

    private void trickleDown(int index) {
        Node top=arr[index];
        int largeChild=0;
        while (index<curr/2){
            int leftChild=2*index+1;
            int rightChild=2*index+2;
            if (rightChild<curr && arr[leftChild].data>arr[rightChild].data)
                largeChild=rightChild;
            else
                largeChild=leftChild;
            if (top.data<=arr[largeChild].data)break;
            arr[index]=arr[largeChild];
            index=largeChild;
        }
        arr[index]=top;
    }

    public int getCurr() {
        return curr==0?Integer.MIN_VALUE:curr;
    }


    class Node{
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        int[] arr={3,4,1,9,0,8,7,5,6};
        Heap heap=new Heap(arr.length);
        for (int i:arr)
            heap.insert(i);
        while (heap.getCurr()!=Integer.MIN_VALUE){
            System.out.print(heap.remove()+", ");

        }


    }





}
