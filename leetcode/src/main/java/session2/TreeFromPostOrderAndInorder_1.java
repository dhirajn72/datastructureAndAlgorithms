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
public class TreeFromPostOrderAndInorder_1 {

    public static void main(String[] args) {
        int[] postOrder={4,5,2,6,7,3,1};
        int[] inOrder={4,2,5,1,6,3,7};
        TreeNode_1 root=buildTree(inOrder,postOrder);
        System.out.println(root);
        _levelOrder(root);
    }

    public  static TreeNode_1 buildTree(int[] inorder, int[] postorder) {
        if (inorder==null||postorder==null||inorder.length!=postorder.length)return null;
        return _buildTree(postorder,0,postorder.length-1,inorder,0,inorder.length-1);
    }

    private static TreeNode_1 _buildTree(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd) {
        if (postStart>postEnd || inStart >inEnd)return null;
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
