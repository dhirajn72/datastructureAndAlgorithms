package interview;

import com.java.ds.client.DataUtils;
import com.java.ds.trees.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 17/02/19
 */
public class PreOrderIterative {
    public static ArrayList<Integer> preOrder(BinaryTreeNode root){
        ArrayList<Integer> res= new ArrayList<>();
        if (root==null)
            return res;
        Stack<BinaryTreeNode> stack= new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode temp = stack.pop();
            res.add(temp.getData());
            if (temp.right != null)
                stack.push(temp.right);
            if (temp.left != null)
                stack.push(temp.left);
        }
        return res;
    }

    public static void main(String[] args) {
        BinaryTreeNode root= DataUtils.getBinaryOrderedTree();
        System.out.println(preOrder(root));

    }
}
