package session2;

import leetcode.FlattenTreeToList;
import leetcode.TreeNode;

/**
 * @author Dhiraj
 * @date 15/09/19
 */
public class BuildTreeFromPreorderandInorder {

    public static void main(String[] args) {
        int[] preOrder={1,2,4,5,3,6,7};
        int[] inOrder={4,2,5,1,6,3,7};
        TreeNode root=buildTree(preOrder,inOrder);
        System.out.println(FlattenTreeToList._preOrder(root));
        System.out.println(BinaryTreeInorderTraversal.inorderTraversal(root));


    }


    public  static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder==null||inorder==null||preorder.length!=inorder.length)return null;
        return _buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    private static TreeNode _buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart>preEnd||inStart>inEnd)return null;
        int data=preorder[preStart];
        TreeNode root=new TreeNode(data);
        int offset=inStart;
        for (;offset<inEnd;offset++){
            if (inorder[offset]==data) break;
        }
        root.left=_buildTree(preorder,preStart+1,preStart+offset-inStart,inorder,inStart,offset-1);
        root.right=_buildTree(preorder,preStart+offset-inStart+1,preEnd, inorder,offset+1,inEnd);
        return root;
    }
}
