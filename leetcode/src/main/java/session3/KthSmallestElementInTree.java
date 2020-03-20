package session3;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 20/12/19
 */
public class KthSmallestElementInTree {

    public static void main(String[] args) {
        TreeNode_1 root= DataUtil.getBinarySearchTreeData();
        System.out.println(kthSmallest(root,7));


    }


    public static int kthSmallest(TreeNode_1 root, int k) {
        if (root == null) return 0;
        else {
            Queue<TreeNode_1> q = new LinkedList<>();
            q.offer(root);
            List<Integer> result = new ArrayList<>();
            while (!q.isEmpty()) {
                TreeNode_1 temp = q.poll();
                if (temp != null) {
                    result.add(temp.val);
                    if (temp.left != null)
                        q.offer(temp.left);
                    if (temp.right != null)
                        q.offer(temp.right);
                }
            }
            Heap heap=new Heap(result.size());
            for (int i:result)
                heap.insert(i);
            int i=0;
            int res=0;
            while (i<k){
                res=heap.remove();
                i++;
            }
           return res;
        }
    }

   static class Heap {
        private Node[] arr;
        private int max;
        private int curr;

        public Heap(int max) {
            this.max = max;
            this.arr = new Node[max];
        }

        public void insert(int e) {
            if (max == curr) return;
            Node node = new Node(e);
            arr[curr] = node;
            trickleUp(curr++);

        }

        private void trickleUp(int index) {
            int parent = (index - 1) / 2;
            Node bottom = arr[index];
            while (index > 0 && arr[parent].data > bottom.data) {
                arr[index] = arr[parent];
                index = parent;
                parent = (parent - 1) / 2;
            }
            arr[index] = bottom;
        }

        private int remove() {
            if (curr == 0) return 0;
            Node top = arr[0];
            arr[0] = arr[--curr];
            trickleDown(0);
            return top.data;
        }

        private void trickleDown(int index) {
            Node top = arr[index];
            int largeChild = 0;
            while (index < curr / 2) {
                int leftChild = 2 * index + 1;
                int rightChild = 2 * index + 2;
                if (rightChild < curr && arr[leftChild].data > arr[rightChild].data)
                    largeChild = rightChild;
                else
                    largeChild = leftChild;

                if (top.data<arr[largeChild].data)break;
                arr[index]=arr[largeChild];
                index=largeChild;
            }
            arr[index]=top;
        }

       public int getCurrent() {
           return curr;
       }
   }

    static class Node {
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

}

