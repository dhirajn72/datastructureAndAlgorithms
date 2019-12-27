package session2;

import leetcode.DataUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 19/10/19
 */
public class PopulateNextRightPointerInEachNode {

    public static void main(String[] args) {
        Node root= DataUtil.getNode();
        root=connect(root);
        List<List<Node>> levelOrder=_levelOrder(root);
        for (List<Node> nodeList:levelOrder){
            for (Node node:nodeList){
                System.out.print(node.val+","+node.next+",");
                //System.out.print(node.next+",");
                System.out.println();

            }
            System.out.println();
        }
    }


    public static Node connect(Node root) {
        if (root==null)return null;
        List<List<Node>> levelOrder=_levelOrder(root);
        for (List<Node> nodeList:levelOrder){
            Node temp=nodeList.get(0);
            for (int i=1;i<nodeList.size();i++){
                Node next=nodeList.get(i);
                temp.next=next;
                temp=next;
            }
        }
        return root;
    }

    private static List<List<Node>> _levelOrder(Node root) {
        if (root==null)return null;
        else {
            Queue<Node> q=new LinkedList<>();
            q.offer(root);
            q.offer(null);
            List<List<Node>> nodes=new ArrayList<>();
            List<Node> nodeList=new ArrayList<>();
            while (!q.isEmpty()){
                Node temp=q.poll();
                if (temp!=null){
                    nodeList.add(temp);
                    if (temp.left!=null)
                        q.offer(temp.left);
                    if (temp.right!=null)
                        q.offer(temp.right);
                }
                else {
                    nodes.add(new ArrayList<>(nodeList));
                    if (!q.isEmpty())
                        q.offer(null);
                    nodeList.clear();
                }
            }
            return nodes;
        }
    }


    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val,Node _left,Node _right,Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    ", next=" + next +
                    '}';
        }
    }
}
