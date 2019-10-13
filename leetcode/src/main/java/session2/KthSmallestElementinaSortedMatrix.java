package session2;

/**
 * @author Dhiraj
 * @date 28/08/19
 */
public class KthSmallestElementinaSortedMatrix {

    public static void main(String[] args) {
        int[][] matrix={{1,5,9},{10,11,13},{12,13,15}};
        int k=8;
        System.out.println(kthSmallest(matrix,k));

    }

    public static int kthSmallest(int[][] matrix, int k) {
        Heap heap=new Heap(matrix.length*matrix[0].length);
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                heap.insert(matrix[i][j]);
            }
        }
        int result=0;
        while (k-->0)
            result=heap.remove();
        return result;
    }


    static class Heap{
        Node[] arr;
        int current;
        int max;

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

        private void trickleUp(int index) {
            int parent=(index-1)/2;
            Node bottom=arr[index];
            while (index>0 && arr[parent].data>bottom.data){
                arr[index]=arr[parent];
                index=parent;
                parent=(parent-1)/2;
            }
            arr[index]=bottom;
        }
        public int remove(){
            Node top=arr[0];
            arr[0]=arr[--current];
            arr[current]=null;
            trickleDown(0);
            return top.data;
        }

        private void trickleDown(int index) {
            Node top=arr[index];
            int largeChild=0;
            while (index<current/2){
                int leftChild=2*index+1;
                int rightChild=2*index+2;
                if (rightChild<current && arr[leftChild].data>arr[rightChild].data )
                    largeChild=rightChild;
                else
                    largeChild=leftChild;

                if (top.data<=arr[largeChild].data)break;
                arr[index]=arr[largeChild];
                index=largeChild;
            }
            arr[index]=top;
        }

        public int getCurrent() {
            return current;
        }
    }

    static class Node{
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}
