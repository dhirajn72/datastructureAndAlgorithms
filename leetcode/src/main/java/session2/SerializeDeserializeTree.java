package session2;

import leetcode.DataUtil;
import leetcode.TreeNode_1;

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
        TreeNode_1 root= DataUtil.getTreeData();
        String ser=serialize(root);
        System.out.println(ser);
        TreeNode_1 des=deserialize(ser);
        System.out.println(root);
        System.out.println(des);
    }


    public static String serialize(TreeNode_1 root) {
        if (root==null)return null;
        else {
            List<String> list=new ArrayList<>();
            Queue<TreeNode_1> q=new LinkedList<>();
            q.offer(root);
            while (!q.isEmpty()){
                TreeNode_1 temp=q.poll();
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
    public static TreeNode_1 deserialize(String data) {
        if (data==null)
            return null;
        String[] arr=data.split(",");
        if (arr[0].equals("#"))
            return null;
        TreeNode_1 root=new TreeNode_1(Integer.valueOf(arr[0]));
        Queue<TreeNode_1> q=new LinkedList<>();
        q.offer(root);
        int i=1;
        while (!q.isEmpty()){
            TreeNode_1 temp=q.poll();
            if (temp!=null){
                TreeNode_1 left=null;
                if (!arr[i].equals("#")){
                    left=new TreeNode_1(Integer.valueOf(arr[i]));
                }
                temp.left=left;
                q.offer(left);
                i++;

                TreeNode_1 right=null;
                if (!arr[i].equals("#")){
                    right=new TreeNode_1(Integer.valueOf(arr[i]));
                }
                temp.right=right;
                q.offer(right);
                i++;
            }
        }
        return root;
    }
}
