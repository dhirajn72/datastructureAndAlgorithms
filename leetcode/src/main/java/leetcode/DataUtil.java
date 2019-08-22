package leetcode;

/**
 * @author Dhiraj
 * @date 07/08/19
 */
public class DataUtil {
    static TreeNode getTreeData(){
        /*
                 1
               /  \
             2     3
            / \   / \
           4  5  6   7


         */

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        return root;
    }
    static TreeNode getTreeDataPreOrdered(){
        /*
                 1
               /  \
             2     5
            / \   / \
           3  4  6   7


         */

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        return root;
    }


    static TreeNode getBinarySearchTreeData(){
        TreeNode root=new TreeNode(100);
        root.left=new TreeNode(75);
        root.right=new TreeNode(200);
        root.right.left=new TreeNode(150);
        root.right.right=new TreeNode(300);
        root.left.left=new TreeNode(50);
        root.left.right=new TreeNode(80);
        root.left.right.right=new TreeNode(90);
        root.left.left.left=new TreeNode(45);
        root.left.left.right=new TreeNode(65);
        return root;
    }
}
