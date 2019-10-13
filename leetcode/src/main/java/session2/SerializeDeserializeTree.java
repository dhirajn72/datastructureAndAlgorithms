package session2;

import leetcode.DataUtil;
import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 31/08/19
 */
public class SerializeDeserializeTree {

    public static void main(String[] args) {
        TreeNode root= DataUtil.getTreeData();
        String ser=serialize(root);
        System.out.println(ser);
        TreeNode des=deserialize(ser);
        System.out.println(root);
        System.out.println(des);
    }


    public static String serialize(TreeNode root) {
        if (root==null)return null;
        else {
            List<String> list=new ArrayList<>();
            Queue<TreeNode> q=new LinkedList<>();
            q.offer(root);
            while (!q.isEmpty()){
                TreeNode temp=q.poll();
                if (temp!=null){
                    list.add(String.valueOf(temp.val));
                    q.offer(temp.left);
                    q.offer(temp.right);
                }
                else {
                    list.add("#");
                }
            }
            return String.join(",",list);
        }
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        if (data==null)
            return null;
        String[] arr=data.split(",");
        if (arr[0].equals("#"))
            return null;
        TreeNode root=new TreeNode(Integer.valueOf(arr[0]));
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int i=1;
        while (!q.isEmpty()){
            TreeNode temp=q.poll();
            if (temp!=null){
                TreeNode left=null;
                if (!arr[i].equals("#")){
                    left=new TreeNode(Integer.valueOf(arr[i]));
                }
                temp.left=left;
                q.offer(left);
                i++;

                TreeNode right=null;
                if (!arr[i].equals("#")){
                    right=new TreeNode(Integer.valueOf(arr[i]));
                }
                temp.right=right;
                q.offer(right);
                i++;
            }
        }
        return root;
    }
}
