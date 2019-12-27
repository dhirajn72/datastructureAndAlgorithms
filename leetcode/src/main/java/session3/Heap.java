package session3;

/**
 * @author Dhiraj
 * @date 01/12/19
 */
public class Heap {

    public static void main(String[] args) {
        int[] arr={5,6,2,1,7,3,4,5,6,8,9,0,2,3,4};
        Heap heap=new Heap(arr.length);
        for (int i:arr)
            heap.insert(i);
        while (heap.getCurrent()!=0)
            System.out.print(heap.remove().data+", ");

    }



    private Node[] arr;
    private int max;
    private int current;

    public Heap(int max) {
        this.max = max;
        arr=new Node[max];
    }

    public void insert(int data){
        if (current==max)
            return;
        Node node=new Node(data);
        arr[current]=node;
        trickleUp(current++);
    }

    public int getCurrent() {
        return current;
    }

    private void trickleUp(int index) {
        int parent=(index-1)/2;
        Node bottom=arr[index];
        while (index>0 && arr[parent].data<bottom.data){
            arr[index]=arr[parent];
            index=parent;
            parent=(parent-1)/2;
        }
        arr[index]=bottom;
    }

    public Node remove(){
        Node top=arr[0];
        arr[0]=arr[--current];
        arr[current]=null;
        trickleDown(0);
        return top;
    }

    private void trickleDown(int index) {
        int largeChild=0;
        Node top=arr[index];
        while (index<current/2){
            int leftchild=2*index+1;
            int rightchild=2*index+2;
            if (rightchild<current && arr[leftchild].data<arr[rightchild].data)
                largeChild=rightchild;
            else
                largeChild=leftchild;
            if (top.data>=arr[largeChild].data)break;
            arr[index]=arr[largeChild];
            index=largeChild;
        }
        arr[index]=top;
    }


    class Node{
        private int data;
        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }
}
