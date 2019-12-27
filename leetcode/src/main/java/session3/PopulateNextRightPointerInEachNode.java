package session3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 14/12/19
 */
public class PopulateNextRightPointerInEachNode {

    public static void main(String[] args) {



    }


    public static Node connect(Node root) {
        if (root==null)return null;
        else {
            Queue<Node> q=new LinkedList<>();
            q.offer(root);
            q.offer(null);
            List<Node> list=new ArrayList<>();
            while (!q.isEmpty()){
                Node temp=q.poll();
                if (temp!=null){
                    list.add(temp);
                    if (temp.left!=null)
                        q.offer(temp.left);
                    if (temp.right!=null)
                        q.offer(temp.right);
                }
                else {
                    //lists.add(new ArrayList<>(list));
                    for (int i = 0; i < list.size()-1; i++) {
                        list.get(i).next=list.get(i+1);
                    }
                    if (!q.isEmpty())
                        q.offer(null);
                    list.clear();
                }
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
