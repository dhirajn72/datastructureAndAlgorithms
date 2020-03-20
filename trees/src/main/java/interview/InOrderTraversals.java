package interview;

import com.java.ds.client.DataUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 15/07/19
 */
public class InOrderTraversals {
    public static void main(String[] args) {


        TreeNode root=DataUtils.getTreeNode();
        System.out.println(root);
        System.out.println(inorderTraversal(root));

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> s= new Stack<>();
        List<Integer> integers= new ArrayList<>();
        while (!s.isEmpty() || root!=null){
            if (root!=null){
                s.push(root);
                root=root.left;
            }else {
                TreeNode temp=s.pop();
                integers.add(temp.val);
                root=temp.right;
            }
        }
        return integers;
    }
}
