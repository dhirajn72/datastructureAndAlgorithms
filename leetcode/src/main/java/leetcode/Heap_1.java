package leetcode;

/**
 * @author Dhiraj
 * @date 22/02/20
 */
public class Heap_1 {
    Node[] arr;
    int max;
    int curr;

    public Heap_1(int max) {
        this.max = max;
        arr=new Node[max];
    }

    public void insert(int data){
        if (max==curr)
            return;
        Node node=new Node(data);
        arr[curr]=node;
        trickleUp(curr++);
    }

    private void trickleUp(int index) {
        int parent=(index-1)/2;
        Node node=arr[index];
        while (index>0 && arr[parent].data<node.data){
            arr[index]=arr[parent];
            index=parent;
            parent=(parent-1)/2;
        }
        arr[index]=node;
    }
    public int remove(){
        if(curr==0)return 0;
        Node top=arr[0];
        arr[0]=arr[--curr];
        arr[curr]=null;
        trickleDown(0);
        return top.data;
    }

    private void trickleDown(int index) {
        int largeChild=0;
        Node top=arr[index];
        while (index < curr/2 ){
            int leftChild=2*index+1;
            int rightChild=2*index+2;
            if (rightChild<curr && arr[leftChild].data<arr[rightChild].data)
                largeChild=rightChild;
            else
                largeChild=leftChild;
            if (top.data>=arr[largeChild].data)break;
            arr[index]=arr[largeChild];
            index=largeChild;
        }
        arr[index]=top;
    }

    public static void main(String[] args) {
        Heap_1 heap=new Heap_1(6);
        heap.insert(4);
        heap.insert(3);
        heap.insert(1);
        heap.insert(5);
        heap.insert(2);
        heap.insert(6);
        while (heap.getCurrent()!=0){
            System.out.print(heap.remove()+",");
        }
    }

    public int getCurrent() {
        return curr;
    }

    class Node{
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}
