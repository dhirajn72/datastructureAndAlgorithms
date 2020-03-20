package session2;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

/**
 * @author Dhiraj
 * @date 25/08/19
 */
public class BuildTreeFromInorderAndPreOrder {

    public static void main(String[] args) {
        int[] preorder = {1, 2, 4, 5, 3, 6, 7};
        int[] inorder = {4, 2, 5,1, 6, 3,7};

        DataUtil.getTreeData();
        TreeNode_1 root = buildTree(preorder, inorder);
        System.out.println(LevelOrder.levelOrder(root));
        System.out.println(root);
        System.out.println();
    }

    public static TreeNode_1 buildTree(int[] preorder, int[] inorder) {
       /* if (preorder==null ||inorder==null ||preorder.length!=inorder.length)return null;
        return _buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    private static TreeNode_1 _buildTree(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd) {
        if (preStart>preEnd || inStart >inEnd)
            return null;
        int data=preOrder[preStart];
        TreeNode_1 root=new TreeNode_1(data);
        int offSet=inStart;
        for (;offSet<inEnd;offSet++){
            if (inOrder[offSet]==data)
                break;
        }
        root.left=_buildTree(preOrder,preStart+1,preStart+offSet-inStart,inOrder,inStart,offSet-1);
        root.right=_buildTree(preOrder,preStart+offSet-inStart+1,preEnd,inOrder,offSet+1,inEnd);
        return root;
    }*/

       /*if (preorder==null||inorder==null||preorder.length!=inorder.length)return null;
       return _buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    private static TreeNode_1 _buildTree(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd) {
        if (preStart>preEnd ||inStart>inEnd)return null;

        int data=preOrder[preStart];
        TreeNode_1 root=new TreeNode_1(data);
        int offSet=inStart;
        for (;offSet<inEnd;offSet++){
            if (inOrder[offSet]==data)
                break;
        }
        root.left=_buildTree(preOrder,preStart+1,preStart+offSet-inEnd,inOrder,inStart,offSet-1);
        root.right=_buildTree(preOrder,preStart+offSet-inEnd+1,preEnd,inOrder,offSet+1,inEnd);
        return root;
    }*/

       if (inorder==null||preorder==null||inorder.length!=preorder.length)
           return null;
       return _buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);


}

    private static TreeNode_1 _buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart>preEnd||inStart>inEnd)
            return null;
        int data=preorder[preStart];
        TreeNode_1 root=new TreeNode_1(data);
        int offSet=inStart;
        for (;offSet<inEnd;offSet++){
            if (inorder[offSet]==data)
                break;
        }
        root.left=_buildTree(preorder,preStart+1,preStart+offSet-inStart,inorder,inStart,offSet-1);
        root.right=_buildTree(preorder,preStart+offSet-inStart+1,preEnd,inorder,offSet+1,inEnd);
        return root;
    }
}