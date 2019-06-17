package interview;

import com.java.ds.client.DataUtils;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 17/02/19
 */
public class PostOrderIterative {
    public static void main(String[] args) {
        BinaryTreeNode root = DataUtils.getBinaryOrderedTree();
        System.out.println();
        _postOrderRecursive(root);
        System.out.println();
        System.out.println();
        postorderIterative(root);
        System.out.println();


    }
    public static void _postOrderRecursive(BinaryTreeNode root) {
        if (root != null) {
            _postOrderRecursive(root.getLeft());
            _postOrderRecursive(root.getRight());
            System.out.print(root.getData() + ",");


        }

    }

    public static void postorderIterative(BinaryTreeNode root) {
        Stack<BinaryTreeNode> stack = new Stack();
        Stack<Integer> out = new Stack();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode curr = stack.pop();
            out.push(curr.data);
            if (curr.left != null)
                stack.push(curr.left);
            if (curr.right != null)
                stack.push(curr.right);
        }
        while (!out.isEmpty()) {
            System.out.print(out.pop() + " ");
        }
    }


}
