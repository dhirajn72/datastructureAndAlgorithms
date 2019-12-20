package session2;

import leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 19/10/19
 */
public class BSTIterator {

    Heap heap;
    public BSTIterator(TreeNode root) {
        int treeSize=_getTreeSize(root);
        heap=new Heap(treeSize);
        _insertIntoHeap(root);
    }

    private void _insertIntoHeap(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            TreeNode temp=q.poll();
            if (temp!=null){
                heap.insert(temp.val);
                if (temp.left!=null)
                    q.offer(temp.left);
                if (temp.right!=null)
                    q.offer(temp.right);
            }
        }
    }

    private int _getTreeSize(TreeNode root) {
        int count=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            TreeNode temp=q.poll();
            if (temp!=null){
                count++;
                if (temp.left!=null)
                    q.offer(temp.left);
                if (temp.right!=null)
                    q.offer(temp.right);
            }
        }
        return count;
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        return heap.remove();
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return heap.getCurr()!=0;
    }

    class Heap{
        Node[] arr;
        int curr;
        int max;

        public Heap(int max) {
            this.max = max;
            this.arr=new Node[max];
        }

        public void insert(int data){
            if (curr==max)
                return;
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
                parent=(parent-1)/2;
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
            return curr;
        }
    }
    class Node{
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}