package session2;

import leetcode.TreeNode;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class TreeFromPostOrderAndInOrder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder==null||postorder==null||inorder.length!=postorder.length)return null;
        return _buildTree(postorder,0,postorder.length-1,inorder,0,inorder.length-1);
    }

    private TreeNode _buildTree(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd) {
        if (postStart>postEnd||inStart>inEnd)return null;
        int data=postorder[postEnd];
        TreeNode root=new TreeNode(data);
        int offSet=inStart;
        for (;offSet<inEnd;offSet++){
            if (inorder[offSet]==data)
                break;
        }
        root.left=_buildTree(postorder,postStart,postStart+offSet-inStart-1,inorder,inStart,offSet-1);
        root.right=_buildTree(postorder,postStart+offSet-inStart,postEnd,inorder,offSet+1,inEnd);
        return root;
    }
}
