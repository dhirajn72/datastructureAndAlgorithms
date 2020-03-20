package session2;

import leetcode.TreeNode_1;

/**
 * @author Dhiraj
 * @date 22/10/19
 */
public class TreeFromPostAndInorder {

    public static void main(String[] args) {
        int[] postOrder={1,2,4,5,3,6,7};
        int[] inOrder={4,2,5,1,6,3,7};
        TreeNode_1 root=buildTree(postOrder,inOrder);
        System.out.println(root);
        _levelOrder(root);

    }

    private static void _levelOrder(TreeNode_1 root) {
    }

    public static TreeNode_1 buildTree(int[] postOrder, int[] inorder) {
        if (postOrder==null||inorder==null||postOrder.length!=inorder.length)return null;
        return _buildTree(postOrder,0,postOrder.length-1,inorder,0,inorder.length-1);

    }

    private static TreeNode_1 _buildTree(int[] postOrder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd) {
        if (postStart>postEnd||inStart>inEnd)return null;
        int data=postOrder[postEnd];
        TreeNode_1 root=new TreeNode_1(data);
        int offSet=inStart;
        for (; offSet <inEnd ; offSet++) {
            if (inorder[offSet]==data)break;
        }
        root.left=_buildTree(postOrder,postStart,postStart+offSet-inStart-1,inorder,inStart,offSet-1);
        root.right=_buildTree(postOrder,postStart+offSet-inStart,postEnd-1,inorder,offSet+1,inEnd);
        return root;
    }
}
