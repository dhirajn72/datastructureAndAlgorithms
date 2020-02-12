package session3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 04/01/20
 */
public class RightNextPointerToNextNode {


    public Node connect(Node root) {
        if (root==null)
            return root;
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        q.offer(null);
        List<Node> nodes=new ArrayList<>();
        while (!q.isEmpty()){
            Node temp=q.poll();
            if (temp!=null){
                nodes.add(temp);
                if (temp.left!=null)
                    q.offer(temp.left);
                if (temp.right!=null)
                    q.offer(temp.right);
            }
            else {
                for (int i = 0; i <nodes.size()-1 ; i++) {
                    nodes.get(i).next=nodes.get(i+1);
                }
                if (!q.isEmpty())
                    q.offer(null);
            }
        }
        return root;
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

}
