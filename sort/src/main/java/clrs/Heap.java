package clrs;

/**
 * @author Dhiraj
 * @date 27/12/19
 */
public class Heap {
    private Node[] arr;
    private int curr;
    private int max;

    public Heap(int max) {
        this.max = max;
        arr=new Node[max];
    }

    public void insert(int data){
        if (curr==max)return;
        Node node=new Node(data);
        arr[curr]=node;
        trickleUp(curr++);
    }

    private void trickleUp(int index) {
        Node bottom=arr[index];
        int parent=(index-1)/2;
        while (index>0 && arr[parent].data<bottom.data){
            arr[index]=arr[parent];
            index=parent;
            parent=(parent-1)/2;
        }
        arr[index]=bottom;
    }

    public int remove(){
        if (getCurrent()==0)
            return 0;

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
            int leftChild=(2*index)+1;
            int rightChild=(2*index)+2;
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

    public int getCurrent() {
        return curr;
    }


    private class Node{
        int data;

        public Node(int data) {
            this.data = data;
        }
    }


    public static void main(String[] args) {
        int[] arr={5,9,4,6,7,1,2,8,3,2};
        Heap heap=new Heap(arr.length);
        for (int i:arr)
            heap.insert(i);
        while (heap.getCurrent()!=0){
            System.out.print(heap.remove()+",");
        }
    }
}
