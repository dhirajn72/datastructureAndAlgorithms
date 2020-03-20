package session2;

import leetcode.TreeNode_1;

/**
 * @author Dhiraj
 * @date 22/10/19
 */
public class TreeFromPreAndInorder {

    public static void main(String[] args) {
        int[] preOrder={1,2,4,5,3,6,7};
        int[] inOrder={4,2,5,1,6,3,7};
        TreeNode_1 root=buildTree(preOrder,inOrder);
        System.out.println(root);
        _levelOrder(root);

    }

    private static void _levelOrder(TreeNode_1 root) {
    }

    public static TreeNode_1 buildTree(int[] preorder, int[] inorder) {
        if (preorder==null||inorder==null||preorder.length!=inorder.length)return null;
        return _buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);

    }

    private static TreeNode_1 _buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart>preEnd||inStart>inEnd)return null;
        int data=preorder[preStart];
        TreeNode_1 root=new TreeNode_1(data);
        int offSet=inStart;
        for (; offSet <inEnd ; offSet++) {
            if (inorder[offSet]==data)break;
        }
        root.left=_buildTree(preorder,preStart+1,preStart+offSet-inStart,inorder,inStart,offSet-1);
        root.right=_buildTree(preorder,preStart+offSet-inStart+1,preEnd,inorder,offSet+1,inEnd);
        return root;
    }
}
