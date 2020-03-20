package session2;

import leetcode.TreeNode_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 18/10/19
 */
public class TreeFromPreOrderAndInorder_1 {

    public static void main(String[] args) {
        int[] preOrder={1,2,4,5,3,6,7};
        int[] inOrder={4,2,5,1,6,3,7};
        TreeNode_1 root=buildTree(preOrder,inOrder);
        System.out.println(root);
        _levelOrder(root);
    }

    public  static TreeNode_1 buildTree(int[] inorder, int[] preorder) {
        if (inorder==null||preorder ==null||inorder.length!=preorder.length)return null;
        return _buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    private static TreeNode_1 _buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (inStart>inEnd||preStart>preEnd)return null;
        int data=preorder[preStart];
        TreeNode_1 root=new TreeNode_1(data);
        int offSet=inStart;
        for (;offSet<inEnd;offSet++){
            if (inorder[offSet]==data)break;
        }
        root.left=_buildTree(preorder,preStart+1,preStart+offSet-inStart,inorder,inStart,offSet-1);
        root.right=_buildTree(preorder,preStart+offSet-inStart+1,preEnd,inorder,offSet+1,inEnd);
        return root;
    }


    public static void _levelOrder(TreeNode_1 root){
        if (root==null)return;
        else {
            Queue<TreeNode_1> q=new LinkedList<>();
            q.offer(root);
            q.offer(null);
            List<Integer> integers=new ArrayList<>();
            List<List<Integer>> list=new ArrayList<>();
            while (!q.isEmpty()){
                TreeNode_1 temp=q.poll();
                if (temp!=null){
                    integers.add(temp.val);
                    if (temp.left!=null)
                        q.offer(temp.left);
                    if (temp.right!=null)
                        q.offer(temp.right);
                }
                else {
                    list.add(new ArrayList<>(integers));
                    if (!q.isEmpty())
                        q.offer(null);
                    integers.clear();
                }
            }
            System.out.println(list);
        }

    }

}
