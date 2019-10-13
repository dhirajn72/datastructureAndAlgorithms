package session2;

import leetcode.DataUtil;
import leetcode.TreeNode;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class BuildTreeFromInorderAndPostOrder {

    public static void main(String[] args) {
        DataUtil.getTreeData();
        int[] postOrder={4,5,2,6,7,3,1};
        int[] inOrder={4,2,5,1,6,3,7};
        TreeNode root=buildTree(inOrder,postOrder);
        System.out.println(root);
        System.out.println(LevelOrder.levelOrder(root));
    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder==null ||inorder==null ||postorder.length!=inorder.length)
            return null;
        return _buildTree(postorder,0,postorder.length-1,inorder,0,inorder.length-1);
    }

    private static TreeNode _buildTree(int[] postOrder, int postStart, int postEnd, int[] inOrder, int inStart, int inEnd) {
        if (postStart>postEnd || inStart>inEnd)
            return null;
        int val=postOrder[postEnd];
        int offSet=inStart;
        TreeNode node=new TreeNode(val);
        for (;offSet<inEnd;offSet++){
            if (inOrder[offSet]==val)
                break;
        }
        node.left=_buildTree(postOrder,postStart,postStart+offSet-inStart-1,inOrder,inStart,offSet-1);
        node.right=_buildTree(postOrder,postStart+offSet-inStart,postEnd-1,inOrder,offSet+1,inEnd);
        return node;
    }
}
