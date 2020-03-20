package session2;

import leetcode.TreeNode_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 27/08/19
 */
public class KthSmallestElementInTree {
    public static void main(String[] args) {
        System.out.println(kthSmallest(new TreeNode_1(2),2));

    }

    public  static int kthSmallest(TreeNode_1 root, int k) {
        List<Integer> preOrdered=_getPostOrderOfTree(root);
        if (preOrdered.size()<k)return 0;
        Heap heap=new Heap(preOrdered.size());
        for (int i:preOrdered)
            heap.insert(i);
        int min=0;
        while (k-->0)
            min=heap.remove();
        return min;
    }

    private static List<Integer> _getPostOrderOfTree(TreeNode_1 root) {
        if (root==null)return null;
        else {
            Stack<TreeNode_1> s=new Stack<>();
            s.push(root);
            List<Integer> integers=new ArrayList<>();
            while (!s.isEmpty()){
                TreeNode_1 temp=s.pop();
                if (temp!=null){
                    integers.add(temp.val);
                    if (temp.right!=null)
                        s.push(temp.right);
                    if (temp.left!=null)
                        s.push(temp.left);
                }
            }
            return integers;
        }
    }

    static class Heap{
        private Node[] arr;
        private int currentSize;
        private int maxSize;

        public Heap(int maxSize) {
            this.maxSize = maxSize;
            arr=new Node[maxSize];
        }

        public void insert(int data){
            if (currentSize==maxSize)
                return;
            Node node=new Node(data);
            arr[currentSize]=node;
            trickleUp(currentSize++);
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
            arr[0]=arr[--currentSize];
            arr[currentSize]=null;
            trickleDown(0);
            return top.data;
        }

        private void trickleDown(int index) {
            Node top=arr[index];
            int largeChild=0;
            while (index<currentSize/2){
                int leftChild=2*index+1;
                int rightChild=2*index+2;
                if (rightChild<currentSize && arr[leftChild].data>arr[rightChild].data)
                    largeChild=rightChild;
                else
                    largeChild=leftChild;
                if (top.data<=arr[largeChild].data)break;
                arr[index]=arr[largeChild];
                index=largeChild;
            }
            arr[index]=top;
        }


        public int getCurrentSize() {
            return currentSize;
        }
    }
    static class Node{
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}
