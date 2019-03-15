package interview;

import com.java.ds.client.DataUtils;
import com.java.ds.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 17/02/19
 */
public class PostOrderIterative {
    public static ArrayList<Integer> postOrder(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        BinaryTreeNode prev = null;
        while (!stack.isEmpty()) {
            BinaryTreeNode curr = stack.peek();
            if (prev == null || prev.left == curr || prev.right == curr) {
                if (curr.left != null)
                    stack.push(curr.left);
                else if (curr.right != null)
                    stack.push(curr.right);
            } else if (curr.left == prev) {
                if (curr.right != null) {
                    stack.push(curr.right);
                }
            }
            else {
                res.add(curr.data);
                stack.pop();
            }
            prev=curr;
        }
        return res;
    }

    public static void main(String[] args) {
        BinaryTreeNode root= DataUtils.getBinaryOrderedTree();
        System.out.println(postOrder(root));
    }



}
