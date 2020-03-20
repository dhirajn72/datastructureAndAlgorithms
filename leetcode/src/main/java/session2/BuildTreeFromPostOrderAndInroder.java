package session2;

import leetcode.TreeNode_1;

/**
 * @author Dhiraj
 * @date 15/09/19
 */
public class BuildTreeFromPostOrderAndInroder {

    public static void main(String[] args) {
        int[] postOrder={4,5,2,6,7,3,1};
        int[] inOrder={4,2,5,1,6,3,7};
        TreeNode_1 root=buildTree(postOrder,inOrder);
        System.out.println(root);
        System.out.println(BinaryTreeInorderTraversal.inorderTraversal(root));
    }


    public static TreeNode_1 buildTree(int[] inorder, int[] postorder) {
        if (inorder==null||postorder==null||inorder.length!=postorder.length)return null;
        return _buildTree(postorder,0,postorder.length-1,inorder,0,inorder.length-1);
    }

    private static TreeNode_1 _buildTree(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd) {
        if (postStart>postEnd||inStart>inEnd)
            return null;
        int data=postorder[postEnd];
        TreeNode_1 root=new TreeNode_1(data);
        int offset=inStart;
        for (;offset<inEnd;offset++){
            if (inorder[offset]==data)break;
        }
        root.left=_buildTree(postorder,postStart,postStart+offset-inStart-1,inorder,inStart,offset-1);
        root.right=_buildTree(postorder,postStart+offset-inStart,postEnd-1,inorder,offset+1,inEnd);
        return root;

    }

}
