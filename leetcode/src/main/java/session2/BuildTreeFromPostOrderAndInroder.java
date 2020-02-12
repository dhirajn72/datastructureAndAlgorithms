package session2;

import leetcode.TreeNode;

/**
 * @author Dhiraj
 * @date 15/09/19
 */
public class BuildTreeFromPostOrderAndInroder {

    public static void main(String[] args) {
        int[] postOrder={4,5,2,6,7,3,1};
        int[] inOrder={4,2,5,1,6,3,7};
        TreeNode root=buildTree(postOrder,inOrder);
        System.out.println(root);
        System.out.println(BinaryTreeInorderTraversal.inorderTraversal(root));
    }


    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder==null||postorder==null||inorder.length!=postorder.length)return null;
        return _buildTree(postorder,0,postorder.length-1,inorder,0,inorder.length-1);
    }

    private static TreeNode _buildTree(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd) {
        if (postStart>postEnd||inStart>inEnd)
            return null;
        int data=postorder[postEnd];
        TreeNode root=new TreeNode(data);
        int offset=inStart;
        for (;offset<inEnd;offset++){
            if (inorder[offset]==data)break;
        }
        root.left=_buildTree(postorder,postStart,postStart+offset-inStart-1,inorder,inStart,offset-1);
        root.right=_buildTree(postorder,postStart+offset-inStart,postEnd-1,inorder,offset+1,inEnd);
        return root;

    }

}
